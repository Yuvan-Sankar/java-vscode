public class Addition {
    public static void main(String[] args) {
        Number num1= new Number(23);
        Number num2= new Number(2);
        Number num3=num1.Add(num2);
        num3.print();

    }
}
class Number{
    int x;
public Number(int x){
    this.x=x;
}
void print(){
    System.out.println(x);
}
Number Add(Number num2){
    Number num3=new Number(0);
    num3.x=x+num2.x;
    return num3;
}
}