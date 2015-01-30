/**
 * User: vlad
 * Created : 1/29/15 7:49 PM
 */
public class Card {


    public String suit;
    public String value;

    public boolean isHigherRankThan(Card other) {

        if (  other.value.equals("5")) return true;
        else if (other.value.equals("8")) return true;

        return false;
    }
}
