import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        boolean hasUnderscore = s.contains("_");
        boolean hasUpper = false;

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            }
        }

        if (s.startsWith("_") || s.endsWith("_") || s.contains("__") || 
            (hasUnderscore && hasUpper) || Character.isUpperCase(s.charAt(0))) {
            System.out.println("Error!");
            return;
        }

        StringBuilder sb = new StringBuilder();

        // C++ -> Java
        if (hasUnderscore) {
            boolean upperNext = false;

            for (char c : s.toCharArray()) {
                if (c == '_') {
                    upperNext = true;
                } else {
                    if (upperNext) {
                        sb.append(Character.toUpperCase(c));
                        upperNext = false;
                    } else {
                        sb.append(c);
                    }
                }
            }
        }
        // Java -> C++
        else if (hasUpper) {
            for (char c : s.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    sb.append('_');
                    sb.append(Character.toLowerCase(c));
                } else {
                    sb.append(c);
                }
            }
        }
        else {
            sb.append(s);
        }

        System.out.println(sb.toString());
    }
}