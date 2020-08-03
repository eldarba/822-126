package a.homework;

public class Tar4 {
	public static void main(String[] args) {
		// 20 students, 10 grades per student
		int students = 20;
		int grades = 10;

		int[][] gradesMatrix = new int[students][grades];

		for (int student = 0; student < gradesMatrix.length; student++) {
			System.out.println("student: " + student);
			for (int grade = 0; grade < gradesMatrix[student].length; grade++) {
				gradesMatrix[student][grade] = (int) (Math.random() * 101);
				System.out.print(gradesMatrix[student][grade] + "\t");
			}
			System.out.println();
		}
	}

}
