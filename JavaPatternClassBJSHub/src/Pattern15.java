import java.util.Scanner;
class Pattern15
{
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n=s.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                if(k==1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for(int k=1;k<=i-1;k++)
            {
                if(k==i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }



//inverse triangle
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=n;k>=i;k--)
            {
                if(k==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for(int k=n;k>=i+1;k--)
            {
                if(k==i+1)
                    System.out.print("*");
                else
                    System.out.print(" ");			}
            System.out.println();


        }
    }
}