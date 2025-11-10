
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, L; //신호등 개수 & 도로의 길이
    static int D,R,G; // 신호등 위치, 빨,초의 지속시간
    static int time;


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        int position = 0;
        
    	for(int i = 0 ; i < N ;i++) {
    		st = new StringTokenizer(br.readLine());
    		D = Integer.parseInt(st.nextToken());
    		R = Integer.parseInt(st.nextToken());
			G = Integer.parseInt(st.nextToken());
			
			time += (D-position);
			position = D;
			
			int cycle = R+G;
			
			int now = time % cycle;
			
			if(now<R) {
				time +=(R-now);
			}
    		
    	}
    	
    	time += (L-position);
    	
    	System.out.println(time);

    }
}
