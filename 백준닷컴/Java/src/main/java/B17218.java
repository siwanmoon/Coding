import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B17218 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String passward1 = br.readLine();
        String passward2 = br.readLine();

        int[][] dp = new int[passward1.length() + 1][passward2.length() + 1];

        for (int i = 1; i <= passward1.length(); i++) {
            for (int j = 1; j <= passward2.length(); j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);

                if (passward1.charAt(i -1) == passward2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        int i = passward1.length();
        int j = passward2.length();
        int cnt = dp[i][j];

        while (cnt > 0) {
            if (dp[i][j - 1] != dp[i - 1][j]) {
                if (dp[i][j - 1] > dp[i - 1][j]) {
                    j--;
                } else {
                    i--;
                }
            } else {
                if (dp[i][j] > dp[i - 1][j - 1]) {
                    sb.append(passward1.charAt(i - 1));
                    cnt--;
                }
                i--;
                j--;
            }
        }

        System.out.println(sb.reverse());
    }
}
