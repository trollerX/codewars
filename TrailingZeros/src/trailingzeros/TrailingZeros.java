/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trailingzeros;

import java.math.BigInteger;

/**
 *
 * @author TrollerX
 */
public class TrailingZeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(zeros(11));
    }

    public static int zeros(int n) {
        // your beatiful code here
        BigInteger factorial = factorial(n);
//        System.out.println("Factorial of: " + n + " is: " + factorial);
        String fStr = factorial.toString();
//        System.out.println("String representation: " + fStr);
//        System.out.println("Number of digits: " + fStr.length());
        int i = fStr.length() - 1;
        int zeros = 0;
        while (fStr.charAt(i) == '0') {
            zeros++;
            i--;
        }
        return zeros;
    }

    public static BigInteger factorial(int n) {
        BigInteger factorial = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

}
