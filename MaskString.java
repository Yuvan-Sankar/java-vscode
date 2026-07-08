import java.util.*;
public class MaskString {
    public static void main(String[] args) {
        StringOp s1= new StringOp();
        s1.accept();
        s1.form();
        s1.display();
    }
}
class StringOp{
    String str;
    String msk;
    String nstr;
    public StringOp(){
        str="";
        msk="";
        nstr="";
    }
    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The original String: ");
        str=sc.nextLine();
        System.out.print("\nEnter the Mask String: ");
        msk=sc.nextLine();
        System.out.println();
    }
    void form(){
        for(int i=0; i<str.length(); i++){
            if(msk.indexOf(str.charAt(i))==-1){
                nstr=nstr+str.charAt(i);
            }
        }
    }
    void display(){
        System.out.println("original string: "+str);
        System.out.println("new string: "+nstr);
    }
}