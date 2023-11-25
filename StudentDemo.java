import java.util.Scanner;
class Student {
    private String name;
    private int age;
    private int rollNo;

    public Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Student 1:");
        System.out.print("Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Age: ");
        int age1 = scanner.nextInt();
        System.out.print("Roll No: ");
        int rollNo1 = scanner.nextInt();

        System.out.println("\nEnter details for Student 2:");
        scanner.nextLine(); // Clear the newline character
        System.out.print("Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Age: ");
        int age2 = scanner.nextInt();
        System.out.print("Roll No: ");
        int rollNo2 = scanner.nextInt();

        Student student1 = new Student(name1, age1, rollNo1);
        Student student2 = new Student(name2, age2, rollNo2);

        System.out.println("\nStudent 1:");
        student1.displayInfo();

        System.out.println("\nStudent 2:");
        student2.displayInfo();

        scanner.close();
    }
}

