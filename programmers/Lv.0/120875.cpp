//평행
//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120875
//블로그 링크 : https://velog.io/@s00cong/프로그래머스-c-평행

#include <string>
#include <vector>

using namespace std;


int slope (vector<int> a, vector<int> b, vector<int> c, vector<int> d){
    double x1 = a[0]-b[0];
    double y1 = a[1]-b[1];
    double x2 = c[0]-d[0];
    double y2 = c[1]-d[1];
    if(x1/y1==x2/y2) return 1;
    return 0;
}

int solution(vector<vector<int>> dots) {
    vector<int> a = dots[0];
    vector<int> b = dots[1];
    vector<int> c = dots[2];
    vector<int> d = dots[3];

    if(slope(a,b,c,d)) return 1;
    if(slope(a,c,b,d)) return 1;
    if(slope(a,d,b,c)) return 1;

    return 0;
}