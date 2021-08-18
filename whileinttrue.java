import java.util.Scanner;
public class whileinttrue {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int sum=0;
        while(true){
            int c=sc.nextInt();
            if(c==0) break;
           sum = sum+c;
        }
        System.out.println("the sum of numbers entered is: "+ sum);
        sc.close();
   } 
}
