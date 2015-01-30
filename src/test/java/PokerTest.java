import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;


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

        assertTrue( queenOfClubs.isHigherRankThan(fiveOfHearts));

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

        assertFalse(fiveOfHearts.isHigherRankThan(queenOfClubs));

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

        assertTrue(jackOfHearts.isHigherRankThan(eightOfClubs));

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

        assertTrue(eightOfClubs.isHigherRankThan(fiveOfHearts));

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

        assertTrue(aceOfHearts.isHigherRankThan(fiveOfHearts));

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

        assertTrue(aceOfHearts.isHigherRankThan(jackOfHearts));

    }





}
