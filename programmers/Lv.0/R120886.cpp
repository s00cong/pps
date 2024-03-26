//A로 B 만들기
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120886
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-A로-B-만들기

#include <string>
#include <vector>
#include <algorithm>
//문자 갯수 비교

using namespace std;

int solution(string before, string after) {
    int answer = 0;
    sort(before.begin(),before.end());
    sort(after.begin(),after.end());
    answer = before==after?1:0;
    return answer;
}