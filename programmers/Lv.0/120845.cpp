//주사위 개수
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120845
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-주사위-개수

#include <string>
#include <vector>

using namespace std;

int solution(vector<int> box, int n) {
    int answer = 1;
    for (auto &i : box)
        answer*=i/n;
    return answer;
}