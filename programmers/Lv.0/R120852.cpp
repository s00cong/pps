//소인수분해
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120852
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-소인수분해

#include <string>
#include <vector>

using namespace std;


vector<int> solution(int n) {
    vector<int> answer;
    int i = 2;
    while(n>=i){
        bool check = 1;
        while(n%i==0){
            if(check){
                check = 0;
                answer.push_back(i);
            }
            n /= i;
        }
        i++;
    }

    return answer;
}