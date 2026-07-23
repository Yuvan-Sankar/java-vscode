import java.util.Scanner;

public class backstring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n: ");
        String n= sc.nextLine();
        flip(n);
        sc.close();
    }
    static void flip(String n){
        if(n.length()==0){
            return;
        }
        else{
            flip(n.substring(1, n.length()));
            System.out.print(n.charAt(0));
        }

    }
}
