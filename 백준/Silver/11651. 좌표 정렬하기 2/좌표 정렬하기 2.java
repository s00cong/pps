
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static class Point {
        int x,y;

        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
        
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Point[] arr = new Point[N];

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i] = new Point(x, y);
        }

        Arrays.sort(arr, (a,b)->{
            if(a.y != b.y){
                return Integer.compare(a.y, b.y);
            }
            return Integer.compare(a.x, b.x);
        });

        for (Point p : arr){
            sb.append(p.x).append(' ').append(p.y).append('\n');
        }

        System.out.println(sb);

    }
}

