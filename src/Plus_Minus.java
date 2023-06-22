import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Resultant {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        List<Integer> countPos = new ArrayList<>();
        List<Integer> countNeg = new ArrayList<>();
        List<Integer> countZero = new ArrayList<>();

        for(Integer i : arr){

            if (i < 0){
                countNeg.add(i);
            } if (i > 0){
                countPos.add(i);
            } if(i == 0) {
                countZero.add(i);
            }


        }

        System.out.println(String.format("%.6f",(double)countPos.size() / arr.size()));
        System.out.println(String.format("%.6f",(double)countNeg.size() / arr.size()));
        System.out.println(String.format("%.6f",(double)countZero.size() / arr.size()));
    }

}

public class Plus_Minus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Resultant.plusMinus(arr);

        bufferedReader.close();
    }
}
