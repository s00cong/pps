//연속된 수의 합
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120923
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-연속된-수의-합

#include <string>
#include <vector>

using namespace std;

vector<int> solution(int num, int total) {
    vector<int> answer;
    int temp = total / num;
    int distance = num / 2;

    if(num%2==0){
        temp = (total / num) + 1;
    }

    for(int i = 0; i<num; i++ ){
            answer.push_back(temp-distance+i);
    }


    return answer;
}
