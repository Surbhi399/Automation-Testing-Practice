


import java.util.Scanner;


public class Hackerearth1 {
        public static void main(String [] a)
        {

            Scanner s = new Scanner(System.in);
            int n = s.nextInt();

            for(int i=1; i<= n ;i++)
            {

                for (int j = n; j >= i; j--)
                {
                    System.out.print("*");
                }
                for(int k = n;k>=1;k--)
                {
                    System.out.print(" ");
                }
                for (int k =1 ; k<=i; k++)
                {
                    System.out.print("*");
                }
                for (int j = n; j>= i; j--)
                {
                    System.out.print(" ");
                }

                    System.out.println();

            }


        }
    }


