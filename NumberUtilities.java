


public class NumberUtilities {

    public static String getRange(int stop) {
        String a = "";
        for (int i = 0; i < stop; i++)
        
        a = a + String.valueOf(i); 
        //loop through, return to string a , substring starting point @ 0, ending point @ "stop"
        return a;
    }

    public static String getRange(int start, int stop) {
        String a = "";
        for (int i = start; i < stop; i++)
        
        a = a + String.valueOf(i); 
        //loop through, return to string a , substring starting point @ 0, ending point @ "stop"
        return a;
    }


    public static String getRange(int start, int stop, int step) {
        String a = "";
        for (int i = start; i < stop; i += step)
        
        a = a + String.valueOf(i); 
        //loop through, return to string a , substring starting point @ 0, ending point @ "stop"
        return a;
    }

    public static String getEvenNumbers(int start, int stop) {
        String a = "";
        for (int i = start; i < stop; i++)
            if (i % 2 == 0) {
                a = a + String.valueOf(i);
            } else {
                continue;
            }
        //loop through, return to string a , substring starting point @ 0, ending point @ "stop"
        return a;
    }


    public static String getOddNumbers(int start, int stop) {
        String a = "";
        for (int i = start; i < stop; i++)
            if (i % 2 == 1) {
                a = a + String.valueOf(i);
            } else {
                continue;
            }
        //loop through, return to string a , substring starting point @ 0, ending point @ "stop"
        return a;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String a = "";
        int j = 0;
        for (int i = start; i <= stop; i++) {
            j = (int) (Math.pow(i, exponent));        
            a = a + String.valueOf(j); 
        }
        //loop through, return to string a , substring starting point @ 0, ending point @ "stop"
        return a;
    }
}
