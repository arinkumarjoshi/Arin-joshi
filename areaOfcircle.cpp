#include<iostream>
int main()
{
	int r;
	float area;
	const float PI = 3.14159;
	std::cout<<"enter radius:";
	std::cin>>r;
	area=PI*r*r;
	std::cout<<"Area is "<<area<<std::endl;
	return 0;
}
