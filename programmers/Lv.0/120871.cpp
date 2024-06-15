//저주의 숫자 3
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120871
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-저주의-숫자-3

#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    int answer = 0;
    
    for(int i = 1; i<=n; i++ ){
        answer++;
        while(answer%3==0||to_string(answer).find("3")!=string::npos) answer++;
        
    }

    return answer;
}