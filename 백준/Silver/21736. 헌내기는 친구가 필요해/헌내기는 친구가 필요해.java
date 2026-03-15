import java.io.*;
import java.util.*;
import java.awt.Point;

public class Main {

    static int N, M;
    static char[][] campus;
    static boolean[][] visited;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        campus = new char[N][M];
        visited = new boolean[N][M];

        Point start = null;

        for (int i = 0; i < N; i++) {
            String line = br.readLine();

            for (int j = 0; j < M; j++) {
                campus[i][j] = line.charAt(j);

                if (campus[i][j] == 'I') {
                    start = new Point(i, j);
                }
            }
        }

        int result = bfs(start);

        if (result == 0) System.out.println("TT");
        else System.out.println(result);
    }

    static int bfs(Point start) {

        Queue<Point> q = new LinkedList<>();
        q.offer(start);
        visited[start.x][start.y] = true;

        int count = 0;

        while (!q.isEmpty()) {

            Point cur = q.poll();

            for (int d = 0; d < 4; d++) {

                int nx = cur.x + dx[d];
                int ny = cur.y + dy[d];

                if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                if (visited[nx][ny]) continue;
                if (campus[nx][ny] == 'X') continue;

                visited[nx][ny] = true;

                if (campus[nx][ny] == 'P') count++;

                q.offer(new Point(nx, ny));
            }
        }

        return count;
    }
}