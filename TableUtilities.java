 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder sb=new StringBuilder();
        for (int i=1;i<=5;i++){
        for (int j=1;j<=5;j++){
            String value=String.format("%3d |",i*j);
        sb=sb.append(value);
    }
    sb.append("\n");
    }
        return sb.toString();
    }
    public static String getLargeMultiplicationTable() {
        StringBuilder sb=new StringBuilder();
        for (int i=1;i<=10;i++){
        for (int j=1;j<=10;j++){
            String value=String.format("%3d |",i*j);
        sb=sb.append(value);
    }
    sb.append("\n");
    }
        return sb.toString();
    }
    public static String getMultiplicationTable(int tableSize) {
           StringBuilder sb=new StringBuilder();
        for (int i=1;i<=tableSize;i++){
        for (int j=1;j<=tableSize;j++){
            String value=String.format("%3d |",i*j);
        sb=sb.append(value);
    }
    sb.append("\n");
    }
        return sb.toString();
    }
}






