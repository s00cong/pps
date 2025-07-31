import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[9];
        String roomNo = sc.next();
        for(char c : roomNo.toCharArray()){
            if(c-'0'==9){
                number[6]++;
            }
            else number[c-'0']++;
        }
        if(number[6]%2==1){
            ++number[6];
        }
        number[6]/=2;
        System.out.println(Arrays.stream(number).max().getAsInt());

    }
}
