import java.util.Scanner;
public class dude {
    public static void main(String args[]){
        NumDude n=new NumDude();
        n.input();
        n.isDude();

    }
}
    class NumDude{
        int num;
        NumDude(){
           num=0;
        }
        void input(){
            System.out.println("enter number: ");
            Scanner sc= new Scanner(System.in);
            num=sc.nextInt();
            sc.close();
        }
        int sumDigits(int x){
            if(x==0){
                return 0;
            }
            return x%10+sumDigits(x/10);
        }
        void isDude(){
            if(sumDigits(num)==Math.cbrt(num)){
                System.out.println("Is a Dudeney number");
                return;
            }
            System.out.println("Is not a Dudeney number");
        }
    }
/*Design a class NumDude to check if a given number is a Dudeney number or not. A Dudeney number is a positive integer that is a perfect cube,
 such that the sum of its digits is equal to the cube root of the number.
Example: 5832 = (5 + 8 + 3 + 2)^3 = 18^3 = 5832
Some of the members of the class are given below:
Class name: NumDude
Data member/instance variable:
num: to store a positive integer number
Methods/Member functions:
NumDude(): default constructor to initialize the data member with legal initial value.
void input(): to accept a positive integer.
int sumDigits(int x): returns the sum of the digits of number ‘x’ using recursive technique.
void isDude(): checks whether the given number is a Dudeney number by invoking the function sumDigits() and display the result with an appropriate message.
Specify the class NumDude giving details of the constructor(), void input(), int sumDigits(int) and void isDude(). Define a main() function to create an object and call the functions accordingly to enable the task.*/