import java.io.*;
import java.util.*;
/**
 * 
 */

/**
 * @author CSE2019-23
 *
 */
public class Main 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StudentManagementSystem sms = new StudentManagementSystem();
		
		while(true)
		{
			System.out.println("Student Management System");
			System.out.println("1.Add Student.");
			System.out.println("2.Display all Student details.");
			System.out.println("3.Search the Student.");
			System.out.println("4.Remove the Student.");
			System.out.println("5. Exit");
			System.out.println("Enter your choice: ");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter student name: ");
				String name = sc.nextLine();
				System.out.println("Enter roll number: ");
				int rollNumber = sc.nextInt();
				System.out.println("Enter Grade: ");
				String grade = sc.nextLine();
				
				System.out.println("Enter Math score(out of 100):");
				int mathScore = sc.nextInt();
				System.out.println("Enter Science score(out of 100):");
				int scienceScore = sc.nextInt();
				System.out.println("Enter Social score(out of 100):");
				int socialScore = sc.nextInt();
				System.out.println("Enter English score(out of 100):");
				int englishScore = sc.nextInt();
				
				System.out.println("Enter rank:");
				int rank = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Mother's name: ");
				String motherName = sc.nextLine();
				System.out.println("Enter Father's name: ");
				String fatherName = sc.nextLine();
				System.out.println("Enter city: ");
				String city = sc.nextLine();
				
				Student student = new Student(name, rollNumber, grade, mathScore, scienceScore, socialScore, englishScore, rank, motherName, fatherName, city);
				sms.addStudent(student);
				System.out.println("Student added successfully!");
				break;
				
			case 2:
				sms.displayAllStudents();
				break;
			
			case 3:
				System.out.println("Enter roll number to search: ");
				int searchRollNumber = sc.nextInt();
				sc.nextLine();
				Student searchedStudent = sms.searchStudent(searchRollNumber);
				if(searchedStudent != null)
				{
					searchedStudent.displayInfo();
				}
				else
				{
					System.out.println("Student not found in the system.");
				}
				break;
				
			case 4:
				System.out.println("Enter roll number to remove: ");
				int removeRollNumber = sc.nextInt();
				sc.nextLine();
				boolean removed = sms.removeStudent(removeRollNumber);
				if(removed)
				{
					System.out.println("Student removed successfully!");
				}
				else
				{
					System.out.println("Student not found.");
				}
				break;
				
			case 5:
				sms.saveStudentData();
				System.out.println("Exit the system.");
				System.exit(0);
				break;
			
			default:
				System.out.println("Invalid option selected. Please choose a valid option!");
			}
		}
		
	}

}
