 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        int i = 1;
        String a = "";
        while (i <= numberOfStars) {
            a += "*";
            i++;
        }
        return a;
    }
    
    public static String getTriangle(int numberOfRows) {
        //int i = 0;
        //int j = 1;
        String a = "";
        /*while (i <= numberOfRows) {
            while (j <= numberOfRows) {
                a += "*";
                j++;
            }
            a += "*\n";
            i++;
        }*/
        return a;
    }


    public static String getSmallTriangle() {
        return null;
    }

    public static String getLargeTriangle() {
        return null;
    }
}
