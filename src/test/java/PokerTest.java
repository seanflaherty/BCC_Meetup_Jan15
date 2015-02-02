import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class PokerTest {


    @Before
    public void setUp()
    {

    }

    @Test
    public void testThatWeHaveSixItemsInTheInventory()
    {
        assertEquals(6, 6);
    }

    @Test
      public void testThatCardObjectsCanBeCreated()
    {
        Card card = new Card();
    }

    @Test
    public void testThatQueenIsHigherThanFive()
    {
        Card queenOfClubs = new Card();
        queenOfClubs.suit = "C";
        queenOfClubs.value = "Q";

        Card fiveOfHearts = new Card();
        fiveOfHearts.suit = "H";
        fiveOfHearts.value = "5";

        assertTrue( queenOfClubs.isHigherValue(fiveOfHearts));
    }

    @Test
    public void testThatFiveIsNotHigherThanQueen()
    {
        Card queenOfClubs = new Card();
        queenOfClubs.suit = "C";
        queenOfClubs.value = "Q";

        Card fiveOfHearts = new Card();
        fiveOfHearts.suit = "H";
        fiveOfHearts.value = "5";

        assertFalse(fiveOfHearts.isHigherValue(queenOfClubs));

    }

    @Test
    public void testThatEightIsNotHigherThanJack()
    {
        Card eightOfClubs = new Card();
        eightOfClubs.suit = "C";
        eightOfClubs.value = "8";

        Card jackOfHearts = new Card();
        jackOfHearts.suit = "H";
        jackOfHearts.value = "J";

        assertTrue(jackOfHearts.isHigherValue(eightOfClubs));
    }

    @Test
    public void testThatEightIsHigherThanFive()
    {
        Card eightOfClubs = new Card();
        eightOfClubs.suit = "C";
        eightOfClubs.value = "8";

        Card fiveOfHearts = new Card();
        fiveOfHearts.suit = "H";
        fiveOfHearts.value = "5";

        assertTrue(eightOfClubs.isHigherValue(fiveOfHearts));
    }


    @Test
     public void testThatAceIsHigherThanFive()
    {
        Card aceOfHearts = new Card();
        aceOfHearts.suit = "H";
        aceOfHearts.value = "A";

        Card fiveOfHearts = new Card();
        fiveOfHearts.suit = "H";
        fiveOfHearts.value = "5";

        assertTrue(aceOfHearts.isHigherValue(fiveOfHearts));
    }


    @Test
     public void testThatAceIsHigherThanJack()
    {
        Card aceOfHearts = new Card();
        aceOfHearts.suit = "H";
        aceOfHearts.value = "A";

        Card jackOfHearts = new Card();
        jackOfHearts.suit = "H";
        jackOfHearts.value = "J";

        assertTrue(aceOfHearts.isHigherValue(jackOfHearts));
    }

    @Test
    public void testThatKingIsHigherThanQueen()
    {
        Card queenOfHearts = new Card();
        queenOfHearts.suit = "H";
        queenOfHearts.value = "Q";

        Card kingOfHearts = new Card();
        kingOfHearts.suit = "H";
        kingOfHearts.value = "K";

        assertFalse(queenOfHearts.isHigherValue(kingOfHearts));
    }


    @Test
    public void testThatKingIsNotHigherThanKing()
    {
        Card kingOfDiamonds = new Card();
        kingOfDiamonds.suit = "D";
        kingOfDiamonds.value = "K";

        Card kingOfHearts = new Card();
        kingOfHearts.suit = "H";
        kingOfHearts.value = "K";

        assertFalse(kingOfHearts.isHigherValue(kingOfHearts));
    }

    @Test
    public void testThatKingIsEqualValueToKing()
    {
        Card kingOfDiamonds = new Card();
        kingOfDiamonds.suit = "D";
        kingOfDiamonds.value = "K";

        Card kingOfHearts = new Card();
        kingOfHearts.suit = "H";
        kingOfHearts.value = "K";

        assertTrue(kingOfHearts.isSameValue(kingOfDiamonds));
    }

    @Test
    public void testThatKingIsNotEqualValueToQueen()
    {
        Card queenOfDiamonds = new Card();
        queenOfDiamonds.suit = "D";
        queenOfDiamonds.value = "Q";

        Card kingOfHearts = new Card();
        kingOfHearts.suit = "H";
        kingOfHearts.value = "K";

        assertFalse(kingOfHearts.isSameValue(queenOfDiamonds));
    }
}
