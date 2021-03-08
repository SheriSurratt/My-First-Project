package numberGrade;


import java.util.Scanner;

public class numberGrade {

	public static void main(String[] args) {
		
		int numberGrade;
			int guess;
			boolean correct = false;
			
			Scanner keyboard = new Scanner(System.in);
			System.out.print("NUMBER GRADE ANSWER!: ");
			numberGrade = keyboard.nextInt();
			
			while (!correct) {
				
				System.out.println("ANSWER: ");
				guess = keyboard.nextInt();
				
				if (guess == 60) {
					correct = true;
					System.out.println("YOU PASSED!");
				}
				else if (guess < 60) {
					System.out.println("TAKE ANOTHER CLASS!");
				}
				else if (guess > 60) {
					System.out.println("LOWER");
				}
				}
			
				
		
			
	}

}
