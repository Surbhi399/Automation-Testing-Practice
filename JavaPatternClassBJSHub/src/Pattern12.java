import java.util.Scanner;
public class Pattern12 {


        public static void main(String  [] a) {
            Scanner s = new Scanner(System.in);
            System.out.println("enter the number of rows");
            int n = s.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int j = n; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                for (int k = 1; k <= i - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }


//inverse triangle
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int k = n; k >= i; k--) {
                    System.out.print("*");
                }
                for (int k = n; k >= i + 1; k--) {
                    System.out.print("*");
                }
                System.out.println();


            }
        }
    }
