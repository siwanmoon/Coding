import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;

public class B1620 {
    public static boolean isInt(String check) {
        try {
            Integer.parseInt(check);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] pokedex = new String[n + 1];
        HashMap pokedexH = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            pokedex[i] = br.readLine();
            pokedexH.put(pokedex[i], i);
        }

        for (int i = 0; i < m; i++) {
            String operation = br.readLine();
            if (isInt(operation)) {
                sb.append(pokedex[Integer.parseInt(operation)]).append("\n");
            } else {
                sb.append(pokedexH.get(operation)).append("\n");
            }
        }

        System.out.println(sb);

        br.close();
    }
}
