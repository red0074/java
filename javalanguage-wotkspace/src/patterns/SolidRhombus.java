package patterns;

public class SolidRhombus {
    public static void main(String args[])
    {
        int n=5;
        //outer
        for(int i=1;i<=n;i++){
            //inner
            //for spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
