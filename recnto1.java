import java.util.Scanner;

public class recnto1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n: ");
        int n= sc.nextInt();
        display(n);
        sc.close();
    }
    /*static void display(int n){
        for(int i=n; i>=1;i--){
            System.out.print(i+", ");
        }
    }*/
    static void display(int n){
        if(n==0){
            return;
        }
        else{
            System.out.print(n+", ");
            display(n-1);
        }
   }
}