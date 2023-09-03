import java.io.*;
import java.util.*;
//**//

/**
 * @author CSE2019-23
 *
 */
public class Student 
{
	private String name;
	private int rollNumber;
	private String grade;
	private int mathScore;
	private int scienceScore;
	private int socialScore;
	private int englishScore;
	private int rank;
	private String motherName;
	private String fatherName;
	private String city;
	
	public Student(String name, int rollNumber, String grade, int mathScore, int scienceScore,int socialScore, int englishScore, int rank, String motherName, String fatherName, String city)
	{
		this.name = name;
		this.rollNumber = rollNumber;
		this.grade = grade;
		this.mathScore = mathScore;
		this.scienceScore=scienceScore;
		this.socialScore = socialScore;
		this.englishScore = englishScore;
		this.rank = rank;
		this.motherName = motherName;
		this.fatherName = fatherName;
		this.city =city;
	}
	
	public void displayInfo()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll Number: "+rollNumber);
		System.out.println("Grade: "+grade);
		System.out.println("Math score: "+mathScore);
		System.out.println("Science score: " +scienceScore);
		System.out.println("Social score: " +socialScore);
		System.out.println("English score: "+englishScore);
		System.out.println("Rank: "+rank);
		System.out.println("Mother's name: "+motherName);
		System.out.println("Father's name: " +fatherName);
		System.out.println("City: "+city);
	}

	public int getRollNumber() {
		// TODO Auto-generated method stub
		return rollNumber;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public int getMathScore() {
		// TODO Auto-generated method stub
		return mathScore;
	}

	public int getScienceScore() {
		// TODO Auto-generated method stub
		return scienceScore;
	}

	public int getSocialScore() {
		return socialScore;
		// TODO Auto-generated method stub
		
	}

	public int getRank() {
		return rank;
		// TODO Auto-generated method stub
		
	}

	public int getEnglishScore() {
		return englishScore;
		// TODO Auto-generated method stub
		
	}

	public String getMotherName() {
		return motherName;
		// TODO Auto-generated method stub
		
	}

	public String getFatherName() {
		return fatherName;
		// TODO Auto-generated method stub
		
	}

	public String getCity() {
		return city;
		// TODO Auto-generated method stub
		
	}

	public String getGrade() {
		return grade;
		// TODO Auto-generated method stub
		
	}

}
