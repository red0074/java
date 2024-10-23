package Recursion;

public class Print1to5 {
    public static void main(String[] args) {
        int n=1;
        print(n);
    }
    static void print(int n)
    {
        if(n==6)
            return;
        System.out.print(n+" ");
        print(n+1);
    }
}
