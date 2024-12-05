/* Write a Program that takes input n and prints the below pattern and upload the code to your github repo.



Sample 1:

Input:

n = 8

Expected output:

1 

2 2 

3 3 3 

4 4 4 4 

5 5 5 5 5 

6 6 6 6 6 6 

7 7 7 7 7 7 7 

8 8 8 8 8 8 8 8 



Sample 2

Input:

n= 6

1 

2 2 

3 3 3 

4 4 4 4 

5 5 5 5 5 

6 6 6 6 6 6 



Hint: Check pattern 13 and think in terms of using count 
*/

#Program
class Main {
    public static void main(String[] args) {
        int n = 5;
        int count =1;
        for (int i=1; i<=n; i++){
            for(int j=1;j<=i; j++){
                System.out.print(i);
                System.out.print(" ");
                count ++;
            }
            System.out.println();
        }
    }
}
