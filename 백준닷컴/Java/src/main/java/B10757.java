import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class B10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String str_A = st.nextToken();
        String str_B = st.nextToken();

        int max_length = Math.max(str_A.length(), str_B.length());
        int[] int_A = new int[max_length + 1];
        int[] int_B = new int[max_length + 1];

        for (int i = str_A.length() - 1; i >= 0; i--) {
            int_A[str_A.length() - 1 - i] = str_A.charAt(i) - '0';
        }

        for (int i = str_B.length() - 1; i >= 0; i--) {
            int_B[str_B.length() - 1 - i] = str_B.charAt(i) - '0';
        }

        for (int i = 0; i <max_length; i++) {
            int_A[i] += int_B[i];
            int_A[i + 1] += int_A[i] / 10;
            int_A[i] %= 10;
        }

        StringBuilder sb = new StringBuilder();
        if (int_A[max_length] != 0) {
            sb.append(int_A[max_length]);
        }

        for (int i = max_length - 1; i >= 0; i--){
            sb.append(int_A[i]);
        }

        System.out.println(sb);
        br.close();
    }
}
