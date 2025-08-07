import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();

        while(T-- >0){
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            int floor, room;

            if(N%H == 0) {
                floor = H;
                room = N/H;
            }
            else {
                floor = N%H;
                room = N/H+1;
            }
            System.out.printf("%d%02d\n",floor,room);
            
        }
        
    }
}
