import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static int[][] mul(int [][] a){
        int b[][] = {{1,1,0},{1,0,1},{1,0,0}};
        int c[][] = {{0,0,0},{0,0,0},{0,0,0}};
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                for(int k=0;k<3;k++)
                    c[i][j] +=a[i][k]*b[k][j];
        return c;
    }

    // Complete the stepPerms function below.
    static int stepPerms(int n) {
        int a[][] = {{1,1,0},{1,0,1},{1,0,0}};
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else if (n == 3) {
            return 4;
        } else {
            for (int i = 0; i < n -2; i++) {
                a = mul(a);}
            return 4 * a[0][2] + 2* a[1][2] + a[2][2];

        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        int s = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        for (int sItr = 0; sItr < s; sItr++) {
//            int n = scanner.nextInt();
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int n = 7;
            int res = stepPerms(n);
        System.out.println(res);

//            bufferedWriter.write(String.valueOf(res));
//            bufferedWriter.newLine();
//        }

//        bufferedWriter.close();

//        scanner.close();
    }
}
