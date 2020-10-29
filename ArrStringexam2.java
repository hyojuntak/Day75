package JC.Day75;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        String [] names = {"Cm","M","Inch","Feet","Yard","Mile"};
        double[] distance = {1,0.01,0.3937,0.0328,0.0109,0.000006};
        
        System.out.printf("\t\t");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%s\t\t\t",names[i]);
        }
        System.out.println();
        
        for (int i = 0; i < distance.length; i++) {
            System.out.printf("%s\t",names[i]);
            for (int j = 0; j < distance.length; j++) {
                System.out.printf("%s\t\t",distance[j]/distance[i]);
            }
            System.out.println();
        }
    }
}
