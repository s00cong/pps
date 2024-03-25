//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120842
//블로그 링크 : https://velog.io/@s00cong/2차원으로 만들기

#include <string>
#include <vector>

using namespace std;

vector<vector<int>> solution(vector<int> num_list, int n) {
    vector<vector<int>> answer;
    for(int i=0;i<num_list.size()/n;i++){
        vector<int> temp;
        for(int  j= 0; j<n; j++){
            temp.push_back(num_list[i*n+j]);
        }
        answer.push_back(temp);
    }
    return answer;
}