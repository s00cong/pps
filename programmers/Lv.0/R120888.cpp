//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120888
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-중복된-문자-제거

#include <string>
#include <vector>
#include <algorithm>

using namespace std;

string solution(string my_string) {
    string answer = "";
    string temp = "";
    for(int i = 0;i<my_string.size();i++){
        for(int j=i+1; j<my_string.size();j++){
            if(my_string[i]==my_string[j])
            {
                my_string.erase(my_string.begin()+j);
                j--;
            }
        }
    }
    
    return my_string;
}