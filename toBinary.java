import java.util.Scanner;

public class toBinary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n: ");
        int n= sc.nextInt();
        toBin(n);
        sc.close();
    }
    /*static String toBin(int n){
        String result= "";
        while(n>0){
            result=n%2+result;
            n=n/2;
        }
        return result;
    }*/
    static void toBin(int n){
        if(n==0){
            return;
        }
        else{
            toBin(n/2);
            System.out.print(n%2);
        }
    }
}
