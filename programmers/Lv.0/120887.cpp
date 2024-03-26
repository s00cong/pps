//k의 개수
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120887
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-k의-개수

#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(int i, int j, int k) {
    int answer = 0;
    char ch_k = k + '0';

    for(int a = i; a<=j;a++){
        string str_a = to_string(a);
        answer += count(str_a.begin(),str_a.end(),ch_k);
    }


    return answer;
}
