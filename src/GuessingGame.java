import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		System.out.println("Pick a number");
		int numberGuessed = input.nextInt();
		if(numberGuessed == 7) {
			System.out.println("You won!");
		}
			else {
				System.out.println("you lost!");
			}
		
	

		
		
		
		input.close();
		
	}
}

