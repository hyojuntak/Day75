package JC.Day75;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        String[] names = {"Cm","M","Inch","Feet","Yard","Mile"};
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%s\t",names[i]);
        }

        System.out.println();

        for (String str : names) {
            System.out.printf("%s\t",str);
        }
    }
}
