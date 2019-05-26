
import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class DiceGameTest {
	static int roll1 = 1 + (int)(Math.random() * 6);
	static int roll2 = 1 + (int)(Math.random() * 6);
	int diceSum = sum(roll1, roll2);
	
////////////////////////////////////////////////////////////////////	
	@Test
	void randomNum() {
		Random rand = new Random();
		int dicetest = 1 + (int)(Math.random() * 6);
		assertNotEquals(0, dicetest);
		assertTrue(dicetest < 7);
		assertTrue(dicetest >0);
		
	}
////////////////////////////////////////////////////////////////////
	
	@Test
	public void sumDice() {
		assertEquals(diceSum, sum(roll1,roll2));
		assertTrue(diceSum < 13);
		assertTrue(diceSum > 0);
	}
	
	public int sum(int roll1, int roll2) {
		int diceSum = roll1 + roll2;
		return diceSum;
	}
	
////////////////////////////////////////////////////////////////////	
	@Test
	public void firstRoll7() {
		int roll1 = 3 ;
		int roll2 = 4 ;
		int x = roll1 + roll2;
		if (x ==11 || x == 7) {
			System.out.println("You rolled a " + x);
		}
	    assertEquals(7, x);
	    }
////////////////////////////////////////////////////////////////////////	
	@Test
	public void firstRoll11() {
		int roll1 = 6 ;
		int roll2 = 5 ;
		int x = roll1 + roll2;
		if (x ==11 || x == 7) {
			System.out.println("you rolled a " + x);
		}
		assertEquals(11, x );
	   }
///////////////////////////////////////////////////////////////	

	

/////////////////////////////////////////////////////////////////
	
	@Test 
	public void gameLogic1() {
		Random rand = new Random();
		int dice1 = 1 + (int)(Math.random() * 6);
		int dice2 = 1 + (int)(Math.random() * 6);
		int sumDice = (dice1 + dice2);
		System.out.println(sumDice);
		if (sumDice == 7 || sumDice == 11) {
			System.out.println("Winner Winner Chicken Dinner!");
		}else if (sumDice == 2 || sumDice == 3 || sumDice == 12) {
			System.out.println("You just lost all your money!");
		}else {System.out.println( "Your point is: ");
		assertTrue(sumDice < 13);
		}
	}
}