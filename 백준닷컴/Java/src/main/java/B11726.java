import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class B11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] result = new int[1001];
        result[1] = 1;
        result[2] = 2;

        int n = Integer.parseInt(br.readLine());

        for (int i = 3; i <= n; i++) {
            result[i] = (result[i - 1] + result[i - 2]) % 10007;
        }

        System.out.println(result[n]);

        br.close();
    }
}
