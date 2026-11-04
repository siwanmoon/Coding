import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class B28135 {
    public static int check50 (int n) {
        int temp = n;

        for (int i = 1; i <= Math.log10(n); i++) {
            if (temp % 100 == 50) {
                return 1;
            }

            temp /= 10;
        }

        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 1; i < n; i++) {
            cnt += check50(i);
        }

        System.out.println(n + cnt);

        br.close();
    }
}
