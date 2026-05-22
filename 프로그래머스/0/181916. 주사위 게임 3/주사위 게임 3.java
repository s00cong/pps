import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] count = new int[7];

        count[a]++;
        count[b]++;
        count[c]++;
        count[d]++;

        int four = 0;
        int three = 0;
        int two1 = 0;
        int two2 = 0;
        int one1 = 0;
        int one2 = 0;

        for (int i = 1; i <= 6; i++) {
            if (count[i] == 4) {
                four = i;
            } else if (count[i] == 3) {
                three = i;
            } else if (count[i] == 2) {
                if (two1 == 0) {
                    two1 = i;
                } else {
                    two2 = i;
                }
            } else if (count[i] == 1) {
                if (one1 == 0) {
                    one1 = i;
                } else {
                    one2 = i;
                }
            }
        }

        if (four != 0) {
            return 1111 * four;
        }

        if (three != 0) {
            return (int) Math.pow(10 * three + one1, 2);
        }

        if (two1 != 0 && two2 != 0) {
            return (two1 + two2) * Math.abs(two1 - two2);
        }

        if (two1 != 0) {
            return one1 * one2;
        }

        return Math.min(Math.min(a, b), Math.min(c, d));
    }
}