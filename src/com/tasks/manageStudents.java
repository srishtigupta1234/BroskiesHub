package com.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{
	int id;
	String name;
	String grade;
	public Student(int id, String name, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}
	public Student() {
		super();
	}
	
	
}
public class manageStudents {
	  private List<Student> students = new ArrayList<>();

	    public void addStudent(int id, String name, String grade) {
	        students.add(new Student(id, name, grade));
	        System.out.println("✅ Student added successfully!");
	    }

	    public void removeStudent(int id) {
	        boolean removed = students.removeIf(s -> s.id == id);
	        if (removed) {
	            System.out.println("✅ Student removed successfully!");
	        } else {
	            System.out.println("❌ No student found with ID: " + id);
	        }
	    }

	    public void displayStudents() {
	        if (students.isEmpty()) {
	            System.out.println("No students to display.");
	        } else {
	            for (Student s : students) {
	                System.out.println(s);
	            }
	        }
	    }
	public static void main(String[] args) {
		 manageStudents ms = new manageStudents();
	        Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.println("\n--- Student Management Menu ---");
	            System.out.println("1. Add Student");
	            System.out.println("2. Remove Student");
	            System.out.println("3. Display Students");
	            System.out.println("4. Exit");
	            System.out.print("Enter choice: ");
	            int choice = sc.nextInt();
	            sc.nextLine(); // consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter ID: ");
	                    int id = sc.nextInt();
	                    sc.nextLine();
	                    System.out.print("Enter Name: ");
	                    String name = sc.nextLine();
	                    System.out.print("Enter Grade: ");
	                    String grade = sc.nextLine();
	                    ms.addStudent(id, name, grade);
	                    break;
	                case 2:
	                    System.out.print("Enter ID to remove: ");
	                    int removeId = sc.nextInt();
	                    ms.removeStudent(removeId);
	                    break;
	                case 3:
	                    ms.displayStudents();
	                    break;
	                case 4:
	                    System.out.println("Exiting... Bye!");
	                    sc.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice! Try again.");
	            }
	        }
		

	}

}
