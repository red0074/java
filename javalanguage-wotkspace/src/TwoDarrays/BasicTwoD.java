package TwoDarrays;
import java.util.*;
public class BasicTwoD {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the rows: ");
        int rows=sc.nextInt();
        System.out.println("Enter the size of the columns: ");
        int cols=sc.nextInt();
        int numbers[][]=new int [rows][cols];
        //input
        for (int i = 0; i < rows; i++) {//->for controlling the rows
            for(int j=0;j<cols;j++){//->for controlling the columns
                numbers[i][j]= sc.nextInt();
            }
        }
        //output
        for (int i = 0; i < rows; i++) {
            for(int j=0;j<cols;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
