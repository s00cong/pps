import java.io.*;

public class Main {
    static char[][] arr;

    public static void draw(int x, int y, int n) {
        if (n == 3) {
            arr[x][y] = '*';
            arr[x + 1][y - 1] = '*';
            arr[x + 1][y + 1] = '*';
            for (int i = -2; i <= 2; i++) {
                arr[x + 2][y + i] = '*';
            }
            return;
        }

        int half = n / 2;
        draw(x, y, half); 
        draw(x + half, y - half, half); 
        draw(x + half, y + half, half); 
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new char[n][2 * n - 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                arr[i][j] = ' ';
            }
        }

        draw(0, n - 1, n);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append('\n');
        }

        System.out.print(sb);
    }
}