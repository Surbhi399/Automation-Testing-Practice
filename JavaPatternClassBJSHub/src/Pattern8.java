import java.util.Scanner;

public class Pattern8
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
       int n = s.nextInt();
        for (int i = 1; i <=5 ; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            for(int k = 1;k<=5;k++)
            {
                System.out.print("-");
            }
            System.out.println();
        }

        for (int i = 1; i <=5 ; i++)
        {
            for (int j = 5; j >= i; j--)
            {
                System.out.print(" ");
            }
            for (int k =1 ; k<=i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <=5 ; i++)
        {
            for (int k =1 ; k<=i; k++)
            {
                System.out.print("*");
            }
            for (int j = 5; j>= i; j--)
            {
                System.out.print(" ");
            }

            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= n ; i++)
        {
            for (int k =1 ; k<=i; k++)
            {
                System.out.print(" ");
            }
            for (int j = 5; j>= i; j--)
            {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}


                                                        /* output1:

                                                         *-----
                                                         **-----
                                                         ***-----
                                                         ****-----
                                                         *****-----

                                                    output 2:
                                                         *
                                                         **
                                                         ***
                                                         ****
                                                         *****

                                                  output:3
                                                        *
                                                        **
                                                        ***
                                                        ****
                                                        *****

                                                      output:4

                                                         *****
                                                          ****
                                                           ***
                                                            **
                                                             *


                                                         */