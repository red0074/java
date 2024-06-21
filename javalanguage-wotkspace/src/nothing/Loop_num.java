package nothing;

public class Loop_num {
    public static void main(String args[])
    {
        //printing from 0 to 10 numbers
        //using for loop
        for(int i=0;i<11;i++){
            System.out.println(i);
        }
        //while loop
        int j=0;
        while(j<11)
        {
            System.out.println(j);
            j++;
        }
        //using do-while loop
        int k=0;
        do{
            System.out.println(k);
            k++;
        }while(k<11);
    }
}
