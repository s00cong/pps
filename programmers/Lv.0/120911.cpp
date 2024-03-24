//문자열 정렬하기 (2)

#include <string>
#include <vector>
#include <algorithm>

using namespace std;

string solution(string my_string) {
    string answer = "";
    for(auto str : my_string){
        answer += tolower(str);
    }
    sort(answer.begin(),answer.end());
    
    return answer;
}