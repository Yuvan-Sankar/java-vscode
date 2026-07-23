// takes a number from the user and prints that many values of the fibbonacci sequence
import java.util.Scanner;
public class fibbonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n: ");
        int n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(fib(i));
        }
        sc.close();
    }
    /*static void fib(int n){
        System.out.println("0\n1");
        
        int f1=0;
        int f2=1;
        for(int i=0; i<n-2; i++){
            if (i%2==0) {
                f1=f1+f2;
                System.out.println(f1);
            }
            else{
                f2=f1+f2;
                System.out.println(f2);
            }
            
        }
    }*/
    static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}