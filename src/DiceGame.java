import java.util.Random;
import java.util.Scanner;

public class DiceGame {

	
	static double enterMoney = betOnRoll();
	static double winnings;
	
	public static void main(String[] args) {
		  int point = 0;
		  menu(point);
	}
	
	public static double betOnRoll() {
		Scanner scan = new Scanner(System.in);
		System.out.println("How much money you want to bet? Must start with at least $10 ");
		double enterMoney = scan.nextInt();
		System.out.println("Your bet is 10% of what you entered");
		return enterMoney;
	}
	
	public static int menu(int point) {
		boolean playAgain = false;
		while(!playAgain) {
			point = sumOfTwoDiceRolls();

			Scanner scan = new Scanner(System.in);
			System.out.println();
			System.out.println("Would you like to play Dice?");
			String userInput = scan.nextLine();
			System.out.println();
			if(enterMoney < 10) {
				System.out.println("You cant play without any money!");
				enterMoney = betOnRoll();
				continue;
			}else if (userInput.equalsIgnoreCase("Yes")) {
				
				String message = rollEm(point);
				System.out.println(message);
				}else if (userInput.equalsIgnoreCase("No")){ 
				System.out.println("Thanks for playing");
				break;
			}
		}return point;
	}
	
	public static int rollDice() {
		return 1 + (int)(Math.random() * 6);
	}

	public static int sumOfTwoDiceRolls() {
		int roll = rollDice() + rollDice();
		return roll;
	}

	public static String rollEm(int point) {
		String message = "";
		double bet = enterMoney * .1;
		double winnings;
		double lose;
		if(point == 7 || point == 11) {
			System.out.println("You rolled " + point );
			 winnings = bet * 3;
			 message = "Winner Winner Chicken Dinner!";
			 System.out.println();
			 System.out.println(  "You won: " + winnings+ " Your new totoal is " + (winnings + enterMoney));
			 enterMoney = enterMoney + winnings;
			 return message;
		}
		if(point == 2 || point == 3 || point == 12) {
			System.out.println("You rolled " + point );
			System.out.println();
			lose = bet * 4;
			message = "You just lost all your money! This game is over!";
			System.out.println(   "You lost: " + lose+ " Your new totoal is " + (enterMoney - lose));
			enterMoney = enterMoney - lose;
			return message;
		}
		else { 
			
			boolean gameOver = false;
			while(!gameOver) {
				System.out.println(" Your point is: " +point+ " You get to roll again dont roll a 7 or 11!");
				int nextRoll = sumOfTwoDiceRolls();
				System.out.println("You rolled " + nextRoll );

				if(nextRoll == point) {
					winnings = bet * 1.5;
					message = "Your New Roll is " + nextRoll + " You keep some of your money!";
					System.out.println();
					System.out.println(  "You won: " + winnings+ " Your new totoal is " + (winnings + enterMoney));
					enterMoney = enterMoney + winnings;
					gameOver = true;
				}
				else if(nextRoll == 7 || nextRoll == 11) {
					message = "Your rolled a " + nextRoll + " You lost your bet!! Run my MONEY!!!!!";
					System.out.println();
					System.out.println(  "You lost: " + bet+ " Your new totoal is " + (enterMoney - bet));
					enterMoney = enterMoney - bet;
					gameOver = true;
				}
				
			} 
		} return message;
	}
}

		
		


