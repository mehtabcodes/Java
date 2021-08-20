import java.util.Scanner;
public class takeinpchklargint {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int large=0;
        while(true){
            int c=sc.nextInt();
            if(c==0) break;
            if(c > large)
            {large = c;}
        }
        System.out.println("the largest of numbers entered is: "+ large);
        sc.close();
    }
}

