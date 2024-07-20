#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
    int N,v;
    int answer = 0;
    int temp = 0;
    vector<int> numbers;
    cin>>N;
    for(int i = 0; i<N; i++){
        cin>>temp;
        numbers.push_back(temp);
    }
    cin >> v;
    answer = count(numbers.begin(),numbers.end(),v);
    cout << answer ;
    return 0;
}