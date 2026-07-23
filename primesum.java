import java.util.Scanner;

public class primesum {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        int m;
        int n;
        int rowsum;
        int highrow=0;
        int columnsum;
        int highcolumn=0;
        int rowx=0;
        int columny=0;
        System.out.println("enter the amount of rows, followed by the amount of collumns:");
        do{
            m=sc.nextInt();
            n=sc.nextInt();
        }while((m>20)||(m<2)||(n>20)||(n<2));
        int mat[][]= new int[m][n];
        System.out.println("enter numbers: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("entered array is:");
        for(int i=0; i<m; i++){
            for(int j=0; j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0; i<m; i++){
            rowsum=0;
            for(int j=0; j<n; j++){
                if(prime(mat[i][j])){
                    rowsum+=mat[i][j];
                }
            }
            if (rowsum>highrow){
                highrow=rowsum;
                rowx=i+1;
            }
        }
        for(int j=0; j<n; j++){
            columnsum=0;
            for(int i=0; i<m; i++){
                if(prime(mat[i][j])){
                    columnsum+=mat[i][j];
                }
            }
            if (columnsum>highcolumn){
                highcolumn=columnsum;
                columny=j+1;
            }
        }
        System.out.println("the highest sum of the rows and collumns are:\nrow number "+rowx+" with a sum of: "+ highrow+"\ncolumn number "+columny+" at: "+highcolumn);
        sc.close();
    }
    static boolean prime(int n){
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
