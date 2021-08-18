public class factors {
    public static void main(String[]args){
        int num=2;

        for(int i=1;i<=num;i++){
            if(num%i==0)
            {
                System.out.println("it is a factor of " + num + ":" + i);
            }
            //to also print the numbers which are not divisible with it uncomment the below method
            //else
            //System.out.println("it is not a factor "+i);
        }
    }
    
}
