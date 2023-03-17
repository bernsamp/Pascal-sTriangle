import java.util.*;

public class Main{

    // https://en.wikipedia.org/wiki/Pascal%27s_triangle

    static int fact(int num){
        int factorial;

        for(factorial = 1; num > 1; num--){
            factorial *= num;
        }
        return factorial;
    }
    static int ncr(int n,int r){
        return fact(n) / ( fact(n-r) * fact(r) );
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows fir the Pascal's Triangle:");
        int rows = sc.nextInt();
        sc.close();

        System.out.println("\nPascal's Triangle:");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < rows-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print(" " + ncr(i, j));
            }
            System.out.println();
        }
    }
}