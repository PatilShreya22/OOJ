//Develop a java program to create a class Student with members usn,name, an array creadits and an array marks. Include methods to accept and display details and a method to calculate SGPA of a student
import java.util.Scanner;
class Student{
	String name;
	String usn;
	double SGPA;
	Subject subject[];
	Scanner s;

	Student(){
		int i;
		subject=new Subject[9];
		for(i=0;i<9;i++){
			subject[i]=new Subject();
			s=new Scanner(System.in);
		}
		
	}

	void getStudentDetails(){
		System.out.println("Enter your Name:");
		name=s.next();
		System.out.println("Enter your USN:");
		usn=s.next();
	}

	void getMarks(){
		for(int i=0;i<9;i++){
			System.out.println("Enter marks for subject "+(i+1)+":");
			subject[i].subjectMarks=s.nextInt();
			System.out.println("Enter credits for subject "+(i+1)+":");
			subject[i].credits=s.nextInt();
			
			subject[i].grade=(subject[i].subjectMarks/10)+1;
			
			if (subject[i].grade==11){
				subject[i].grade=10;
			}
			if (subject[i].grade<=4){
				subject[i].grade=0;
			}
			
		}
	}

	void computeSGPA(){
		int effectiveScore=0;
		int totalCreadits=0;
		
		for(int i=0;i<9;i++){
			effectiveScore += (subject[i].grade*subject[i].credits);
			totalCreadits += subject[i].credits;
		}

		SGPA=(double)effectiveScore/(double)totalCreadits;
	}
}