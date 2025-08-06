import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        for(int i = 0 ; i<n;i++){
            for(int j = n-i-1; j>0;j--)
                sb.append(" ");
            for(int j= 0; j<2*i+1; j++){
                sb.append("*");
            }
            
            sb.append("\n");
        }

/*
 * 1 7 
 * 2 5
 * 3 3
 * 4 1
 */
        for(int i = 1 ; i<n;i++){
            for(int j = 0; j<i;j++)
                sb.append(" ");


            for(int j= 0; j<2*(n-i)-1; j++){
                sb.append("*");
            }
            
            sb.append("\n");
        }

        System.out.println(sb);


    }
}
