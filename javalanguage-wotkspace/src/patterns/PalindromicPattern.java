package patterns;

public class PalindromicPattern {
    public static void main(String args[]){
        int n=5;
        //outer
        for(int i=1;i<=n;i++){
            //inner
            //for spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for value
            //first half
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //second half
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
