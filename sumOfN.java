import java.util.Scanner;
public class sumOfN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n: ");
        int n= sc.nextInt();
        System.out.println(add(n));
        sc.close();
    }
    /*static int add(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        return sum;
    }*/
    static int sum=0;
    static int add(int n){
        if(n==0){
            return sum;
        }
        else{
            sum+=n;
            add(n-1);
            return sum;
        }
    }
}
