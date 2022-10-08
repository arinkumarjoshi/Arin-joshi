#include<iostream>
using namespace std;
int main()
{
	int age;
	cout<<"tell me your age"<<endl;
	cin>>age;
	switch (age)
	{
		case 18:
			cout<<"this is 18"<<endl;
			break;
			case 22:
			cout<<"this is 22"<<endl;
			break;
			case 32:
			cout<<"this is 32"<<endl;
			break;
			default:
				cout<<"no special case";
				break;
			
	}return 0;
}
