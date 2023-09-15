package practice.hostelManagementSystem;

public class HMMain {
    public static void main(String[] args) {
        Hostel hostel1 = new Hostel(100, 2);

//        System.out.println("Number of rooms in hostel: " + hostel1.getTotalRooms());
//        System.out.println("Number of beds per room in hostel: " + hostel1.getBedsPerRoom());
//        System.out.println("Number of beds in hostel: " + hostel1.getTotalBeds());

        Student student1 = new Student("Madhav Goyal", 5);
        hostel1.addStudent(student1);

        Student student2 = new Student("Bart", 3);
        hostel1.addStudent(student2);

        for (int i = 1; i <= 5; i++) {
            hostel1.addStudent(new Student("Person " + i, i%8 + 1));
        }

        hostel1.showHostelStudentsData();

        System.out.println("Number of students in hostel: " + hostel1.getStudentsInHostelCount());
//        System.out.println("Is bed available in hostel: " + hostel1.isBedAvailable());

        System.out.println("Removing student with ID STU3: " + hostel1.removeStudent("STU3"));

        System.out.println("Rooms fully occupied in hostel: " + hostel1.getFullyOccupiedRoomCount());

        hostel1.showHostelStudentsData();
    }
}
