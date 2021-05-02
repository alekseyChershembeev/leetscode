/**
 * Author: Aleksey Chershembeev
 * created : 02.05.2021 - 19:22
 * description:
 */
public class ReverseString344 {
    public static void main(String[] args) {

        System.out.println("qwerty");
        System.out.println(reversString("qwerty"));

    }


    public static String reversString(String s) {

        final char[] chars = s.toCharArray();


        final int top = chars.length - 1;

        for (int i = 0; i < top /2 ; i++) {

            char tmp = chars[i];
            chars[i] = chars[top -i];
            chars[top -i] = tmp;

        }

        return String.valueOf(chars);
    }
}
