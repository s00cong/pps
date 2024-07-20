//치킨 쿠폰
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120884
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-치킨-쿠폰

#include <string>
#include <vector>

using namespace std;

int solution(int chicken) {
    int answer = 0;
    while(chicken>9){
        answer+=chicken/10;
        chicken=chicken/10+chicken%10;
    }
   
    return answer;
}