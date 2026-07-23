import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n: ");
        int n= sc.nextInt();
        System.out.println(flip(n));
        sc.close();
    }
    /*static int flip(int n){
        String str=Integer.toString(n);
        char arr1[]=str.toCharArray();
        char arr2[]= new char[str.length()];
        for(int i=str.length()-1; i>=0;i--){
            arr2[i]=arr1[str.length()-i-1];
        }
        str= String.valueOf(arr2);
        return Integer.parseInt(str);
    }*/
    /*static int flip(int n){
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }*/
    /*static int flip(int n, int rev){
        if(n==0){
            return rev;
        }
        else{
            rev=flip(n/10, rev*10+n%10);
            return rev;

        }
    }*/
   static int flip(int n){
    int rev=0;
    int pwr=(int)Math.pow(10, digit(n)-1);
    if(n==0){
            return rev;
        }
        else{
            return n%10*pwr+flip(n/10);
        }
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
