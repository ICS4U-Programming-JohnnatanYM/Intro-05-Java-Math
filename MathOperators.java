/**
*
* This program does math calculations.
*
* @author  Johnnatan Yasin Medina
* @version 1.0
* @since   2025-02-11
*/
public final class MathOperators {

    /**
    * Style Checker.
    *
     * @exception IllegalStateException Utility Class
     * @see IllegalStateException
     */
    private MathOperators() {
        throw new IllegalStateException("Utility Class");
    }

    /**
     * @param args Unused.
     */

     public static void main(final String[] args) {
        System.out.println("5 + 3 = " + (5 + 3));
        System.out.println("10 - 4 = " + (10 - 4));
        System.out.println("7 * 2 = " + (7 * 2));
        System.out.println("4 / 2 = " + (4 / 2));
        System.out.println("2 / 3 (float) = " + (2f / 3));
        System.out.println("2 / 3 (double) = " + (2.0 / 3));
        System.out.println("5^2 = " + Math.pow(5, 2));
        System.out.println("3^3 = " + Math.pow(3, 3));
        System.out.println("√16 = " + Math.sqrt(16));
    }
    }

