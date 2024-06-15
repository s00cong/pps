//문자열 정렬하기 (2)
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120911
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-문자열-정렬하기-2

#include <string>
#include <vector>
#include <algorithm>

using namespace std;

string solution(string my_string) {
    string answer = "";
    for(auto str : my_string){
        answer += tolower(str);
    }
    sort(answer.begin(),answer.end());
    
    return answer;
}