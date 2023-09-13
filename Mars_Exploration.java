import java.io.*;
import java.util.*;

class Result {

    public static int marsExploration(String s) {
        String original = "SOS";
        int DeveationCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != original.charAt(i % 3)) {
                DeveationCount++;
            }
        }

        return DeveationCount;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
