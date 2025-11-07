
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int S,P;
    static int[] numbers = new int[4];
    static int[] temp = new int[4];
    static int cnt;
    static int prev_idx;
    public static void main(String[] args) throws  IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        S = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());

        String code = br.readLine();
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < 4; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0 ; i <P; i++ ){
            char a = code.charAt(i);
            temp[idx(a)]++;
        }
        if(check()) cnt++;
        
        

        for(int i = P; i<S;i++){

            temp[idx(code.charAt(i-P))]--;
            temp[idx(code.charAt(i))]++;
            if(check())cnt++;
            
        }

        System.out.println(cnt);
    }

    static boolean check(){
        for(int i = 0 ; i < 4; i++){
            if(temp[i]-numbers[i]<0) {
                return false;
            }
        }
        return true;
    }

    static int idx(char c) {
        if (c == 'A') return 0;
        if (c == 'C') return 1;
        if (c == 'G') return 2;
        return 3; // 'T'
    }


}
