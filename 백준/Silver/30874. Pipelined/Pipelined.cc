#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    int n;
    cin>>n;
    int *line=new int[n];
    for(int i=0;i<n;i++){
        cin>>line[i];
    }
    sort(line,line+n);
    int num=n-1+line[n-1];    
    cout<<num;
}