import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class B1773 {
    public static boolean setoffFirecrackers(int t, int[] cycle) {
        for (int c : cycle) {
            if (t % c == 0) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] cycle = new int[n];
        int counter = 0;

        for (int i = 0; i < n; i++) {
            cycle[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 1; i <= c; i++) {
            if (setoffFirecrackers(i, cycle)) {
                counter++;
            }
        }

        System.out.println(counter);

        br.close();
    }
}
