import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line ; 
        StringBuilder sb = new StringBuilder();
        while(!(line=br.readLine()).equals("0")){
            String str = "";
            for(int i = line.length()-1; i>=0; i--){
                str += Character.toString(line.charAt(i));
            }
            if(line.equals(str)) sb.append("yes").append('\n');
            else sb.append("no").append('\n');
        }
        System.out.println(sb.toString());
    }
}
