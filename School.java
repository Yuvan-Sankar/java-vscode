public class School {
    public static void main(String[] args) {
        //Student st1=new Student();
        Student st2=new Student("Yuvan", 11, "07-17-10", 97);
        //st1.print();
        st2.print();
    }
}
class Student{
    String name;
    int grade;
    String DOB;
    int average;
    String letter;
    /*public Student() {
        name="###";
        grade=0;
        DOB="00-00-00";
        average=0;
        letter="#";
    }*/
    public Student(String n, int g, String b, int a){
        name=n;
        grade=g;
        DOB=b;
        average=a;
    }
    void print(){
        System.out.println("Name: "+name+"\nGrade: "+grade+"\nBirthday: "+DOB+"\nAverage: "+average);
        percentage();
    }
    void percentage(){
        if(average>90){
            letter="A";
        }
        else if(average>80){
            letter="B";
        }
        else if(average>70){
            letter="C";
        }
        else if(average>=65){
            letter="D";
        }
        else if(average<65){
            letter="F";
        }
        System.out.println("Letter grade: "+letter);
    }
}