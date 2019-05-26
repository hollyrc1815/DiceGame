public class DiceGame {

	static int point = rollDice();
	//static int newRoll = rollDice();
	
	public static void main(String[] args) {
		rollEm(point);
	}


	public static int rollDice() {
		int roll1 = 1 + (int)(Math.random() * 6);
		int roll2 = 1 + (int)(Math.random() * 6);
		int sumEmUp = roll1 + roll2;
		return sumEmUp;
	}
	
	public static void rollEm(int y) {
		System.out.println("Your first Roll is: " + y);
		if (y == 7 || y == 11) {
			System.out.println("Winner Winner Chicken Dinner!");
		}else if (y == 2 || y == 3 || y == 12) {
			System.out.println("You just lost all your money! This game is over!!");
		}else {System.out.println( "Lucky Bucky! You get to roll again and Your point is : " + y);
		round2(y);
		}
		}	
	
	public static void round2(int x) {
		int nextRoll = rollDice();
		if (x == nextRoll) {System.out.println("Your New Roll is " + nextRoll + " You keep some of your money!");
		}
		else if (nextRoll == 7 || nextRoll == 11) {System.out.println("Your rolled a " + nextRoll + " You lost your bet!! Run my MONEY!!!!!");
		}else {System.out.println("You rolled a " + nextRoll + " Now Roll Again Bucky!");
		round2(x);
	
		}
	
		}
	}