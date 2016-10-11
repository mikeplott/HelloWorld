/**
 * Created by michaelplott on 10/11/16.
 */
public class Exercise05 {
    public static void main(String[] args) {
        int num = 12345;
//        int num2 = Integer.valueOf(Integer.reverse(num));
//        // 54321
//        System.out.println(Integer.reverse(num));
//        System.out.println(Integer.valueOf(Integer.reverse(num)));
//        System.out.println(Integer.compare(num, num2));
//        System.out.println(Integer.bitCount(num));
//        int num3 = Integer.reverseBytes(num);
//        System.out.println(num3);
//        String inValid = "54321";
//        int num4 = Integer.parseInt(inValid);
//        System.out.println(num4);

        //manual
        String numStr = String.valueOf(num);
        String numStr2 = "";
        for (int i = numStr.length()-1; i >= 0; i--) {
            numStr2 += numStr.charAt(i);
        }
        int num5 = Integer.valueOf(numStr2);
        System.out.println(num5);

        //use Stringbuilder
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        sb.reverse();
        int num6 = Integer.valueOf(sb.toString());
        System.out.println(num6);

        // use math
        int num7 = 0;
        while (num != 0) {
            num7 *= 10;
            num7 += num % 10;
            num /= 10;
        }
        System.out.println(num7);
    }
}
