import java.util.Scanner;
class calculator
{
    public static void main(String[] args)
    {
        System.out.println("=====MY CALCULATOR====");
         System.out.println();
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("ENTER FIRST NUMBER : ");
        double a=sc.nextDouble();
        
        System.out.print("ENTER SECOND NUMBER : ");
        double b=sc.nextDouble();
        System.out.println();

        System.out.println("1. Addition(+)\n2. Subtraction(-)\n3. multiplication(*)\n4. Division(/)\n5. Remainder(%)");
        System.out.println();
        
        System.out.print("Enter range  (1-5) : ");
        int num=sc.nextInt();

        switch(num){
                
            case 1:
                    System.out.println("Addition = "+(a+b));
                    break;
            case 2: 
                System.out.println("Subtraction = "+(a-b));
                break;
            case 3:
                System.out.println("Multiplication = "+(a*b));
                break;

            case 4:
                System.out.println("Division = "+(a/b));
                break;

            case 5:
                if(b!=0)
                {
                    System.out.println("Remainder = "+(a%b));   
                }
                else
                {
                    System.out.println("cant divisible by 0, please tyr again");
                }
                break;
            default:
                System.out.println("Invalid input ! please try again");
                break;      
        }
    }
    
}