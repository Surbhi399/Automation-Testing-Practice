import java.util.Scanner;

public class Pattern14 {
    public static void main(String  [] a) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n = s.nextInt();



        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                if(k==1||i==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for(int k=1;k<=i-1;k++)
            {
                if(k==i-1||i==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

}}