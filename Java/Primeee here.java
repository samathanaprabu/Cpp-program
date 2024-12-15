/* 
Alex is found of numbers, he found a new pattern of numbers called prime numbers. A prime number is a number which is divisible by one or the number itself. Now he wants your help in finding the number of prime numbers until a given number. 1 is neither prime nor composite so shouldn't be considered as prime.

Input Format

n = 7

Constraints

1<=n<=1000

Output Format

4

Sample Input 0

7
Sample Output 0

4
Sample Input 1

5
Sample Output 1

3
*/
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        int n = s.nextInt();
        int primeCount = countPrimes(n);
        System.out.println(primeCount); // Print the result
    }

    public static int countPrimes(int n) { 
        int count = 0; 
        for (int i = 2; i <= n; i++) { 
            if (isPrime(i)) { 
                count++; 
            } 
        } 
        return count; 
    } 

    public static boolean isPrime(int num) { 
        if (num <= 1) { 
            return false; 
        } 
        for (int i = 2; i <= Math.sqrt(num); i++) { 
            if (num % i == 0) { 
                return false; 
            } 
        } 
        return true;
    }
}
