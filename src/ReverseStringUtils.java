
/**
 * Utility class providing various methods to reverse a String in Java.
 */

public class ReverseStringUtils {

    /**
     * Reverses a string using {@link StringBuilder}.
     *
     * @param stringToReverse the original string to reverse
     * @return the reversed string
     */
    public static String reverseWithBuilder(final String stringToReverse){
        final StringBuilder stringBuilder = new StringBuilder(stringToReverse);
        final StringBuilder reversed = stringBuilder.reverse();
        return reversed.toString();
    }

    /**
     * Reverses a string using {@link StringBuffer}.
     *
     * @param stringToReverse the original string to reverse
     * @return the reversed string
     */
    public static String reverseWithBuffer(final String stringToReverse){
        final StringBuffer stringBuffer = new StringBuffer(stringToReverse);
        final StringBuffer reversed  = stringBuffer.reverse();
        return reversed.toString();
    }

    /**
     * Reverses a string using a {@code while} loop.
     *
     * @param stringToReverse the original string to reverse
     * @return the reversed string
     */
    public static String reverseWithWhile(final String stringToReverse){
        final char[] stringToCharArray = stringToReverse.toCharArray();
        String reversed = "";
        int rightLetter = stringToCharArray.length - 1;
        while (rightLetter >= 0) {
           reversed += stringToCharArray[rightLetter];
            --rightLetter;
        }
        return reversed;
    }

    /**
     * Reverses a string using an indexed {@code for} loop.
     *
     * @param stringToReverse the original string to reverse
     * @return the reversed string
     */
    public static String reverseWithFori(final String stringToReverse){
        final char[] stringToCharArray = stringToReverse.toCharArray();
        String reversed = "";
        for (int i = stringToCharArray.length-1; i >=0; i--) {
            reversed += stringToCharArray[i];
        }
        return reversed;
    }

    /**
     * Reverses a string using a {@code for-each} loop.
     *
     * @param stringToReverse the original string to reverse
     * @return the reversed string
     */
    public static String reverseWithForEach(final String stringToReverse){
        final char[] stringToCharArray = stringToReverse.toCharArray();
        String reversed = "";
        for (char letter : stringToCharArray) {
            reversed = letter + reversed ;
        }
        return reversed;
    }
}
