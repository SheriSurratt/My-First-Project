import java.util.Scanner;

public class ifElsePractice {

	public static void main(String[] args) {
		
		int secretNumber;
			int guess;
			boolean correct = false;
			
			Scanner keyboard = new Scanner(System.in);
			System.out.print("GIVE ME YOUR SECRET NUMBER! (between 1 too 100 >> ");
			secretNumber = keyboard.nextInt();
			
			while (!correct) {
				
				System.out.println("> 5 away: ");
				guess = keyboard.nextInt();
				
				if (guess == 100) {
					correct = true;
					System.out.println("Oh SO CLOSE!");
				}
				else if (guess < 8) {
					System.out.println("HIGHER");
				}
				else if (guess > 8) {
					System.out.println("LOWER");
				}
				}
			
}

}
