//합성수 찾기
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120846
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-합성수-찾기

#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    int answer = 0;
    int cnt = 0;
    for(int i = 1; i<=n; i++){
        for(int j = 2; j<=i/2; j++){
            if(i%j==0)cnt++;
        }
        if(cnt>0)answer++;
        cnt = 0;
    }
    return answer;
}