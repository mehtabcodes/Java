import java.util.Scanner;
public class SumOfTwoNumbers {
  public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      //addition of int type numbers
      System.out.println("Enter your first number");
      int num1 = sc.nextInt();
      System.out.println("Enter your second number");
      int num2 = sc.nextInt();
      System.out.println("Your answer is: "+(num1+num2));
      //addition of loat type numbers
      System.out.println("Enter your first number");
      float num3 =sc.nextFloat();
      System.out.println("Enter your second number");
      float num4 =sc.nextFloat();
      System.out.println("Your answer is: "+(num3+num4));
    sc.close();
  }  
}
