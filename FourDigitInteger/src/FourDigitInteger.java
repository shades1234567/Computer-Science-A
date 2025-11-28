public class FourDigitInteger {
    private int value;

    public FourDigitInteger (int aValue) {
        value = aValue;
    }

    //Function checks if value is odd.
    public boolean isOdd() {
        if(this.value % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    //Function checks if number is palindrome.
    public boolean isPalindrome() {
        String value = Integer.toString(this.value);
        if(value.substring(0,1).equals(value.substring(3,4)) && value.substring(1,2).equals(value.substring(2,3)))
        {
            return true;
        } else {
            return false;
        }
    }

    //Function checks if number is a perfect square
    public boolean isPerfectSquare() {
        for(int i = 0; i <= this.value; i++) {
            if(Math.pow(i,2) == this.value) {
                return true;
            }
        }
        return false;
    }
}
