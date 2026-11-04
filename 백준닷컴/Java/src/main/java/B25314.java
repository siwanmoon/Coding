import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class B25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        while (n >= 4) {
            sb.append("long ");
            n -= 4;
        }

        sb.append("int");
        System.out.println(sb);

        br.close();
    }
}
