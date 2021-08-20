public class fibonacci {
    public static void main(String[]args){
        int start=0,first=1,counter=10;
        System.out.print(start+ " "+first);

        // this loop will take care of the process untill counter is there
        for(int i=2;i<counter;++i){
            int n3 =start+first;
            System.out.print(" "+n3);
            //here we are changing the values with what we got after adding and storing it 
            start=first;
            first=n3;

        }
    }
}
