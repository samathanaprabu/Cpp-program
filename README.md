# Cpp-program
Beginning Programmer 

# Prob 1 : Write a program that takes an integer, then a string, then a char from the user and prints them in the screen.
Input:  2 Name y

**Expected Output:**

2

Name

y 

**Logical Building idea**

step 01 : Declear for
    1.**int number** this for integer nubmer
    2.**string text** this for string 
    3.**char character** this for charactor 
    
step 02 : take input form user out side

    cout << "Enter an integer: ";
    cin >> number;

    cout << "Enter a string: ";
    cin >> text;

    cout << "Enter a character: ";
    cin >> character;
    
Step 03 : printout the out put  

    cout << number << endl;
    cout << text << endl;
    cout << character << endl;
    
**Finally blow i showing c++ proram full code**

< #include <iostream>
#include <string>
using namespace std;
int main() 
{
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
} >




# Write a program which takes two values x and y. Prints x for y number of times.

Input:

2 

3

Expected Output

2

2

2

Explanation - 2 is x and 3 is y in the input. So 2 is printed 3 times on the output.
---------------------------------------------------------------------------------------
**logical**
1. x=2
    y=3
2. don't write the program 
```
for (int num=0; num<y; num++)
{
    cout<< num<<endl;
}
```
must remove **num** and replace the **x**
like
```
for (int num=0; num<y; num++)
{
    cout<< x <<endl;
}
```
** Program**
```
// Online C compiler to run C program online
#include <stdio.h>
#include <iostream>
using namespace std;
int main() {
  int x,y;
    cout<< "Enter the X Value :";
    cin>> x;
    cout << "Enter the Y value:";
    cin >> y;
for (int num=0; num<y; num++)
{
    cout<< x <<endl;
}

    return 0;
}
```
