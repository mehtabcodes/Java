import java.util.Scanner;
public class simpleinterest {
    public static void main(String[]args){
        float principal=0,rate=0, si=0, time = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your principal amount");
        principal=sc.nextFloat();
        System.out.println("enter your time period");
        time=sc.nextFloat();
        System.out.println("enter your rate %");
        rate=sc.nextFloat();
        sc.close();
        si=(principal*rate*time)/100;
        System.out.println("your interest is: "+si);
        System.out.println("total amount payable is: "+ (si+principal));
    }
    
}
