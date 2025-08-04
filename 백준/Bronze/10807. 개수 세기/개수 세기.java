
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i<n; i++){
            numbers[i] = sc.nextInt();
        }
        int find = sc.nextInt();
        Arrays.sort(numbers);

        int cnt = 0;
        int idx = Arrays.binarySearch(numbers, find);
        if(idx>=0){
            for(int i = 0; i<n;i++){
                if(numbers[i]==find)
                    cnt++;
            }
        }


        System.out.println(cnt);
    }
}
