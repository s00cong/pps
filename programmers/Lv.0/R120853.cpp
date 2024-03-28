//컨트롤 제트
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120853
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-컨트롤-제트

#include <string>
#include <vector>
#include <sstream>

using namespace std;

int solution(string s) {
    int answer = 0;
    
    string temp="";
    vector<string> string_list;
    
    stringstream stream;
    stream.str(s);
    while(stream>>temp)string_list.push_back(temp);

    for(int i = 0; i<string_list.size(); i++){
        if(string_list[i] =="Z"){
            answer -= stoi(string_list[i-1]);
        }
        else answer += stoi(string_list[i]);
    }

    return answer;
}