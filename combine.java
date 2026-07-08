import java.util.*;
public class combine {
    public static void main(String[] args) {
        Mixarray l1= new Mixarray(5);
        Mixarray l2= new Mixarray(6);
        l1.input();
        l2.input();
        Mixarray l3= l1.mix(l1, l2);
        l1.Display();
        l2.Display();
        l3.Display();

    }
}
class Mixarray{
    int arr[];
    int cap;
    public Mixarray(int mm){
        cap=mm;
        arr=new int[cap];
    }
    void input(){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your numbers to be in the list: ");
        for(int i=0; i<cap; i++){
            arr[i]= sc.nextInt();
        }
    }
    Mixarray mix(Mixarray P, Mixarray Q){
        Mixarray R=new Mixarray(6);
        for(int i=0; i<6; i++){
            if(i<3){
                R.arr[i]=P.arr[i];
            }
            if(i>2){
                R.arr[i]=Q.arr[i-3];
            }
        }
        return R;
    }
    void Display(){
        System.out.print("list: \n[");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}