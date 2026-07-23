import java.util.Scanner;

public class digits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n: ");
        int n= sc.nextInt();
        System.out.println(digit(n));
        sc.close();
    }
    static int digit(int n){
        if(n<10){
            return 1;
        }
        else{
            n=n/10;
            return 1+digit(n);
        }
    }
}
