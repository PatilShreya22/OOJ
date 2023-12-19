class Main{
	public static void main(String args[]){
		Student s1=new Student();
		s1.getStudentDetails();
		s1.getMarks();
		s1.computeSGPA();

		System.out.println("Name:"+s1.name);
		System.out.println("USN:"+s1.usn);
		System.out.println("SGPA :"+s1.SGPA);
	}
} 