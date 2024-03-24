//숫자 찾기
#include <string>
#include <vector>

using namespace std;

int solution(int num, int k) {
    int answer = 0;
    string temp = "";
    temp = to_string(num);
    for(int i = 0;i<temp.size();i++){
        if(temp[i]==48+k) {
            answer = i+1;
            break;
        }
    }

    return answer!=0? answer : -1;
}