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
		else if(numberGuessed == 0){
	System.out.println("Pick a number");
}
			else {
				System.out.println("Guess a number between 1 - 10. ");
			}
			
		input.close();
		
	}

}
