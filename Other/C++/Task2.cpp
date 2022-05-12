/*
    Write a C++ Program to C++ Program to Add Two Numbers. 
*/


# include <iostream>
using namespace std;

int main()
{
    int first, second, sum;
    std::cout << "Enter first number: ";
    std::cin >> first;
    std::cout << "\nEnter second number: ";
    std::cin >>  second;
    sum = first + second;
    std::cout<<"\nSum of Two Numbers [ "<<first<<" + "<<second<<" ] = "<<sum<<"\n";
    return 0;
}