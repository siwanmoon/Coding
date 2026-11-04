import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class B30617 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int previousL = 0;
        int previousR = 0;
        int rotationL;
        int rotationR;
        int counter = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            rotationL = Integer.parseInt(st.nextToken());
            rotationR = Integer.parseInt(st.nextToken());

            if ((previousL == rotationL && (previousL == 1 || previousL == -1))) {
                counter ++;
            } if (previousR == rotationR && (previousR == 1 || previousR == -1)) {
                counter ++;
            } if (rotationL == rotationR && (rotationL == 1 || rotationL == -1)) {
                counter ++;
            }

            previousL = rotationL;
            previousR = rotationR;
        }

        System.out.println(counter);

        br.close();
    }
}
