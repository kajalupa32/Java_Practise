import java.util.Scanner;
public class Number {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int numb=sc.nextInt();

        if(numb>0)
            {
            System.out.println("positive number");

            }
            else if(numb<0)
            {
            System.out.println("negative number");
            }
             else
            {
            System.out.println("zero");
            }
            sc.close();
        
        

    }
    
}
