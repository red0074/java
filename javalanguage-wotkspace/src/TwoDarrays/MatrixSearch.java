package TwoDarrays;
import java.util.*;
public class MatrixSearch {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the rows: ");
        int rows=sc.nextInt();
        System.out.println("Enter the size of the columns: ");
        int cols=sc.nextInt();
        int numbers[][]=new int [rows][cols];
        System.out.println("Enter the elements in the matrix : ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                numbers[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the Element need to be searched: ");
        int x=sc.nextInt();
        int tempi=0,tempj=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(x==numbers[i][j]){
                    tempi+=i;
                    tempj+=j;
                }
            }
        }
        if(tempi>=0 && tempj>=0) {
            System.out.println("The element " + x + " is found at " + tempi + " " + tempj);
        }else{
            System.out.println("the element not found");
        }
    }
}
