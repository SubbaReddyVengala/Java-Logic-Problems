package primenumber;

public class PrimeNumOptimizeWithBreak {
    public static void main(String[] args) {

        int i, n = 3;
        boolean isprime = true;
        // 0 and 1 are not prime numbers also, negative numbers are not prime
        if (n < 2) {
            isprime = false;
        } else {
            for (i = 2; i < n; i++) {
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
        // Condition for 0, 1 and negative numbers checked earlier
        // Loops runs b/w [2, n-1] rather than [1, n]

    }
}
