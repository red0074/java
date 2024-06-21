package patterns;

public class NumberPyramid {
    public static void main(String args[]){
        int n=5;
        //outer
        for(int i=1;i<=n;i++)
        {
            //inner
            //for spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //value with spaces
            for(int j=1;j<=i;j++){
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
