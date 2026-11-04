import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class B11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] set = new int[21];
        int numberOfOperations = Integer.parseInt(br.readLine());

        for (int i = 0; i < numberOfOperations; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String operation = st.nextToken();
            int num;

            switch (operation) {
                case "add":
                    num = Integer.parseInt(st.nextToken());
                    set[num] = 1;
                    break;
                case "remove":
                    num = Integer.parseInt(st.nextToken());
                    set[num] = 0;
                    break;
                case "check":
                    num = Integer.parseInt(st.nextToken());
                    sb.append(set[num]).append("\n");
                    break;
                case "toggle":
                    num = Integer.parseInt(st.nextToken());
                    set[num] = 1 - set[num];
                    break;
                case "all":
                    Arrays.fill(set, 1);
                    break;
                case "empty":
                    Arrays.fill(set, 0);
                    break;
            }
        }

        System.out.println(sb);

        br.close();
    }
}
