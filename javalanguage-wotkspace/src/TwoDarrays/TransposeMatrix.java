package TwoDarrays;
import java.util.*;
public class TransposeMatrix {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the rows: ");
        int rows=sc.nextInt();
        System.out.println("Enter the size of the columns: ");
        int cols=sc.nextInt();
        int mat[][]=new int [rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                mat[i][j]= sc.nextInt();
            }
        }
        transpose(mat,rows,cols);
    }
    public static void transpose(int mat[][],int rows,int cols){
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(mat[j][i]+" ");
            }
            System.out.println();
        }
    }
}
