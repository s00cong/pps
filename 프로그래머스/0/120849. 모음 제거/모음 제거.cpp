#include <string>
#include <vector>

using namespace std;

string solution(string my_string) {
    string answer = "";
    string mo = "aeiou";
    int temp = 0;
    for(auto i : my_string){
        for(auto j : mo){
            if(j==i) temp++;
        }
        if(temp==0){
            answer+=i;
        }
        temp=0;
    }
    return answer;
}