import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Resultos {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        // Write your code here


        // outer loop for the rows
        for (int i = 1; i <= n; i++) {
            // this inner loop for the print spaces
            // j<= n - i for relation between rows and column
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");

            }
            // this loop for the columns
            for (int k = 1; k <= i ; k++) {
                System.out.print("#");

            }
            System.out.println();

        }



        }


    }



public class Staircase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Resultos.staircase(n);

        bufferedReader.close();
    }
}
