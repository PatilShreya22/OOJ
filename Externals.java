package SEE;
import java.util.Scanner;
import CIE.Internals;
public class Externals extends Internals{
	public int marks[]=new int[5];
	public int finalMarks[]=new int[5];

	public void getSEEMarks(){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++){
			System.out.println("Enter "+(i+1)+" marks:");
			marks[i]=sc.nextInt();
		}
	}

	public void calculateFinalMarks(){
		for(int i=0;i<5;i++){
			finalMarks[i]=marks[i]/2+super.marks[i];
		}
	}

	public void displayFinalMarks(){
		for(int i=0;i<5;i++){
			System.out.println("Marks of "+(i+1)+" subject:"+finalMarks[i]);
		}
	}
}