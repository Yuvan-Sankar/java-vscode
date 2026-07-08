import java.util.*;
public class Objectarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Library a[]=new Library[3];
        int id;
        String name;
        String issue;
        int f;
        for(int i=1; i<=a.length; i++){
            System.out.println("Student number #"+i);
            System.out.println("Enter id, followed by the book name, followed by the date of issue, followed by the amount of fines owed: ");
            id=sc.nextInt();
            name=sc.nextLine();
            System.out.println("Date: ");
            issue=sc.nextLine();
            f=sc.nextInt();
            a[i-1]=new Library(id, name, issue, f);
        }
        System.out.println("the student with the highest debt is: ");
        a[0].highest(a).display();
        System.out.println("the sum of all students' debt is: ");
        int sum=a[0].sum(a);
        System.out.println(sum);
    }
}
class Library{
    int stid;
    String bname;
    String DOI;
    int fine;
    public Library(int id, String name, String issue, int f){
        stid=id;
        bname=name;
        DOI=issue;
        fine=f;
    }
    Library highest(Library a[]){
        int high=0;
        int index=0;
        for(int i=0; i<a.length; i++){
            if(a[i].fine>high){
                high=a[i].fine;
                index=i;
            }
        }
        return a[index];
    }
    void display(){
        System.out.println("Student id: "+stid+"\nBook name: "+bname+"\nDate of Issue: "+DOI+"\nFines: "+fine);
    }
    int sum(Library a[]){
        int sum=0;
        for(int i=0; i<a.length; i++){
            sum+=a[i].fine;
        }
        return sum;
    }
}