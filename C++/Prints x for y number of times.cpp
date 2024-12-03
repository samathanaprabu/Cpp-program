/* Prob 1:

Write a program which takes two values x and y. Prints x for y number of times.

Input:

2 

3

Expected Output

2

2

2

Explanation - 2 is x and 3 is y in the input. So 2 is printed 3 times on the output.
---------------------------------------------------------------------------------------
### logical
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
### Program
```
// Online C compiler to run C program online */

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