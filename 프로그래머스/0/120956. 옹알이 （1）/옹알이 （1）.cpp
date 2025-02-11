#include <string>
#include <vector>
#include <cctype>
using namespace std;

int solution(vector<string> babbling) {
    
    vector<string> possibleWords = {"aya","ye","woo","ma"};
    int answer = 0;
    bool test = false;
    for(auto str : babbling){
        test = true;
        for(auto possibleStr : possibleWords){
            while(str.find(possibleStr)!=-1){
                str.replace(str.find(possibleStr),possibleStr.length(),"1");
            }
        }
        for(auto c : str){
            if(!isdigit(c)){
                test = false;
                break;
            }
        }
        if(test)
            answer++;
    }
    return answer;
}