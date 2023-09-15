package practice.hostelManagementSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Hostel {
    private final int TOTAL_ROOMS;
    private final int BEDS_PER_ROOM;

    private int fullyOccupiedRoomCount = 0;
    private int studentsInHostelCount = 0;

    private final Stack<Integer> availableRoomNosStack = new Stack<>();
    private final Map<Integer, Room> roomsMap = new HashMap<>();

    private final Map<String, String> studentIdToRoomBedMap = new HashMap<>();

    public Hostel(int numberOfRooms, int bedsPerRoom) {
        TOTAL_ROOMS = numberOfRooms;
        BEDS_PER_ROOM = bedsPerRoom;
        for (int i = 0; i < numberOfRooms; i++) {
            roomsMap.put(i + 1, new Room(bedsPerRoom));
            availableRoomNosStack.push(numberOfRooms - i);
        }
    }

    public String addStudent(String studentId) {
        if (studentIdToRoomBedMap.containsKey(studentId)) {
            String[] roomBedInfo = studentIdToRoomBedMap.get(studentId).split("-");
            System.out.printf("Student with ID '%s' already present in Room %s at bed %s.\n", studentId, roomBedInfo[0], roomBedInfo[1]);
            return null;
        }
        if (isBedAvailable()) {
            int roomNo = availableRoomNosStack.peek();
            Room room = roomsMap.get(roomNo);
            int bedNo = room.addStudent(studentId);
            if (bedNo != -1) {
                String roomBedInfo = String.format("%s-%s", roomNo, bedNo);
                studentIdToRoomBedMap.put(studentId, roomBedInfo);
                studentsInHostelCount++;
                System.out.println("Students in hostel increased to: " + getStudentsInHostelCount());
//                System.out.printf("Student with ID %s added to Room %s at Bed %s.\n", studentId, roomNo, bedNo);
                if (!room.isBedAvailable()) {
                    fullyOccupiedRoomCount++;
                    availableRoomNosStack.pop();
                    System.out.println("Rooms fully occupied in hostel increased to: " + getFullyOccupiedRoomCount() + "\n");
                }
                return roomBedInfo;
            }
            System.out.println("Couldn't add student due to unknown errors.");
        } else
            System.out.println("Sorry, no beds available!");
        return null;
    }

    public String addStudent(Student student) {
        return addStudent(student.getId());
    }

    public boolean removeStudent(String studentId) {
        if (studentIdToRoomBedMap.containsKey(studentId)) {
            String[] roomBedInfo = studentIdToRoomBedMap.get(studentId).split("-");
            int roomNo = Integer.parseInt(roomBedInfo[0]);
            int bedNo = Integer.parseInt(roomBedInfo[1]);
            Room room = roomsMap.get(roomNo);
            boolean studentRemoved = room.removeStudent(bedNo);
            if (studentRemoved) {
                studentIdToRoomBedMap.remove(studentId);
                studentsInHostelCount--;
                System.out.printf("Student with ID %s removed from Room %s - Bed %s.\n", studentId, roomNo, bedNo);
                System.out.println("Students in hostel decreased to: " + getStudentsInHostelCount());
                if (room.getVacantBedCount() == 1) {
                    fullyOccupiedRoomCount--;
                    System.out.println("Rooms fully occupied in hostel decreased to: " + getFullyOccupiedRoomCount() + "\n");
                    availableRoomNosStack.push(roomNo);
                }
                return true;
            }
        }
        System.out.printf("Student with ID %s not present in this hostel.\n", studentId);
        return false;
    }

    public boolean removeStudent(Student student) {
        return removeStudent(student.getId());
    }

    public String locateStudent(String studentId) {
        if (studentIdToRoomBedMap.containsKey(studentId)) {
            String[] roomBedInfo = studentIdToRoomBedMap.get(studentId).split("-");
            return String.format("Room %s - Bed %s.", roomBedInfo[0], roomBedInfo[1]);
        }
        return null;
    }

    public String locateStudent(Student student) {
        return locateStudent(student.getId());
    }

    public boolean isBedAvailable() {
        return fullyOccupiedRoomCount < TOTAL_ROOMS;
    }

    public int getFullyOccupiedRoomCount() {
        return fullyOccupiedRoomCount;
    }

    public int getTotalRooms() {
        return TOTAL_ROOMS;
    }

    public int getBedsPerRoom() {
        return BEDS_PER_ROOM;
    }

    public int getTotalBeds() {
        return TOTAL_ROOMS * BEDS_PER_ROOM;
    }

    public int getStudentsInHostelCount() {
        return studentsInHostelCount;
    }

    public void showHostelStudentsData() {
        System.out.println("-------------------------------------------");
        System.out.printf("|  %-12s||  %-10s||  %-9s|\n", "Student ID", "Room No.", "Bed No.");
        System.out.println("|--------------||------------||-----------|");
        for (Map.Entry<String, String> studentEntry : studentIdToRoomBedMap.entrySet()) {
            String[] roomBedInfo = studentEntry.getValue().split("-");
            System.out.printf("|  %-12s||  %-10s||  %-9s|\n", studentEntry.getKey(), roomBedInfo[0], roomBedInfo[1]);
        }
        System.out.println("-------------------------------------------");
    }
}
