/* Write a program to get firstName and lastName and n as input and print fullName that is firstName+lastName for n times.

Input

Nandy

Raja

5

Expected output:

NandyRaja

NandyRaja

NandyRaja

NandyRaja

NandyRaja

Explanation - Nandy is the firstName, Raja is the lastName and n is 5, so the expected output has NandyRaja printed 5 times. 
---------------------------------------------------------------------------------------------------------------------------*/

#include <iostream>
using namespace std;
void printFullName(string firstName, string lastName, int n) {
    string fullName = firstName + lastName;
    for (int i = 0; i < n; i++) {
        cout << fullName << endl;
    }
}

int main() {
    string firstName, lastName;
    int n;
    cout << "Enter the first name: ";
    cin >> firstName;
    cout << "Enter the last name: ";
    cin >> lastName;
    cout << "Enter the number of times to print the full name: ";
    cin >> n;
    printFullName(firstName, lastName, n);

    return 0;
}
