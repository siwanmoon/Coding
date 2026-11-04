import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1654 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] cable = new int[k];
        long max = 0;
        long min = 1;

        for (int i = 0; i < k; i++) {
            cable[i] = Integer.parseInt(br.readLine());

            if (cable[i] > max) {
                max = cable[i];
            }
        }

        while (max >= min) {
            long mid = (max + min) / 2;
            long result = 0;

            for (int i = 0; i < k; i++) {
                result += cable[i] / mid;
            }

            if (result >= n) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        System.out.println(min - 1);
    }
}
