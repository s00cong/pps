//등수 매기기
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120882
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-등수-매기기

#include <string>
#include <vector>
#include <algorithm>
using namespace std;

vector<int> solution(vector<vector<int>> score) {
    vector<int> answer;
    vector<int> avg;
    
    for(auto a : score){
        avg.push_back((a[0]+a[1]));
    }
    vector<int> temp(avg);
    sort(temp.begin(),temp.end(),greater<>());
    for (auto i : avg) {
        answer.push_back(find(temp.begin(),temp.end(),i)-temp.begin()+1);
    }
    return answer;
}