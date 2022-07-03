package entities;

public class Student {
	
	public String name;
	public Double gradeOne;
	public Double gradeTwo;
	public Double gradeThree;
	
	public double FinalGrade() {
		return gradeOne + gradeTwo + gradeThree;
	}
	
	public double Missing() {
		return 60.0 - FinalGrade();
	}
	
}
