/*
Rex is 5yrs old, he loves numbers. His teacher has provided him a new challenge, he needs your help in finding the solution. Given a number, you should find the sum of its digits.

Input Format

n = 5436

Constraints

1<=n<=100000

Output Format

18

Sample Input 0

5346
Sample Output 0

18
Sample Input 1

534693
Sample Output 1

30
*/



import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  
            int n = s.nextInt();
            int sum = sumOfDigits(n); 
            System.out.println( sum); 
    } 
        public static int sumOfDigits(int n) { 
                int sum = 0; 
                while (n != 0) { 
                        sum += n % 10; 
                        n /= 10; } 
                return sum; 
        }
        
    
}