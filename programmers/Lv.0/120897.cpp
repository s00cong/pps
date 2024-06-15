//약수 구하기
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120897
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-약수-구하기

#include <string>
#include <vector>

using namespace std;

vector<int> solution(int n) {
    vector<int> answer;
    for(int i = 1; i<=n; i++)
        if(n%i==0)answer.push_back(i);
    return answer;
}