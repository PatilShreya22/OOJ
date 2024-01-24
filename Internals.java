package CIE;
import java.util.Scanner;
public class Internals extends Student{
	public int marks[]=new int[5];
	public void getCIEMarks(){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++){
			System.out.print("Enter "+(i+1)+" marks:");
			marks[i]=sc.nextInt();
		}		
	}
}