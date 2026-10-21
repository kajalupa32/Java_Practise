import java.util.Scanner;
class EvenOdd{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int numb=sc.nextInt();

        if (numb % 2 == 0)
            {
             System.out.println("It is Even Number");
            }
             else
                {
                     System.out.println("It is odd Number");
                }
                sc.close();
            }
        
        }
