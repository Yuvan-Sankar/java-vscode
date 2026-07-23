import java.util.Scanner;

public class exponent {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter x and y: ");
        int x= sc.nextInt();
        int y= sc.nextInt();
        System.out.println(power(x, y));
        sc.close();
    }
    /*static int power(int x, int y){
        int product=1;
        for(int i=0; i<y; i++){
            product=product*x;
        }
        return product;
    }*/
    static int power(int x, int y){
        if(y==0){
            return 1;
        }
        else{
            return x*power(x, y-1);
        }
   }
}
