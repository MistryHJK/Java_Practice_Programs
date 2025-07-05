import java.sql.SQLOutput;
import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines you want: ");
        int n = sc.nextInt();
        for(int i = 0; i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.println();
            }
            for(int j=0;j<2*i-1;j++){
                System.out.print("*");
            }
            for(int j = 0; j < n-i-1;j++){
                System.out.println();
            }
        }
        sc.close();
    }
}
