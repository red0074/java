package patterns;

public class ButterflyPattern {
    public static void main(String args[])
    {
        int n=4;
        //outer
        for(int i=1;i<=n;i++)
        {
            //inner
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //condition to print spaces
            for(int k=1;k<=(n-i)*2;k++)
            {
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //toprint the remaining half
        //outer
        for(int i=n;i>=1;i--)
        {
            //inner
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //condition to print spaces
            for(int k=1;k<=(n-i)*2;k++)
            {
                System.out.print(" ");
            }
            //to remainging star in row
            for(int l=1;l<=i;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
