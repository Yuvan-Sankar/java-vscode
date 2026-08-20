import java.util.ArrayList;
import java.util.Scanner;
public class Arraylistslibrary{
    public static void main(String[] args) {
        int input=0;
        int id=0;
        int value=0;
        Scanner sc=new Scanner(System.in);
        library l= new library();
        do { 
            System.out.println("what would you like to do?:\n1. add a book\n2. display the books\n3. search for a book\n4.update a price\n5.remove a book\n0.exit");
            input=sc.nextInt();
            switch(input){
                case 1:
                    l.addbook();
                    break;
                case 2:
                    l.displayBooks();
                    break;
                case 3:
                    System.out.println("enter an id to search for: ");
                    id=sc.nextInt();
                    l.searchBook(id);
                    break;
                case 4:
                    System.out.println("enter an id to update for: ");
                    id=sc.nextInt();
                    System.out.println("enter a value to update to");
                    value=sc.nextInt();
                    l.updatePrice(id, value);
                    break;
                case 5:
                    System.out.println("enter an id to remove: ");
                    id=sc.nextInt();
                    l.removeBook(id);
                    break;
                case 0:
                    break;
            }
        } while (input!=0);
    }
}
class library{
    ArrayList<Integer> bookId= new ArrayList<>();
    ArrayList<String> bookName= new ArrayList<>();
    ArrayList<String> author= new ArrayList<>();
    ArrayList<Double> price= new ArrayList<>();
    String buffer="";
    void addbook(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter book ID: ");
        bookId.add(sc.nextInt());
        buffer=sc.nextLine();
        System.out.println("Please enter book name: ");
        bookName.add(sc.nextLine());
        System.out.println("Please enter book price: ");
        price.add(sc.nextDouble());
        System.out.println("Please enter book author: ");
        buffer=sc.nextLine();
        author.add(sc.nextLine());
        System.out.println("Successfully Added");

    }
    void displayBooks(){
        if(bookId.size()==0){
            System.out.println("no books found");
        }
        else{
            for(int i=0; i<bookId.size(); i++){
                System.out.println(bookId.get(i));
                System.out.println(bookName.get(i));
                System.out.println(author.get(i));
                System.out.println(price.get(i));
            }
        }
    }
    void searchBook(int id){
        if(bookId.contains(id)==true){
            System.out.println(bookId.get(id));
            System.out.println(bookName.get(id));
            System.out.println(author.get(id));
            System.out.println(price.get(id));
        }
        else{
            System.out.println("no book found");
        }
    }
    void updatePrice(int id, double newPrice){
        if(bookId.contains(id)==true){
            price.set(bookId.indexOf(id), newPrice);
        }
        else{
            System.out.println("no book found");
        }
    }
    void removeBook(int id){
        if(bookId.contains(id)){
            price.remove(Double.valueOf(id));
        }
        else{
            System.out.println("no book found");
        }
    }
}
/*Question

Write a Java program to maintain the details of books in a library using ArrayList.

Data Members

Use the following ArrayLists:

ArrayList<Integer> bookId
ArrayList<String> bookName
ArrayList<String> author
ArrayList<Double> price
Methods
addBook()
displayBooks()
searchBook(int id)
updatePrice(int id, double newPrice)
removeBook(int id)

Write a menu-driven program using a do-while loop and switch-case.*/