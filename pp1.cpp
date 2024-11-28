\* Prob 1 : Write a program that takes an integer, then a string, then a char from the user and prints them in the screen.


Input:  2 Name y

Expected Output:

2

Name

y */

#include <iostream>
#include <string>
using namespace std;

int main() {
    int number;
    string text;
    char character;

    // Prompt user input
    cout << "Enter an integer: ";
    cin >> number;

    cout << "Enter a string: ";
    cin >> text;

    cout << "Enter a character: ";
    cin >> character;

    // Print the input values
    cout << number << endl;
    cout << text << endl;
    cout << character << endl;

    return 0;
}
