


public class NumberUtilities {

    public static String getRange(int stop) {
        String output = "";

        for(int i = 0; i < stop; i++) {
            output += i;
        }
        return output;
    }

    public static String getRange(int start, int stop) {
        String output = "";

        for(int i = start; i < stop; i++)
        {
            output += i;
        }

        return output;
    }


    public static String getRange(int start, int stop, int step) {
        String output = "";

        for(int i = start; i < stop; i += step)
        {
            output += i;
        }

        return output;
    }

    public static String getEvenNumbers(int start, int stop) {
        if((start % 2) != 0)
        {
            start++;
        }

        return getRange(start, stop, 2);
    }


    public static String getOddNumbers(int start, int stop) {
        if((start % 2) == 0)
        {
            start++;
        }

        return getRange(start, stop, 2);
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String output = "";

        for(int i = start; i <= stop; i++) {
            output += String.format("%1$.0f", Math.pow(i, exponent));
        }
        return output;
    }
}
