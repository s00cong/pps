import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<n; i++){
            int a = sc.nextInt();
            sb.append(a).append(" ").append(a).append("\n");
        }
        System.out.println(sb);


    }
}