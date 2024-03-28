//7의 개수
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120912
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-7의-개수

#include <string>
#include <vector>

using namespace std;

int solution(vector<int> array) {
    int answer = 0;
    string str = "";
    for(int i = 0 ;i<array.size();i++){
        str = to_string(array[i]);
        for(auto s : str){
            if(s == 48+7)answer++;
        }
    }
    return answer;
}