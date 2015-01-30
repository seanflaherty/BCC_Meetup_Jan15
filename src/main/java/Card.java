/**
 * User: vlad
 * Created : 1/29/15 7:49 PM
 */
public class Card {


    public String suit;
    public String value;

    public boolean isHigherRankThan(Card other) {

        char otherVal = other.value.charAt(0);
        final char thisVal = this.value.charAt(0);

        switch (otherVal) {
            case 'T' : otherVal = 60;  break;
            case 'J' : otherVal = 61;  break;
            case 'Q' : otherVal = 62;  break;
            case 'K' : otherVal = 63;  break;
            case 'A' : otherVal = 64;  break;
        }

        if ( thisVal > otherVal) return true;

    return false;

    }
}
