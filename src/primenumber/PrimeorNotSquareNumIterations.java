package primenumber;

public class PrimeorNotSquareNumIterations {
    public static void main(String[] args) {

        int i, n = 25;
        boolean isprime = true;

        // 0 and 1 are not prime numbers also, negative numbers are not prime
        if (n < 2) {
            isprime = false;
        } else {
            // If a number n is not a prime, it can be factored into two factors a and b:
            // n = a * b

     /*Now a and b can't be both greater than the square root of n,
     since then the product a * b would be greater than sqrt(n) * sqrt(n) = n.
     So in any factorization of n, at least one of the factors must be smaller
     than the square root of n, and if we can't find any factors less than or equal to
     the square root, n must be a prime.*/
            for (i = 2; i <= Math.sqrt(n); i++) {
                int b= (int) Math.sqrt(n);
                if (n % i == 0) {
                    isprime = false;
                    break;
                }
            }
        }

        String result = isprime ? "Prime" : "not Prime";
        System.out.println("The number " + n + " is : " + result);

        // Time Complexity : O(N)
        // Space Complexity : O(1)
        // This program is better than previous version as :
        // Loops runs b/w [2, bn] rather than [2, n/2]
    }
}
