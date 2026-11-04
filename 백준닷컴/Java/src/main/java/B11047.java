import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class B11047 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int result = 0;

        List<Integer> coinValueDesc = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            coinValueDesc.add(Integer.parseInt(br.readLine()));
        }

        coinValueDesc.sort(Comparator.reverseOrder());

        for (int i : coinValueDesc) {
            if (k >= i) {
                result += k / i;
                k %= i;
            }
        }

        System.out.println(result);
    }
}
