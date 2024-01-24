package CIE;
import java.util.Scanner;
public class Student{
	public String usn,name;
	public int sem;
	
	public void getStudentInfo(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter student usn:");
		usn=sc.nextLine();
		System.out.print("Enter student name:");
		name=sc.nextLine();
		System.out.print("Enter student semester:");
		sem=sc.nextInt();
	}

	public void display(){
		System.out.println("Student Name:"+name);
		System.out.print("Student USN:"+usn);
		System.out.print("Semester:"+sem);
	}
}