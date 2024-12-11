// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt(), Fact=1 ;
        for(int i=1; i<=n; i++){
            Fact = Fact *i;
        }
        System.out.print(Fact);
    }
}
