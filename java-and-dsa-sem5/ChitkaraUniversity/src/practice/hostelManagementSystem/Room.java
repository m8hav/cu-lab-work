package practice.hostelManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class Room {
    private static int TOTAL_BEDS;
    private int occupiedBeds = 0;
    private final Map<Integer, String> bedsToStudentIdMap = new HashMap<>();

    public Room(int beds) {
        TOTAL_BEDS = beds;
        for (int i = 0; i < beds; i++) {
            bedsToStudentIdMap.put(i + 1, null);
        }
    }

    public int addStudent(String studentId) {
        if (isBedAvailable()) {
            for (Integer bedNo : bedsToStudentIdMap.keySet()) {
                if (bedsToStudentIdMap.get(bedNo) == null) {
                    bedsToStudentIdMap.put(bedNo, studentId);
                    occupiedBeds++;
                    return bedNo;
                }
            }
        }
        return -1;
    }

    public int addStudent(Student student) {
        return addStudent(student.getId());
    }

    public boolean removeStudent(int bedNo) {
        if (bedsToStudentIdMap.get(bedNo) != null) {
            bedsToStudentIdMap.put(bedNo, null);
            occupiedBeds--;
            return true;
        }
        return false;
    }

    public int getVacantBedCount() {
        return TOTAL_BEDS - occupiedBeds;
    }

    public boolean isBedAvailable() {
        return occupiedBeds < TOTAL_BEDS;
    }
}