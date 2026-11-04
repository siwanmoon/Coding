import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B1316 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < n; i++) {
            if (groupWordChecker(br.readLine())) {
                result++;
            }
        }

        System.out.println(result);
    }

    private static boolean groupWordChecker(String input) {
        List<Character> words = new ArrayList<>();
        char[] inputWords =input.toCharArray();
        char previousWord = inputWords[0];
        words.add(previousWord);

        for (int i = 1; i < inputWords.length; i++) {
            if (previousWord == inputWords[i]) {
                continue;
            }

            if (words.contains(inputWords[i])) {
                return false;
            }

            words.add(inputWords[i]);
            previousWord = inputWords[i];
        }

        return true;
    }
}
