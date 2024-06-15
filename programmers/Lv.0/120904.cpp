//숫자 찾기
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120904
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-숫자-찾기

#include <string>
#include <vector>

using namespace std;

int solution(int num, int k) {
    int answer = 0;
    string temp = "";
    temp = to_string(num);
    for(int i = 0;i<temp.size();i++){
        if(temp[i]==48+k) {
            answer = i+1;
            break;
        }
    }

    return answer!=0? answer : -1;
}