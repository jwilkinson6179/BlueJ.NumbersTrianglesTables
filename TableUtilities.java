

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder table = new StringBuilder();

        for(int c = 1; c <= tableSize; c++)
        {
            for(int r = 1; r <= tableSize; r++)
            {
                table.append(String.format("%1$3d |", c * r));
            }
            table.append("\n");
        }

        return table.toString();
    }
}