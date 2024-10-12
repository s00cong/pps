#include <iostream>
#include <string>
 
using namespace std;
int main(){
	string str;
	int arr[26] = { 0, };
	int max = 0;
	char c = '?';
 
	cin >> str;
	for (char c : str){
		if ('a' <= c)
			c = c - 32;
 
		arr[c - 'A']++;
	}
 
	for (int i = 0; i <= 'Z'-'A'; i++){
		if (arr[i] > max){
			max = arr[i];
			c = i + 'A';
		}
		else if (arr[i] == max)
			c = '?';
	}
 
	cout << c;
    return 0;
}