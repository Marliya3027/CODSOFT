import java.io.*;
import java.util.*;/**
 * 
 */

/**
 * @author CSE2019-23
 *
 */
public class StudentManagementSystem 
{
	private List<Student> students;
	private static final String DATA_FILE = "student_data.txt";
	
	public StudentManagementSystem() 
	{
		students = new ArrayList<>();
		readStudentData();
	}
	
	public void addStudent(Student student)
	{
		students.add(student);
	}
	public boolean removeStudent(int rollNumber)
	{
		for(Student student:students)
		{
			if(student.getRollNumber() == rollNumber)
			{
				students.remove(students);
				return true;
			}
		}
		return false;
	}
	public Student searchStudent(int rollNumber)
	{
		for(Student student : students)
		{
			if(student.getRollNumber()==rollNumber)
			{
				return student;
			}
		}
		return null;
	}
	public void displayAllStudents()
	{
		for(Student student:students)
		{
			student.displayInfo();
			System.out.println("-----------------------------------");
		}
	}
	public void saveStudentData()
	{
		try(PrintWriter writer = new PrintWriter(new FileWriter(DATA_FILE)))
		{
			for(Student student : students)
			{
				writer.println(student.getName() + "," +student.getRollNumber() + "," + student.getGrade() + ","  +student.getMathScore() + "," +student.getScienceScore() + "," + student.getSocialScore() + "," +student.getEnglishScore() + "," +student.getRank() + "," + student.getMotherName() + "," + student.getFatherName() + "," + student.getCity());
				
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public void readStudentData()
	{
		try(BufferedReader reader = new BufferedReader(new FileReader(DATA_FILE)))
		{
			String line;
			while((line = reader.readLine()) != null)
			{
				String[] parts = line.split(",");
				if(parts.length == 11)
				{
				String name = parts[0];
				int rollNumber = Integer.parseInt(parts[1]);
				String grade = parts[2];
				int mathScore = Integer.parseInt(parts[3]);
				int scienceScore = Integer.parseInt(parts[4]);
				int socialScore = Integer.parseInt(parts[5]);
				int englishScore = Integer.parseInt(parts[6]);
				int rank = Integer.parseInt(parts[7]);
				String motherName = parts[8];
				String fatherName = parts[9];
				String city = parts[10];
				
				Student student = new Student(name, rollNumber, grade, mathScore, scienceScore, socialScore, englishScore, rank, motherName, fatherName, city);
				students.add(student);
				}
				else
				{
					System.err.println(""+line);
				}
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
