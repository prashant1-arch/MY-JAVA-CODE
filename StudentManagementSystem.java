import java.util.*;

class Student {
    private int roll;
    private String name;
    private int age;
    private String course;

    public Student(int roll, String name, int age, String course) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getRoll() {
        return roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void display() {
        System.out.println(roll + "\t" + name + "\t" + age + "\t" + course);
    }
}

public class StudentManagementSystem {
    static ArrayList<Student> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewStudent(); break;
                case 3: searchStudent(); break;
                case 4: updateStudent(); break;
                case 5: deleteStudent(); break;
                case 6: System.out.println("Thank You!"); break;
                default: System.out.println("Invalid Choice!");
            }
        } while (choice != 6);
    }

    static void addStudent() {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        list.add(new Student(roll, name, age, course));
        System.out.println("Student Added Successfully!");
    }

    static void viewStudent() {
        System.out.println("\nRoll\tName\tAge\tCourse");
        for (Student s : list) {
            s.display();
        }
    }

    static void searchStudent() {
        System.out.print("Enter Roll No to Search: ");
        int roll = sc.nextInt();

        for (Student s : list) {
            if (s.getRoll() == roll) {
                s.display();
                return;
            }
        }
        System.out.println("Student Not Found!");
    }

    static void updateStudent() {
        System.out.print("Enter Roll No to Update: ");
        int roll = sc.nextInt();
        sc.nextLine();

        for (Student s : list) {
            if (s.getRoll() == roll) {
                System.out.print("Enter New Name: ");
                s.setName(sc.nextLine());

                System.out.print("Enter New Age: ");
                s.setAge(sc.nextInt());
                sc.nextLine();

                System.out.print("Enter New Course: ");
                s.setCourse(sc.nextLine());

                System.out.println("Student Updated Successfully!");
                return;
            }
        }
        System.out.println("Student Not Found!");
    }

    static void deleteStudent() {
        System.out.print("Enter Roll No to Delete: ");
        int roll = sc.nextInt();

        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.getRoll() == roll) {
                it.remove();
                System.out.println("Student Deleted!");
                return;
            }
        }
        System.out.println("Student Not Found!");
    }
}
