package patterns;

public class InvertedHalfPyramid {
    public static void main(String args[])
    {
        int n=4;
        //outer
        for(int i=n;i>=1;i--)//check the for loop while u r using the same code of halfpyramid
        {
            //inner
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
