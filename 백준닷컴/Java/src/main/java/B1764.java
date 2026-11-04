import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class B1764 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Set<String> nNames = new HashSet<>();
        Set<String> mNames = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            nNames.add(br.readLine());
        }

        for (int i = 0; i < m; i++) {
            mNames.add(br.readLine());
        }

        List<String> result = nNames.stream()
                .filter(mNames::contains)
                .sorted()
                .collect(Collectors.toList());

        sb.append(result.size()).append("\n");

        for (String s : result) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);
    }
}
