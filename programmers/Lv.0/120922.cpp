//종이 자르기
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120922
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-종이-자르기

#include <string>
#include <vector>

using namespace std;

int solution(int M, int N) {
    
    return (M-1)+(M*(N-1));
}