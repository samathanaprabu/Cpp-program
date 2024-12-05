/* Write a Program that takes input n and prints the below pattern and upload the code to your github repo.



Sample 1:

Input:

n = 4

Expected output:

*

**

***

****



Sample 2

Input:

n= 6

*

**

***

****

*****

******
*/
```
class Main {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
}
```
