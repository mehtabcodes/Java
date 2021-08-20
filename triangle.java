import java.util.Scanner;
public class triangle {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        //area of triangle or area of an isosceles triangle
        
        System.out.println("Enter the base");
        int b=sc.nextInt();
        System.out.println("Enter the height");
        int h=sc.nextInt();
        float a1= (0.5f) * b * h;
        System.out.println("The area of triangle is: "+a1+ " unit square");
        //peri of triangle
        System.out.print("enter the other side dimension");
        int c = sc.nextInt();
        float p1= b + h + c;
        System.out.println("peri of triangle: "+p1);
        //area of equilateral triangle
        System.out.println("Enter the side");
        int a=sc.nextInt();
        float a2 = ((1.732f)/4) * a * a;
        System.out.println("area of equilateral triangle: "+a2);
        //peri of equi
        float p2= 3*a;
        System.out.println("peri of equilateral triangle: "+p2);
        sc.close();
    }
}
