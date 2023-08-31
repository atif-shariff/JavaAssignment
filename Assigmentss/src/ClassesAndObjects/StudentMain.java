package ClassesAndObjects;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		Student student = new Student();
		System.out.println("Enter the Department of Student 1: ");
		student.department=in.next();
		System.out.println("Enter the Name of Student 1: ");
		student.name=in.next();
		int Marks[] = new int[5];
		
		System.out.println("Enter the Marks of student 1 :");
		for(int i=0;i<Marks.length;i++) {
			Marks[i]=in.nextInt();
		}
		student.printDetails();
		String Grade = student.getGrades(Marks);
		System.out.println("Grade: "+Grade);
		
		
		
		
		Student student1 = new Student();
		System.out.println("Enter the Department of Student 2: ");
		student1.department=in.next();
		
		System.out.println("Enter the name of Student 2: ");
		student1.name=in.next();
		int Marks1[] = new int[5];
		
		System.out.println("Enter the Marks of student 2: ");
		for(int i=0;i<Marks1.length;i++) {
			Marks1[i]=in.nextInt();
		}
		student1.printDetails();
		String Grade1= student1.getGrades(Marks1);
		System.out.println("Grade: "+Grade1);
		
		
		
		in.close();
	}

}
