public class ReverseString {

    public static String reverseWithBuilder(String stringToReverse){
        StringBuilder stringBuilder = new StringBuilder(stringToReverse);
        StringBuilder reversed = stringBuilder.reverse();
        return reversed.toString();
    }

    public static String reverseWithBuffer(String stringToReverse){
        StringBuffer stringBuffer = new StringBuffer(stringToReverse);
        StringBuffer reversed  = stringBuffer.reverse();
        return reversed.toString();
    }

    public static String reverseWithWhile(String stringToReverse){
        char[] stringToCharArray = stringToReverse.toCharArray();
        String reversed = "";
        int rightLetter = stringToCharArray.length - 1;
        while (rightLetter >= 0) {
           reversed += stringToCharArray[rightLetter];
            --rightLetter;
        }
        return reversed;
    }


    public static String reverseWithFori(String stringToReverse){
        char[] stringToCharArray = stringToReverse.toCharArray();
        String reversed = "";
        for (int i = stringToCharArray.length-1; i >=0; i--) {
            reversed += stringToCharArray[i];
        }
        return reversed;
    }

    public static String reverseWithForEach(String stringToReverse){
        char[] stringToCharArray = stringToReverse.toCharArray();
        String reversed = "";
        for (char letter : stringToCharArray) {
            reversed = letter + reversed ;
        }
        return reversed;
    }
}
