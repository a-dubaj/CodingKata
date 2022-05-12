/*
    Write a C++ Program to Find Quotient and Remainder of 2 numbers.
*/

#include <iostream>
using namespace std;

int main()
{
    int divisior, dividend, quotient, remainder;
    std::cout << "Enter dividend :: ";
    std::cin >> dividend;
    std::cout << "Enter divisor :: ";
    std::cin >> divisior;

    quotient = dividend / divisior;
    remainder = dividend % divisior;

    cout << "\nQuotient = " << quotient << endl;
    cout << "\nRemainder = " << remainder << endl;

    return 0;
}