package ClassesAndObjects;

public class Student {
	String name;
	String department;
	
	
	void printDetails() {
		System.out.println("Student Name:"+name);
		System.out.println("Student Department: "+department);
	}
	
	String getGrades(int...Marks) {
		int sum=0;
		int Avg=0;
		for(int i =0;i<Marks.length;i++) {
			sum+= Marks[i];
		}
		
		for(int i =0;i<Marks.length;i++) {
			Avg= sum/Marks.length;
		}
		
		if(Avg>90 && Avg<=100) {
			return "A";
		}
		else if(Avg>80 && Avg<=90) {
			return "B";
		}
		else if(Avg>70 && Avg<=80) {
			return "C";
		}
		else if(Avg>=60 && Avg<=70) {
			return "D";
		}
		else if(Avg>50 && Avg<=59) {
			return "E";
		}
		return "fail";
	}

}
