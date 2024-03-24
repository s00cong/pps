//문자열 정렬하기(1)
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(string my_string) {
    vector<int> answer;
    for(auto& str : my_string){
        if(48<=str&&str<=57) answer.push_back(str-'0');
    }
    sort(answer.begin(),answer.end());
    return answer;
}