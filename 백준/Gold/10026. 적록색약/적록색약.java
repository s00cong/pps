import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static char[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new char[N][N];
        for (int i = 0; i < N; i++) {
            map[i] = br.readLine().toCharArray();
        }

        int normal = 0;
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    dfsNormal(i, j, map[i][j]);
                    normal++;
                }
            }
        }

        int colorBlind = 0;
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    dfsBlind(i, j, map[i][j]);
                    colorBlind++;
                }
            }
        }

        System.out.println(normal + " " + colorBlind);
    }

    static void dfsNormal(int x, int y, char color) {
        visited[x][y] = true;

        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];

            if (nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
            if (visited[nx][ny]) continue;
            if (map[nx][ny] != color) continue;

            dfsNormal(nx, ny, color);
        }
    }

    static void dfsBlind(int x, int y, char color) {
        visited[x][y] = true;

        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];

            if (nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
            if (visited[nx][ny]) continue;

            if (color == 'B') {
                if (map[nx][ny] == 'B') {
                    dfsBlind(nx, ny, color);
                }
            } else {
                if (map[nx][ny] == 'R' || map[nx][ny] == 'G') {
                    dfsBlind(nx, ny, map[nx][ny]);
                }
            }
        }
    }
}