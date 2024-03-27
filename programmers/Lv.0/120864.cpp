//숨어있는 숫자의 덧셈 (2)
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120864
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-숨어있는-숫자의-덧셈-(2)

#include <string>
#include <vector>
#include <iostream>

using namespace std;

int solution(string my_string) {
    int answer = 0;
    int temp = 1;
    bool continuity = false;

    for(int i = 0; i < my_string.size();i++){
        if(isdigit(my_string[i])){
            if(continuity){
                temp *= 10;
                temp += my_string[i]-'0'; 
            }
            else {
                temp = my_string[i]-'0';
                continuity = true;
            }
        }
        else {
            if(continuity) {answer+=temp;}
            continuity = false;
            temp = 1;
        }
            
    }
    if(continuity)answer+=temp;
    return answer;
}