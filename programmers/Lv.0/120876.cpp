#include <string>
#include <vector>
#include <algorithm>
using namespace std;

int solution(vector<vector<int>> lines) {
    int answer = 0;
    int arr[205]={0,};
    sort(lines[0].begin(),lines[0].end());
    for(int i = 0; i<lines.size();i++){
        for(int j = lines[i][0]+100; j<lines[i][1]+100;j++){
            arr[j]++;
        }
    }
    for(int i = 0; i<201;i++){
        if(arr[i]>1)answer++;
    }


    return answer;
}