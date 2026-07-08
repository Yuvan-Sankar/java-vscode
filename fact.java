import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n: ");
        int n= sc.nextInt();
        System.out.println(mult(n));
        sc.close();
    }
    static int product=1;
    static int mult(int n){
        if(n==1){
            return product;
        }
        else{
            product=n*product;
            mult(n-1);
            return product;
        }
    }
}