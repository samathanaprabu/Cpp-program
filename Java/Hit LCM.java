/* 
You are given two integers n1 and n2. You need find the Lowest Common Multiple (LCM) of the two given numbers. Return the LCM of the two numbers.

The Lowest Common Multiple (LCM) of two integers is the lowest positive integer that is divisible by both the integers.

Example 1 Input: n1 = 4, n2 = 6

Output: 12

Explanation: 4 * 3 = 12, 6 * 2 = 12.

12 is the lowest integer that is divisible both 4 and 6.

Example 2 Input: n1 = 2, n2 = 3

Output: 6

Explanation: 2 * 3 = 6, 3 * 2 = 6.

6 is the lowest integer that is divisible both 2 and 3.

Input Format

4 6

Constraints

1<=n1<=100 1<=n2<=100

Output Format

12

Sample Input 0

2 3
Sample Output 0

6
Sample Input 1

4 3
Sample Output 1

12

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();

        int lcm = findLCM(n1, n2);

        System.out.println(lcm);
    }

    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}
