import java.io.*;
import java.util.*;
public class file {
    public static void main(String[] args)throws IOException {
        File f1=new File("yuvan.txt");
        if(f1.createNewFile()){
            System.out.println("file created");
        }
        else{
            System.out.println("File already exists");
        }
        FileWriter f2=new FileWriter("yuvan.txt");
        f2.write("Java\n");
        f2.write("computer science\n");
        f2.close();
        FileWriter f3=new FileWriter("yuvan.txt", true);
        f3.write("c++\n");
        f3.close();
        System.out.println("data written");
        Scanner sc=new Scanner(f1);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
        if(f1.delete()){
            System.out.println("file was deleted");
        }
        else{
            System.out.println("file does not exist");
        }
    }
}
