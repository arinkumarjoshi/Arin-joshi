#include<iostream>
using namespace std;
int main ()
{
	int n,i,fact;
	cout<<"enter a number:";
	cin>>n;
	i=n;
	fact=1;
	while(i>=1){
		fact=fact*i;
		i--;
		
	}
	cout<<"factorial is"<<fact<<endl;
	
	return 0;
}
