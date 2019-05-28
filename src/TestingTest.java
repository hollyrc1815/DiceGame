import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestingTest {

	DiceGame diceTest = new DiceGame();
	
////////////////////////////////////////////////////////////////////	
	@Test
	public void rollDiceTest() {
		assertNotNull(diceTest.rollDice());
		assertTrue(diceTest.rollDice() > 0);
		assertTrue(diceTest.rollDice() < 7);	
	}
/////////////////////////////////////////////////////////////////
	@Test
	public void sumOfTwoDiceRollsTest() {
		assertNotNull(diceTest.sumOfTwoDiceRolls());
		assertTrue(diceTest.sumOfTwoDiceRolls() > 1);
		assertTrue(diceTest.sumOfTwoDiceRolls() < 13);	
	}
//////////////////////////////////////////////////////////////////
	@Test
	@DisplayName("test the 7 & 11 win on first try")
	public void rollEmWinOnFirstRollTest() {
		assertEquals(diceTest.rollEm(7), "Winner Winner Chicken Dinner!");
		assertEquals("Test with 11 passed", diceTest.rollEm(11), "Winner Winner Chicken Dinner!");	
	}
	///////////////////////////////////////////
	@Test
	public void rollEmFailOnFirstRollTest() {
		assertEquals(diceTest.rollEm(2), "You just lost all your money! This game is over!");
		assertEquals(diceTest.rollEm(3), "You just lost all your money! This game is over!");
		assertEquals(diceTest.rollEm(12), "You just lost all your money! This game is over!");
	}
	///////////////////////////////////////////
	@Test
	public void rollEmRound2() {
		assertNotEquals(diceTest.rollEm(4), "You just lost all your money! This game is over!");
		assertNotEquals(diceTest.rollEm(4), "Winner Winner Chicken Dinner!");
	}
	//////////////////////////////////////////////////////////
	@Test
	public void doesMyBetReturnAnInt() {
		assertNotNull(diceTest.enterMoney);
	}
	
}