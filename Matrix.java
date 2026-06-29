import java.util.*;
public class Matrix {
  public static void main(String args[]) {
    int m;
    int n;
    int max=0;
    int min=0;
    int mini=0;
    int minj=0;
    int maxi=0;
    int maxj=0;
    Scanner sc=new Scanner(System.in);
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
            if ((i==0)&&(j==0)){
                min=mat[i][j];
                max=mat[i][j];
            }
            if (mat[i][j]<min){
                min=mat[i][j];
                mini=i+1;
                minj=j+1;
            }
            if (mat[i][j]>max){
                max=mat[i][j];
                maxi=i+1;
                maxj=j+1;
            }
        }
    }
    System.out.println("entered array is:");
    for(int i=0; i<m; i++){
        for(int j=0; j<n;j++){
            System.out.print(mat[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println("smallest number is: "+ min+" at"+ mini+","+minj+" and the largest number is: "+ max+" at "+maxi+"," +maxj);
  }
}