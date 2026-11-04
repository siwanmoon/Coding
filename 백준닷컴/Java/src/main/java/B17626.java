import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B17626 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1];

        for (int i = 1; i <= (int) Math.sqrt(n); i++) {
            dp[i * i] = 1;
        }

        for (int i = 1; i <= n; i++) {
            int result = 4;

            if (dp[i] == 0) {
                for (int j = 1; j <= i / 2; j++) {
                    result = Math.min(result, dp[j] + dp[i - j]);
                }

                dp[i] = result;
            }
        }

        System.out.println(dp[n]);
    }
}
