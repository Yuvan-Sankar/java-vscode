import java.util.*;
public class CommonMult {
    public static void main(String[] args) {
        LCM n= new LCM();
        n.accept();
        n.getLCM();
        n.display();
    }
}
class LCM{
    int n1, n2, large, sm, l;
    LCM(){
        n1=0;
        n2=0;
        large=0;
        sm=0;
        l=0;
    }
    void accept(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 2 different integers: ");
        n1=sc.nextInt();
        n2=sc.nextInt();
        if(n1>n2){
            large=n1;
            sm=n2;
        }
        else{
            large=n2;
            sm=n1;
        }
        l=large;
    }
    int getLCM(){
        if(l%sm==0){
            return l;
        }
        l=l+large;
        return getLCM();
    }
    void display(){
        System.out.println("number 1: "+n1+"\nnumber 2: "+n2+"\nLCM: "+l);
    }
}
/*A class LCM has been defined to find the Lowest Common Multiple of two integers.

Some of the data members and member functions are given below:

Class name: LCM
Data members/instance variables:
n1: to store an integer number
n2: to store an integer number
large: integer to store the largest from n1, n2
sm: integer to store the smallest from n1, n2
l: to store LCM of two numbers
Methods/Member functions:
LCM(): default constructor to initialize data members with legal initial values
void accept(): to accept n1 and n2
int getLCM(): returns the LCM of n1 and n2 using the recursive technique
void display(): to print the numbers n1, n2 and LCM

Specify the class LCM giving details of the constructor, void accept(), int getLCM() and void display().
Define a main() function to create an object and call the member functions accordingly to enable the task.*/