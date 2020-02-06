

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String table = "";

        for(int c = 1; c <= tableSize; c++)
        {
            for(int r = 1; r <= tableSize; r++)
            {
                int digit = c * r;

                /*
                if(digit >= 0 && digit < 10)
                {
                    table = table + "  " + digit + " |"; 
                } else if(digit < 100)
                {
                    table = table + " " + digit + " |";
                } else
                {
                    table = table + digit + " |";
                }
                 */
                table += String.format("%1$3s |", digit);
            }
            table += "\n";
        }

        return table;
    }
}