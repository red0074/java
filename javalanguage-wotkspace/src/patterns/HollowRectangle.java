package patterns;

public class HollowRectangle {
    public static void main(String ags[])
    {
        int n=4;
        int m=5;
        //outer loop
        for(int i=1;i<=n;i++)
        {
            //inner loop
            for(int j=1;j<=m;j++)
            {
                //star printing for each cell condition
                if(i==1 || i==n || j==1 || j==m)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}