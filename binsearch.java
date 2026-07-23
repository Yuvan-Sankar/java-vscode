import java.util.*;
class BinSearch1{
    int n;
    int arr[];
    BinSearch1(int nn){
        n=nn;
        arr=new int[n];
    }
    void fillarray(){
        System.out.println("Enter the elements of the list: ");
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
    }
    void sort(){
        int swap;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    swap=arr[j];
                    arr[j]=arr[i];
                    arr[i]=swap;
                }
            }
        }
    }
    int bin_search(int l, int u, int v){
        if(l>u){
            return -1;
        }
        else if(arr[(u+l)/2]==v){
            return (u+l)/2+1;
        }
        else if(arr[(u+l)/2]<v){
            return bin_search((u+l)/2+1, u, v);
        }
        else{
            return bin_search(l, (u+l)/2-1, v);
        }
    }


}
public class binsearch{
    public static void main(String[] args) {
        BinSearch1 b=new BinSearch1(5);
        b.fillarray();
        b.sort();
        System.out.println(b.bin_search(0, 4, 17));
        
    }
}


/*Design a class BinSearch to search for a particular value in an array.

Some of the members of the class are given below:

Class name: BinSearch
Data members/instance variables:
arr[]: to store integer elements
n: integer to store the size of the array
Member functions/methods:
BinSearch(int nn): parameterized constructor to initialize n = nn
void fillarray(): to enter elements in the array
void sort(): sorts the array elements in ascending order using any standard sorting technique
int bin_search(int l, int u, int v): searches for the value ‘v’ using binary search and recursive technique and returns its location
 if found otherwise returns -1

Define the class BinSearch giving details of the constructor(), void fillarray(), void sort() and int bin_search(int, int, int).
 Define the main() function to create an object and call the functions accordingly to enable the task. */