//공 던지기
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120843
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-공-던지기

#include <string>
#include <vector>

using namespace std;

int solution(vector<int> numbers, int k) {
    int answer = 0;
    int temp = 0;
    if(k==1) return numbers[0];
    for(int i = 0; i < k-1 ; i++){
        temp+=2;
        if(temp>numbers.size()-1)temp-=numbers.size();
    }
    answer = numbers[temp];
    return answer;
}


