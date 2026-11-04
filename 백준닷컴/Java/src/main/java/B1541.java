import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1541 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "+-", true);
        int result = Integer.parseInt(st.nextToken());

        while (st.hasMoreTokens()) {
            String node = st.nextToken();

            if (node.equals("-")) {
                result -= Integer.parseInt(st.nextToken());

                while (st.hasMoreTokens()) {
                    st.nextToken();
                    result -= Integer.parseInt(st.nextToken());
                }
            } else {
                result += Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(result);
    }
}
