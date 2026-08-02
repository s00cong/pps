class Solution {
    boolean solution(String s) {
        String str = s.toLowerCase();
        int pcnt = 0;
        int ycnt = 0;

        for(int i = 0 ; i < str.length(); i++){
            if(str.charAt(i)=='p') pcnt++;
            else if(str.charAt(i)=='y') ycnt++;
        }

        return pcnt==ycnt;
    }
}