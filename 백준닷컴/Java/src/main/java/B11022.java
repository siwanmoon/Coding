import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class B11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // Test Case 개수
        int A; // 더할 숫자 A
        int B; // 더할 숫자 B

        for (int i = 1; i <= T; i++) { // Case 별 출력
            StringTokenizer st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            System.out.printf("Case #%d: %d + %d = %d\n", i, A, B, A + B);
        }
    }
}
