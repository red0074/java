package TwoDarrays;
import java.util.*;
public class SpiralMatrix {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows=3,cols=3;
        int mat[][]=new int [rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        spiral(mat,rows,cols);
    }
    public static void spiral(int mat[][],int rows,int cols){
       int rowstart=0;
       int rowend=rows-1;
       int colsstart=0;
       int colsend=cols-1;
       while(rowstart<=rowend && colsstart<=colsend){
           for(int col=colsstart;col<=colsend;col++){
               System.out.print(mat[rowstart][col]+" ");
           }
           rowstart++;
           for(int row=rowstart;row<=rowend;row++){
               System.out.print(mat[row][colsend]+" ");
           }
           colsend--;
           for(int col=colsend;col>=colsstart;col--){
               System.out.print(mat[rowend][col]+" ");
           }
           rowend--;
           for(int row=rowend;row>=rowstart;row--){
               System.out.print(mat[row][colsstart]+" ");
           }
           colsstart++;

       }
    }
}
