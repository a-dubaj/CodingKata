/*
    Write a C++ program to swap two numbers using class
*/

#include <iostream>
using namespace std;

class exec
{
    int a, b;
    public:
        void getdata();
        void swapv();
        void display();

};

void exec::getdata()
{
    cout << "Enter two numbers: ";
    cin >> a >> b;
}

void exec::swapv()
{
    a = a + b;
    b = a - b;
    a = a - b;
}

void exec::display()
{
    cout << "a = " << a << "tb = " << b;
}

int main()
{
    exec s;
    s.getdata();
    cout<<"\nBefore swap: \n";
    s.display();

    s.swapv();
    cout<<" After swap: ";
    s.display();

    return 0;
}