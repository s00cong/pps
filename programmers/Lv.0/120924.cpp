//다음에 올 숫자
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120924
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-다음에-올-숫자

#include <string>
#include <vector>

using namespace std;

int solution(vector<int> common) {
    int answer = 0;
    int sub1 = common[1]-common[0];
    int sub2 = common[2]-common[1];
    int div1 = common[1]/common[0];
    int div2 = common[2]/common[1];
    if(sub1==sub2) answer = common[common.size()-1]+sub1;
    else answer = common[common.size()-1] * div1;


    return answer;
}