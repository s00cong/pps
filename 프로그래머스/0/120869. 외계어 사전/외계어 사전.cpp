#include <string>
#include <vector>
using namespace std;

int solution(vector<string> spell, vector<string> dic) {
    int answer = 0;
    vector<string> temp;
    for(int i = 0; i<spell.size(); i++){
        for(auto str : dic){
            if(str.find(spell[i])!=string::npos){
                temp.push_back(str);
            }
        }
        
        if(temp.size()==0)return 2;
        dic=temp;
        temp = {};
    }

    return 1;
}