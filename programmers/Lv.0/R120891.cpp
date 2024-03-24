//369게임
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120891
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-369게임

#include <string>
#include <vector>
#include <algorithm>
using namespace std;

int solution(int order) {
    int answer = 0;
    string temp = "";
    temp = to_string(order);
    answer+=count(temp.begin(),temp.end(),'3');
    answer+=count(temp.begin(),temp.end(),'6');
    answer+=count(temp.begin(),temp.end(),'9');
    return answer;
}