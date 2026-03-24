import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()); 
        int b = Integer.parseInt(st.nextToken()); 

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < b; i++) {
            String id = br.readLine();

            if (map.containsKey(id)) {
                map.remove(id); 
            }
            map.put(id, i); 
        }

        int count = 0;
        for (String key : map.keySet()) {
            if (count == a) break;
            System.out.println(key);
            count++;
        }
    }
}