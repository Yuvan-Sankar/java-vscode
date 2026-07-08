import java.util.*;
public class rec_1ton {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n: ");
        int n= sc.nextInt();
        display(n);
        sc.close();
    }
/*  static void display(int n){
        for(int i=1; i<=n; i++){
            System.out.print(i+", ");
        }
    }*/
    static void display(int n){
        if(n==0){
            return;
        }
        else{
            display(n-1);
            System.out.print(n+", ");
        }
    }
}