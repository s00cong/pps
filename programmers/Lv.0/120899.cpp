//가장 큰 수 찾기
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120899
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-가장-큰-수-찾기

#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> array) {
    vector<int> answer;
    int max = array[0];
    int index = 0;
    for(int i =0 ;i <array.size();i++){
        if(array[i]>max){ max = array[i]; index = i;}
    }
    answer.push_back(max);
    answer.push_back(index);
    return answer;
}