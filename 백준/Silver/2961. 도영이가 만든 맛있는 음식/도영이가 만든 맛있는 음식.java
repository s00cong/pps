import java.util.Scanner;

public class Main {
    static int n;
    static int[] a, b;
    static int ret = Integer.MAX_VALUE;    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        b = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        solve(0, 1, 0, false);
        System.out.println(ret);
    }

    public static void solve(int now, int a_gob, int b_sum, boolean used){
        if(now == n){
            if(used) ret = Math.min(ret, Math.abs(a_gob - b_sum));
            return;
        }
        solve(now + 1, a_gob * a[now], b_sum + b[now], true);
        solve(now + 1, a_gob, b_sum, used);
    }
}
