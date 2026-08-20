import java.util.ArrayList;
import java.util.Scanner;
public class Arraylistobjects {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();
        int input=0;
        int id=0;
        double value;
        Scanner sc=new Scanner(System.in);
        Student s=new Student(0, "", 0.0);
        do {
            System.out.println("what would you like to do?:\n1. add a student\n2. display the students\n3. search for a student\n4.update a student's marks\n5.remove a student\n6.display topper\n0.exit");
            input=sc.nextInt();
            switch(input){
                case 1:
                    s.addStudent(students);
                    break;
                case 2:
                    s.displayStudents(students);
                    break;
                case 3:
                    System.out.println("enter an id to search for: ");
                    id=sc.nextInt();
                    s.searchStudent(students, id);
                    break;
                case 4:
                    System.out.println("enter an id to update for: ");
                    id=sc.nextInt();
                    System.out.println("enter a value to update to");
                    value=sc.nextDouble();
                    s.updateMarks(students, id, value);
                    break;
                case 5:
                    System.out.println("enter an id to remove: ");
                    id=sc.nextInt();
                    s.removeStudent(students, id);
                    break;
                case 6:
                    s.displayTopper(students);
                case 0:
                    break;
            }
        } while (input!=0);
    }
}

class Student{
     int studentId;
     String studentName;
     double marks;
    public Student(int id, String name, double marks){
        studentId=id;
        studentName=name;
        this.marks=marks;
    }
    public void addStudent(ArrayList<Student> students){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter student name, their id, and then their marks(seperated by newlines)");
        studentName=sc.nextLine();
        studentId=sc.nextInt();
        marks=sc.nextDouble();
        Student s=new Student(studentId, studentName, marks);
        students.add(s);
        System.out.println("Successfully added");
    }
    public void displayStudents(ArrayList<Student> students){
        if(students.isEmpty()){
            System.out.println("no student records");
            return;
        }
        for(Student s: students){
            System.out.println("Student Id: "+s.studentId+"\nStudent name: "+s.studentName+"\nStudent marks:"+s.marks);
        }
    }
    public void searchStudent(ArrayList<Student> students, int id){
        for(Student s: students){
            if(s.studentId==id){
                System.out.println("Student Id: "+s.studentId+"\nStudent name: "+s.studentName+"\nStudent marks:"+s.marks);
                return;
            }
        }
        System.out.println("Student not found");
    }
    public void updateMarks(ArrayList<Student> students, int id, double newMarks){
        for(int i=0; i<students.size(); i++){
            if(students.get(i).studentId==id){
                Student std= new Student(students.get(i).studentId, students.get(i).studentName, newMarks);
                students.set(i, std);
            }
        }
    }
    public void removeStudent(ArrayList<Student> students, int id){
        for(int i=0; i<students.size(); i++){
            if(students.get(i).studentId==id){
                students.remove(i);
                System.out.println("removed");
                return;
            }
        }
    }
    public void displayTopper(ArrayList<Student> students){
        Student highest=new Student(0, "", 0.0);
        for(int i=0; i<students.size(); i++){
            System.out.println(students.get(i).marks);
            System.out.println(highest.marks);
            if(students.get(i).marks>=highest.marks) {
                highest=students.get(i);
                System.out.println("Student Id: "+highest.studentId+"\nStudent name: "+highest.studentName+"\nStudent marks:"+highest.marks);
            }
        }
        System.out.println("student with highest marks is");
        System.out.println("Student Id: "+highest.studentId+"\nStudent name: "+highest.studentName+"\nStudent marks:"+highest.marks);
    }
}
/*Create a Java class named Student to manage the details of students in a coaching institute.

Data Members

The Student class should have the following private data members:

int studentId
String studentName
double marks

Use an ArrayList<Student> to store the records of multiple students.

Methods to be Used

Implement the following methods:

Student(int id, String name, double marks)
A parameterized constructor to initialize the data members.
void addStudent(ArrayList<Student> students)
Accept the details of a student from the user and add the object to the ArrayList.
void displayStudents(ArrayList<Student> students)
Display the details of all students stored in the ArrayList.
void searchStudent(ArrayList<Student> students, int id)
Search for a student using the student ID and display the student's details if found.
Otherwise display "Student Not Found".
void updateMarks(ArrayList<Student> students, int id, double newMarks)
Update the marks of the student with the given student ID.
void removeStudent(ArrayList<Student> students, int id)
Remove the student whose ID matches the given ID.
void displayTopper(ArrayList<Student> students)
Display the details of the student who has scored the highest marks.
Main Method

Write the main() method to perform the following operations using a menu-driven program:

Add Student
Display All Students
Search Student
Update Marks
Remove Student
Display Topper
Exit

Use a do-while loop and switch-case to implement the menu. */