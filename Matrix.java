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
    Boolean bool[][]= new Boolean[m][n];
    System.out.println("enter numbers: ");
    for(int i=0; i<m; i++){
        for(int j=0; j<n;j++){
            mat[i][j]=sc.nextInt();
            bool[i][j]=false;
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
    System.out.println("smallest number is: "+ min+" at "+ mini+","+minj+" and the largest number is: "+ max+" at "+maxi+"," +maxj);
    for(int i=0;i<(m+1)*(n+1); i++){
        maxi=highest(mat, m, n, bool)[0];
        maxj=highest(mat, m, n, bool)[1];
    }
}
    static int[] highest(int mat[][], int m, int n, Boolean bool[][]){
        int max=0;
        int maxi=0;
        int maxj=0;
        for(int i=0; i<m; i++){
        for(int j=0; j<n;j++){
            if ((i==0)&&(j==0)){
                continue;
            }
            if(bool[i][j]==true){
                break;
            }
            if (mat[i][j]>max){
                max=mat[i][j];
                maxi=i+1;
                maxj=j+1;
            }
        }
    }
    return new int[]{maxi, maxj};
    }
}
/*
1. make another 2 dimensional boolean array, with all of the same dimensions as the number array, with all of the values as false
2. make it so that the code finds the highest value that has a false correspondent to the boolean array and swaps it with the last number in the number array that has a false correspondent to the boolean array.
3. for the slot that was just swapped with, change that boolean value to false
 */