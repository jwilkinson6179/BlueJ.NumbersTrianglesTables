


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
        String output = "";

        if((start % 2) != 0)
        {
            start++;
        }

        for(int i = start; i < stop; i += 2)
        {
            output += i;
        }

        return output;
    }


    public static String getOddNumbers(int start, int stop) {
        String output = "";
        
        if((start % 2) == 0)
        {
            start++;
        }

        for(int i = start; i < stop; i += 2)
        {
            output += i;
        }

        return output;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String output = "";

        for(int i = start; i <= stop; i++)
        {
            int x = i;

            for(int n = 2; n <= exponent; n++)
            {
                x *= x;
            }

            output += x;
        }

        return output;
    }
}
