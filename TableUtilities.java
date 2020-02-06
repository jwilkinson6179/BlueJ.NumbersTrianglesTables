

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
                table += String.format("%1$3s |", c * r);
            }
            table += "\n";
        }

        return table;
    }
}