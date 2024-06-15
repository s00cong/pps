//진료순서 정하기
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120835
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-진료순서-정하기

#include <string>
#include <vector>
#include <algorithm>
using namespace std;

vector<int> solution(vector<int> emergency) {
    vector<int> answer;
    vector<int>temp;
    temp = emergency;
    int cnt = 1;
    sort(temp.begin(),temp.end(),greater<int>());
    for(int i = 0; i<emergency.size();i++){
        for(auto t : temp){
            if(emergency[i]==t){
                answer.push_back(cnt);
            }
            else cnt++;
        }
        cnt=1;
    }

    return answer;
}