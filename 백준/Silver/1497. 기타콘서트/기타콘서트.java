import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M; 
    static long[] guitars; 
    

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        guitars = new long[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();   //필요없음
            String can = st.nextToken();


            long code = 0L;
            for (int j = 0; j < M; j++) {
                if (can.charAt(j) == 'Y') 
                    code |= (1L << j);
            }
            guitars[i] = code;
        }
        int maxSong = 0;
        int ans = Integer.MAX_VALUE;


        for(int mask = 1; mask< (1<<N); mask++){   
            long songMask = 0L;
            int cnt = 0;

            for(int i = 0; i<N; i++){
                if((mask&(1<<i))!=0){   // 비트마스킹..!
                    cnt++;
                    songMask |= guitars[i];
                }
            }

            int songs = Long.bitCount(songMask); // 비트수 세는거

            if (songs > maxSong) {
                maxSong = songs;
                ans = cnt;

            } else if (songs == maxSong) {
                ans = Math.min(ans, cnt);
            }
        }
        if (maxSong == 0) System.out.println(-1);
        else System.out.println(ans);
    }
}
