import java.util.Scanner;

class Main {

  static void method(int m){

    int[][] arr = new int[m][m];
    for(int i = 0 ; i < m ; i++) {
      for(int j = 0 ; j < m ; j++) {
        arr[i][j] = (i+1)*(j+1);
        System.out.printf("%5d",arr[i][j]);
      }System.out.println();
    }  
  }
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();

    method(m);
  }
}
