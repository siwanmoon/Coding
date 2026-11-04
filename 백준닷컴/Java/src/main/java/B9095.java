import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class B9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int TestCaseNumber = Integer.parseInt(br.readLine());
        int[] result = new int[11];

        result[1] = 1;
        result[2] = 2;
        result[3] = 4;

        for (int i = 4; i <= 10; i++) {
            result[i] = result[i - 1] + result[i - 2] + result[i - 3];
        }

        for (int i = 0; i < TestCaseNumber; i++ ) {
            sb.append(result[Integer.parseInt(br.readLine())])
                    .append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}
