import java.util.Scanner;
public class calcwithif {
    public static void main(String[]args) {
        int num1=0,num2=0;
        char c;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num1");
        num1=sc.nextInt();
        System.out.println("enter the num2");
        num2=sc.nextInt();
        System.out.println("enter operator choose any one + , - , * , / ");
        c=sc.next().charAt(0);
        sc.close();

        if(c == '+' )
        {
            System.out.println(num1+num2);
            System.exit(0);
        }
        else if(c == '-' )
        {
            System.out.println(num1-num2);
            System.exit(0);
        }
        else if(c == '*' )
        {
            System.out.println(num1*num2);
            System.exit(0);
        }
        else if(c == '/' )
        {
            System.out.println(num1/num2);
            System.exit(0);
        }

    }
}
