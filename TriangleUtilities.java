 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        StringBuilder output = new StringBuilder();

        for(int i = 0; i < numberOfStars; i++)
        {
            output.append("*");
        }

        return output.toString();
    }
    
    public static String getTriangle(int numberOfRows) {
        StringBuilder output = new StringBuilder();

        for(int i = 1; i <= numberOfRows; i++)
        {
            output.append(getRow(i) + "\n");
        }

        return output.toString();
    }


    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() { return getTriangle(9); }
}
