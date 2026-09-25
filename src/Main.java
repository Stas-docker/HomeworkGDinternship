     public class Main {
         static void main(String[] args) {
             String stringToRevers = "I'm going to go to school today morning.";
//1.StringBuffer
             StringBuffer stringBuffer = new StringBuffer(stringToRevers);
             StringBuffer reversed  = stringBuffer.reverse();
             System.out.println(reversed);
//StringBuilder
             StringBuilder stringBuilder = new StringBuilder(stringToRevers);
             StringBuilder reversed1 = stringBuilder.reverse();
             System.out.println(reversed1);
//2.char array
             char[] c = stringToRevers.toCharArray();
             int left = 0;
             int right = c.length - 1;
//3.while cycle using char array
             while (right >= left) {
                 System.out.print(c[right]);
                 --right;
             }


             System.out.println();
//4.fori cycle using chararray
             for (int i = c.length-1; i >=0; i--) {
                 System.out.print(c[i]);
             }


             System.out.println();
//5.foreach cycle using chararray
             String rvrs = "";
             for (char a : c){
                 rvrs = a + rvrs;
             }
             System.out.println(rvrs);


         }
    }
