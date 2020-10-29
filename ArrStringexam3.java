package JC.Day75;

/**
 * Main
 */
public class Main {
    public static final String[] names = {"Cm","M","Inch","Feet","Yard"};
    public static double[] distance = {1.0000,0.0100,0.3937,0.0328,0.0109};
    
    public static double [][] convert(){
        double [][] mm = new double [distance.length][distance.length];
        for (int i = 0; i < distance.length; i++) {
            for (int j = 0; j < mm.length; j++) {
                mm[i][j] = distance[j]/distance[i];
            }
        }
        return mm;
    }
    public static void main(String[] args) {
        
        double [][] conv = convert();
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%s\t\t\t",names[i]);
        }
        
        for (int i = 0; i < conv.length; i++) {
            System.out.printf("%s\t",names[i]);
            for (int j = 0; j < conv[i].length; j++) {
                System.out.printf("%f\t",conv[i][j]);
            }
        System.out.println();
        }
    }

}
