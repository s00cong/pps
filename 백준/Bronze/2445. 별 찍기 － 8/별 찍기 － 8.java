import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i<=2*n; i++){
            if(i<n){
                for(int j = 0; j < i; j++){
                    sb.append("*");
                }
                for(int j = 0; j<2*(n-i);j++){
                    sb.append(" ");
                }
                for(int j = 0; j < i; j++){
                    sb.append("*");
                }
            }
            else{
                for(int j = 0; j < 2*n-i; j++){
                    sb.append("*");
                }
                for(int j = 0; j<2*(i-n);j++){
                    sb.append(" ");
                }
                for(int j = 0; j < 2*n-i; j++){
                    sb.append("*");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);

/* 삼각형 만들기 (공백)
 * 총 2*n번은 반복함
 * 1 10-2*i 1
 * 2 10-2*2 2
 * 3 10-2*3 3
 *  
 * 
 * 
 */


    }
}
