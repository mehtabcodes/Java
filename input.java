import java.util.Scanner;
public class input {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter you name");
        String name=sc.next();

        System.out.println("Enter you phone");
        String numb=sc.next();

        System.out.println("Enter your salary");
        Float sal=sc.nextFloat();

        System.out.println("Enter your candidate id");
        int id=sc.nextInt();

        System.out.println(id+ " " + name + " " + numb + " " + sal );
        sc.close();
    }

    public static String next() {
        return null;
    }
    
}
