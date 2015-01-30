/**
 * User: vlad
 * Created : 1/29/15 7:49 PM
 */
public class Card {


    public String suit;
    public String value;

    public boolean isHigherValue(Card other) {

        char otherVal = other.value.charAt(0);
        char thisVal = this.value.charAt(0);

        otherVal = getNumericValue(otherVal);
        thisVal = getNumericValue(thisVal);

        return thisVal > otherVal;

    }

    private char getNumericValue(char otherVal) {
        switch (otherVal) {
            case 'T' : otherVal = 60;  break;
            case 'J' : otherVal = 61;  break;
            case 'Q' : otherVal = 62;  break;
            case 'K' : otherVal = 63;  break;
            case 'A' : otherVal = 64;  break;
        }
        return otherVal;
    }

    public boolean isSameValue(Card other) {
        char otherVal = other.value.charAt(0);
        char thisVal = this.value.charAt(0);

        otherVal = getNumericValue(otherVal);
        thisVal = getNumericValue(thisVal);

        return thisVal == otherVal;
    }
}
