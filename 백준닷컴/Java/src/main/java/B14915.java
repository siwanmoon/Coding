import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class B14915 {
    public static char remainder(int i) {
        if (i < 10) {
            return (char) (i + '0');
        } else {
            return (char) (i - 10 + 'A');
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        if (m == 0){
            sb.append(0);
        } else {
            while(m > 0) {
                sb.append(remainder(m % n));
                m /= n;
            }
        }

        System.out.println(sb.reverse().toString());

        br.close();
    }
}
