import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

/*
4 1 (2i+1) (i=0)
3 3 (2*1+1) (i=1)
2 5 (2*2 + 1) (i=2)
1 7
0 9 (2*)
*/

    for(int i = 0 ; i<n;i++){
        for(int j = n-i-1; j>0;j--)
            System.out.print(" ");
        for(int j= 0; j<2*i+1; j++){
            System.out.print("*");
        }
        System.out.println();
    }

    }
}