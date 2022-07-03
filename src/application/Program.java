package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();

		System.out.println("Name: ");
		student.name = sc.nextLine();
		student.gradeOne = sc.nextDouble();
		student.gradeTwo = sc.nextDouble();
		student.gradeThree = sc.nextDouble();

		System.out.print("FINAL GRADE = " + student.FinalGrade());
		System.out.println();

		if (student.FinalGrade() > 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.println("MISSING " + student.Missing() + " POINTS ");
		}

		sc.close();

	}

}
