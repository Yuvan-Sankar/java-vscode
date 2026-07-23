import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n: ");
        String n= sc.nextLine();
        if(n.compareTo(palin(n))==0){
            System.out.println(" is a palindrome");
        }
        else{
            System.out.println(" is not a palindrome");
        }
        sc.close();
    }
    static String palin(String n){
        String result="";
        if(n.length()==0){
            return result;
        }
        else{
            result=palin(n.substring(1, n.length()))+n.charAt(0);
        }
        return result;
    }
}
