import java.util.Scanner;

public class BinomialTheoremCalculator{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    boolean loop2 = true;
    while (loop2){

    System.out.print("Enter an integer for a: ");
    int a = Integer.parseInt(input.nextLine());
    System.out.print("Enter an integer for b: ");
    int b = Integer.parseInt(input.nextLine());

    boolean loop = true;
    int n = 0;
    System.out.print("Enter a non-negative integer for n: ");
    
    while(loop){
        n = Integer.parseInt(input.nextLine());
        if(n >= 0){
        loop = false;
        }
        else{
        System.out.println("Please enter a non-negative integer. ");
        }
    }
    System.out.println("("+a+"+"+b+")^"+n+" with the Binomial Theorem Method: "+Binomial_Theorem(a, b, n));
    
    System.out.println("\nIf you'd like to try a different set of numbers please enter 1.\nElse, enter 0 if you'd like to exit.");
    int i = Integer.parseInt(input.nextLine());
    if(i == 0){
        System.out.println("Exitting now.");
        loop2 = false;
    }
    }
    input.close();
    }

    


    private static int Binomial_Theorem(int a, int b, int n){
        int k = n;
        int results = 0;
    
        for(int i = 0; i <= n; i++){
        if (k < 0 || k > n) {
            results = 0;
            i += n+1;
        } else if (k == 0) {
            results += Math.pow(a,n);
        } else {
            int combination = factorial(n) / (factorial(k) * factorial(n - k));
            int term = combination * (int) Math.pow(a, n - k) * (int) Math.pow(b, k);
            results += term;
            k--;
        }
    }
    return results;
    }

    private static int factorial(int x) {
        if (x == 0) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }
}