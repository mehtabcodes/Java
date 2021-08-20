import java.util.Scanner;
public class circle {
    public static void main(String[]args){
        float pi = 3.14f;
        Scanner sc=new Scanner (System.in);
        //area of a circle compute
        System.out.println("Enter the radius");
        int r=sc.nextInt();
        sc.close();
        float area = pi * r * r;
        System.out.println("area of the circle is: "+area);
        //perimeter of a circle 
        float c = 2 * pi * r;
        System.out.println("perimeter of the circle is: "+c);
    }
}
