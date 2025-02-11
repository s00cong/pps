#include <string>
#include <vector>

// 영어, 숫자로 바꾸기 
using namespace std;

long long solution(string numbers) {
    vector<string> numb = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    long long answer = 0;
    string temp = "";
    
    for(int i=0; i<10; i++){
        while(numbers.find(numb[i])!=string::npos){
            numbers.replace(numbers.find(numb[i]),numb[i].length(),to_string(i));
        }
    }
    
    answer = stoll(numbers);
    return answer;
}