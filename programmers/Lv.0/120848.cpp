//팩토리얼
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120848
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-팩토리얼


#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    int answer = 0;
    int temp = 1;
    vector<int> fac;
    fac.push_back(1);

    for(int i = 2; i<=10; i++){
        fac.push_back(fac[i-2]*i);
    }

    for(int i = 0; i<10; i++){
        if(fac[i]==n) {
            answer = i+1;
            break;
        }
        else if(fac[i]>n) {
            answer = i; 
            break;
        }
    }



    return answer;
}