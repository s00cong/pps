//구슬을 나누는 경우의 수
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120840
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-구슬을-나누는-경우의-수
#include <string>
#include <vector>

using namespace std;

int solution(int balls, int share) {
    unsigned long long answer = 0;
    int temp = balls-share < share ?  balls - share : share ;
    __int128 k = 1;
    __int128 t = 1;
    int a = temp;
    for(int i = 0; i<temp; i++){
        k*=balls-i;
        t*=a-i;
        
    }
    answer = k/t;
    return answer;
}