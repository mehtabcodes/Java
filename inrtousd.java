import java.util.Scanner;
public class inrtousd {
    public static void main(String[]args)
    {
        float inr=74.26f;//for 1 usd in inr value
        float usd=0; 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in inr value");
        float a =sc.nextFloat();
        sc.close();
        usd = a/inr;
        System.out.println("Your money in usd is: "+usd);
        
    }
    
}
