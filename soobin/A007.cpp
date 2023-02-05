#include <iostream>
using namespace std;
void detect(int* scale){
    int D = 0;
    if(scale[0]-scale[1]==1) D=2; //decending
    if(scale[1]-scale[0]==1) D=1; //acending
    for(int i=1;i<7;i++){
        if(D==2&&(scale[i]-scale[i+1])==1) D=2;
        else if(D==1&&(scale[i+1]-scale[i])==1) D=1;
        else D=0;
    }
    if(D==0) printf("mixed\n");
    else if(D==1) printf("ascending\n");
    else printf("descending\n");

}

int main(){
    int scale[8];
    for(int i=0;i<8;i++){
        scanf("%d",&scale[i]);
    }
    detect(scale);



    return 0;
}
