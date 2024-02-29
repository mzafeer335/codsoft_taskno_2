package sgcpkg;

import java.util.Scanner;

public class Sudent_Grade_Calculator {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Marks of 5 Subjects you obtain in your exam..." +"\n");
		 System.out.println("Enter the marks of Subject 1: " );
		 int a = sc.nextInt();
		 System.out.println("Enter the marks of Subject 2: " );
		 int b = sc.nextInt();
		 System.out.println("Enter the marks of Subject 3: "  );
		 int c = sc.nextInt();
		 System.out.println("Enter the marks of Subject 4: "  );
		 int d = sc.nextInt();
		 System.out.println("Enter the marks of Subject 5: "  );
		 int e = sc.nextInt();
		 
		 float total = a+b+c+d+e;
		 
		 System.out.println("Total Marks of 5 Subjects: " +total);
		 
		 float avg = total/5;
		 
		 System.out.println("Average percentage of 5 Subjects: " +avg +" %");
		 
		 String Grade;
		 
		 if(avg >= 85) {
			 Grade = "A";
		 }
		 else if(avg >= 75) {
			 Grade = "B";
		 }
		 else if(avg >= 65) {
			 Grade = "C";
		 }
		 else if(avg >= 55) {
			 Grade = "D";
		 }
		 else {
			 Grade = "F";
		 }
		 
		 System.out.println("Grade obtained by the Student: " +Grade);

	}

}
