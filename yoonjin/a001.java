package yoonjin;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
    
        List<Integer> size = new ArrayList<>();
        for (int element : s) {
            size.add(element);
        }
        Collections.sort(size, Collections.reverseOrder());
        //strList.remove(2);
        int count=0;
        Integer[] greed = Arrays.stream(g).boxed().toArray(Integer[]::new);
        Arrays.sort(greed, Comparator.reverseOrder());
        

        for(int i=0; i<g.length; i++){
            
            for(int j=0; j<size.size(); j++){
                if(greed[i]<=size.get(j)){
                    count+=1;
                    size.remove(j);
                    break;
                }
            }
        }

        return count;

    }
}