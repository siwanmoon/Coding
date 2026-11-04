import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B17219 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, String> passward = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            passward.put(st2.nextToken(), st2.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            sb.append(passward.get(br.readLine())).append("\n");
        }

        System.out.println(sb);
    }
}
