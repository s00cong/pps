//외계행성의 나이
/*
문제 : 
 행성에서는 나이를 알파벳으로 말하고 있습니다. 
 a는 0, b는 1, c는 2, ..., j는 9입니다. 
 예를 들어 23살은 cd, 51살은 fb로 표현합니다. 

*/
#include <string>
#include <vector>

using namespace std;

string solution(int age) {
    string answer = "";
    answer = to_string(age);
    for(auto &i : answer){
        i += 49;
    }
    return answer;
}