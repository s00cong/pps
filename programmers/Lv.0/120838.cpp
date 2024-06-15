//모스부호 (1)
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120838
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-모스부호-1

#include <string>
#include <vector>
#include <sstream>
#include <map>

using namespace std;

string solution(string letter) {
    map<string, string> morse {
        {".-","a"},{"-...","b"},{"-.-.","c"},{"-..","d"},
        {".","e"},{"..-.","f"},{"--.","g"},{"....","h"},
        {"..","i"},{".---","j"},{"-.-","k"},{".-..","l"},
        {"--","m"},{"-.","n"},{"---","o"},{".--.","p"},
        {"--.-","q"},{".-.","r"},{"...","s"},{"-","t"},
        {"..-","u"},{"...-","v"},{".--","w"},{"-..-","x"},
        {"-.--","y"},{"--..","z"}
    };
    string temp = "";
    string answer = "";
    stringstream ss(letter);
    while(ss>>temp){
        if(morse.find(temp)!=morse.end()) answer+=morse[temp];
    }
    return answer;
}