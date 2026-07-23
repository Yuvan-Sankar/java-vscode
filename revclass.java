import  java.util.*;
public class revclass {
    public static void main(String[] args) {
        Revno r=new Revno();
        r.inputnum();
        r.display();
    }
}
class Revno{
    int num;
    Revno(){
        num=0;
    }
    void inputnum(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        num=sc.nextInt();
    }
    int reverse(int nn){
        String sum="";
        sum=Integer.toString(nn);
        if(nn==0){
            return 0;
        }
        
        return ;    
    }
    void display(){
        System.out.println("You entered: "+ num+"\nreverse: "+reverse(num));
    }
}
/*
HINT!!!!!!!!!!!!!! KEEP NUMBER AS INTEGER, EXTRACT THE DIGIT WITH THE HELP OF MOD, JOIN THE REMAINDER IN A STRING VARIABLE,
THEN CONVERT THE STRING BACK TO NORMAL INTEGERS, THEN RETURN
Design a class Revno which reverses an integer number.

Example: 94765 becomes 56749 on reversing the digits of the number.

Some of the members of the class are given below:

Class name: Revno
Data member/instance variable:
num: to store the integer
Member functions/methods:
Revno(): default constructor
void inputnum(): to accept the number
int reverse(int nn): returns the reverse of a number by using recursive technique
void display(): displays the original number along with its reverse by invoking the method reverse()

Specify the class Revno, giving details of the constructor, void inputnum(), int reverse(int) and void
display(). Define the main() function to create an object and call the functions accordingly to enable
the task. */