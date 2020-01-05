import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pick a number");
		int numberGuessed = input.nextInt();
		
		if(numberGuessed == 7) {
			System.out.println("You won!");
			System.exit(0);
		}
		else if(numberGuessed == -1){
			System.exit(0);
		}
		else if(numberGuessed == 0){
	System.out.println("Pick a number between 1 and 10. You get one more pick.");
        }
		else if((numberGuessed >=1) && (numberGuessed <=6)) {
		     System.out.println("Secrect Number is > than number chosen.");
	    }
         else if((numberGuessed >=8) && (numberGuessed <=10)) {
		     System.out.println("Secrect Number is < than number chosen.");
         }
			else {
				System.out.println("You lose but try one more time.");
	}
		int numberGuessed1 = input.nextInt();
		if(numberGuessed1 != 7)
		{	System.out.println("You lose!");
		}	
		else if (numberGuessed1 == 7) {
			System.out.println("You win!");
		}
			
		
		input.close();
		
		}
	
}

