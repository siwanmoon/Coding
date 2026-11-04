import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B9375 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCaseNumber = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCaseNumber; i++) {
            int outfitNumber = Integer.parseInt(br.readLine());
            HashMap<String, Integer> outfit = new HashMap<>();

            for (int j = 0; j < outfitNumber; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String outfitType = st.nextToken();

                if (outfit.containsKey(outfitType)) {
                    outfit.replace(outfitType, outfit.get(outfitType) + 1);
                } else {
                    outfit.put(outfitType, 1);
                }
            }

            int result = 1;

            for (Map.Entry<String, Integer> entry : outfit.entrySet()) {
                result *= (entry.getValue() + 1);
            }

            sb.append(result - 1).append("\n");
        }

        System.out.println(sb);
    }
}
