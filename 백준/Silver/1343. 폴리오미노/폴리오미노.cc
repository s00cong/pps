#include <iostream>
#include <string>
#include <sstream>

using namespace std;

int main(){

    string board;
    string answer;
    string polyA = "AAAA";
    string polyB = "BB";
    cin >> board;

    int temp = 0;
    istringstream ss(board);    //parsing을 위해서
    string buffer;              //parsing한거 담을 곳



    while(getline(ss,buffer,'.')){

        if(buffer.length()%4==0 || buffer.length()%4==2 ){
            for(int i = 0; i<(int)buffer.length()/4; i++){
                answer += polyA;
            }

            if(buffer.length()%4 == 2){     
                answer += polyB;
            }

        }
        else if(buffer.length()%2==0){
            answer += polyB;
        }

        else {
            cout << -1;
            return 0;
        }

        answer+=".";
    }
    
    if(board[board.size()-1]!='.')answer.erase(answer.end()-1);

    cout << answer;
    return 0;
}