import java.io.*;
public class stdrecord {
    public static void main(String[] args) {
        StudentAnalyzer s=new StudentAnalyzer();
        s.analyzeFile();
        s.averageMarks();
        s.displayResult();
    }
}
class StudentAnalyzer{
    private int totalStudents;
    private int gradeACount;
    private int totalMarks;
    public void analyzeFile(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("student.txt"));
            String l=br.readLine();
            if(l==null){
                System.out.println("file is empty");
                return;
            }
            while(l!=null){
                String s[]=l.split(",");
                if(s[1].equals("A")){
                    gradeACount++;
                }
                totalMarks+=Integer.parseInt(s[2]);
                totalStudents++;
                l=br.readLine();
            }
        } catch (IOException e) {
            System.out.println("error");
        }
        
    }
    public double averageMarks(){
        double r=(double)totalMarks/totalStudents;
        return r;
    }
    public void displayResult(){
        System.out.println("Total Students: "+totalStudents+"\nGrade A students: "+ gradeACount+"\nAverage marks: "+ averageMarks());
    }
}
/*Student Record Analysis

A text file named students.txt contains records of students. Each line is in the following format:
Name,Grade,Marks
Amit,A,92
Riya,B,78
John,A,88
Sara,C,65
David,B,81
Priya,A,95

Class Specification

Create a class named Student Analyzer.
Data Members
private int totalStudents;
private int gradeACount;
private int totalMarks;
(a) Write a method
public void analyzeFile()
that reads all records from students.txt and performs the following tasks:

1. Count the total number of students.
2. Count the number of students having Grade A.
3. Calculate the total marks of all students.

(b) Write another method
public double Averagemarks(): that returns the average marks of all students.

(c) Write a method
public void displayResult() :that displays the following output:

Total Students : 6
Grade A Students : 3
Average Marks : 83.17*/