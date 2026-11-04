import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class B1157 {
    public static char checkMax(int max, int[] wordcount) {
        int count = 0;
        char maxAlphabet = '0';

        for (int i = 0; i < wordcount.length; i++) {
            if (wordcount[i] == max) {
                count++;
                maxAlphabet = (char) (i + 'A');
            }

            if (count > 1) {
                return '?';
            }
        }

        return maxAlphabet;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toUpperCase();
        int[] wordcount = new int[26];

        for (int i = 0; i < word.length(); i++) {
            wordcount[word.charAt(i) - 'A']++;
        }

        int max = Arrays.stream(wordcount).max().getAsInt();
        System.out.println(checkMax(max, wordcount));

        br.close();
    }
}
