import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4740 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String sentence = br.readLine();

            if (sentence.equals("***")) {
                break;
            }

            for (int i = sentence.length() - 1; i >= 0; i--) {
                sb.append(sentence.charAt(i));
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
