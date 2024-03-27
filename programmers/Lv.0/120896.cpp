//한 번만 등장한 문자
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120896
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-한-번만-등장한-문자

#include <string>
#include <vector>
#include <algorithm>
using namespace std;

string solution(string s) {
    string answer = "";
    for(int i = 0 ; i <s.size(); i++){
        if(count(s.begin(),s.end(),s[i])==1)answer.push_back(s[i]);
    }
    sort(answer.begin(),answer.end());

    return answer;
}

