


public class NumberUtilities {

    public static String getRange(int stop) {
        String range = getRange(0, stop);
        return range;
    }

    public static String getRange(int start, int stop) {
        String range = getRange(start, stop, 1);
        return range;
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder output = new StringBuilder();

        for(int i = start; i < stop; i += step)
        {
            output.append(i);
        }

        return output.toString();
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
        StringBuilder output = new StringBuilder();

        for(int i = start; i <= stop; i++) {
            output.append(String.format("%.0f", Math.pow(i, exponent)));
        }
        return output.toString();
    }
}