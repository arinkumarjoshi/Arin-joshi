#include<iostream>
using namespace std;
int main()
{
    int n,i,term,count,j;
    cout<<"ENTER THE RANGE OF FIBO";
    cin>>n;
    
    int n1=0,n2=1;
    count=1;
    cout<<n1<<" \n";
    cout<<n2<<" \n";
    while(count<=n)
    {
    term=n1+n2;
     cout<<term<<" \n";
    n1=n2;
    n2=term;
    count++;
  
     
    }
    return 0;
}
