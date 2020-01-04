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
	System.out.println("Pick a number between 1 and 10.");
}
			else 
				System.out.println("You lose");
		
		else if(numberGuessed != 7){
			System.out.println("Try one more time");
		
			
		
		input.close();
		
	}

}
