package patterns;

public class InvertedHalfPyramid_rotatedby180 {
    public static void main(String args[]){
        int n=4;
        //outer
        for(int i=1;i<=n;i++)
        {
            //inner
            //condition to print the spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //conditon to print the stars
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
