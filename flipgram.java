import java.util.*;
public class flipgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = sc.next().toUpperCase();
        boolean isFlip = false;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (input.indexOf(c) < i) {
                    isFlip = true;
                    break;
            }
        }
        if(isFlip==false){
            System.out.println("HETEROGRAM");
            System.exit(0);
        }
        if(input.length()%2==0){
            String first=input.substring(0, input.length()/2);
            String second=input.substring(input.length()/2, input.length());
            System.out.println(second+first);
        }
        else{
            String first=input.substring(0, input.length()/2);
            String second=input.substring(input.length()/2+1, input.length());
            String middle=input.substring(input.length()/2, input.length()/2+1);
            System.out.println(second+middle+first);
        }
            

    }
}
/*
1. take input
2. check if letter is a heterogram, if it is, display heterogram
3. check if length of the string is even or odd
4. if even, split the string into two halves and reverse each half
5. if odd, split the string into two halves, reverse each half and keep the middle character
*/