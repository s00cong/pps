//문자열 정렬하기(1)
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120850
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-문자열-정렬하기-1

#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(string my_string) {
    vector<int> answer;
    for(auto& str : my_string){
        if(48<=str&&str<=57) answer.push_back(str-'0');
    }
    sort(answer.begin(),answer.end());
    return answer;
}