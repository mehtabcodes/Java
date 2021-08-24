/*Ram is allowed to go out with his friends only on the even days of a given month. 
Write a program to check if he can go out in the month of August. */
import java.util.Scanner;
public class relatedtocalendar {
    public static void main(String[]args){
        int day=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the day number");
        day=sc.nextInt();
        sc.close();
        if(day>=1 || day <=31){
            if(day%2==0){
                System.out.println("he can go");
            }
            else
            System.out.println("its the odd day of the month, he can't go out");
        }
        else
        System.out.println("Check day number");
    }
    
}
