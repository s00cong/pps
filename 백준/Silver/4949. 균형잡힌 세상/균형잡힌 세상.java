import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        

        while(!(line = br.readLine()).equals(".")){
            StringTokenizer st = new StringTokenizer(line);
            Stack<Character> stack = new Stack<>();
            boolean ok = true;

            while(st.hasMoreTokens() && ok){
                String temp = st.nextToken();
                for(char c : temp.toCharArray()){
                    if(c=='('||c=='[') stack.push(c);
                    
                    else if(c == ')'){
                        if(stack.isEmpty() || stack.pop() != '(') {
                            ok = false;
                            break;
                        }
                    }
                    else if(c == ']'){
                        if(stack.isEmpty() || stack.pop()!='['){
                            ok = false;
                            break;
                        }
                    }
                }
                
            }
            if(!stack.isEmpty()) ok = false;
            System.out.println(ok?"yes":"no");
        }

    }
}
