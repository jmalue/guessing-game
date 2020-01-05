import java.util.Scanner;

import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Pick a number");
		int numberGuessed = input.nextInt();
		int secretNum = ThreadLocalRandom.current().nextInt(1, 11);
		// did 11 instead of 10 to keep 10 inclusive
		int attempts = 0;
		// System.out.println(secretNum);

		// loop

		do {
			if (numberGuessed == secretNum) {
				System.out.println("You win!!!");
			}
			if (numberGuessed == 7) {
				System.out.println("You won!");
				System.exit(0);
			} else if (numberGuessed == -1) {
				System.exit(0);
			} else if (numberGuessed == 0) {
				System.out.println("Pick a number between 1 and 10. Try again.");
			} else if ((numberGuessed >= 1) && (numberGuessed <= 6)) {
				System.out.println("Secrect Number is > than number chosen.");
			} else if ((numberGuessed >= 8) && (numberGuessed <= 10)) {
				System.out.println("Secrect Number is < than number chosen.");
			} else {
				System.out.println("You lose but try one more time.");
			}
			int numberGuessed1 = input.nextInt();
			if (numberGuessed1 != 7) {
				System.out.println("You lose!");
			} else if (numberGuessed1 == 7) {
				System.out.println("You win!");
			}
			attempts += 1;

		} while (attempts < 3);
		System.out.println("No more attempts, you are done!");
		input.close();

	}
}