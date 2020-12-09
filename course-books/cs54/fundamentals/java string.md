```java
/**
 * Created by tjung on 9/30/2017.
 */
public class StringEx {
    public static void main(String[] args) {
        // byte short int long
        // float double
        // char boolean

        String greeting = "Hi There";
//        int len = greeting.length();
//        System.out.println(len);
//
//        char firstChar = greeting.charAt(0);
//        System.out.println("The first character is " + firstChar);
//
//        char lastChar = greeting.charAt(len-1);
//        System.out.println("The last characrer is " + lastChar);
//
//        String token = greeting.substring(3, 8);
//        System.out.println(token);
//
//        for (int i = 0; i < greeting.length(); i++) {
//            char cur = greeting.charAt(i);
//            System.out.println(cur);
//        }

        boolean isUpper = Character.isUpperCase('a');
        System.out.println(isUpper);

        boolean isLower = Character.isLowerCase('a');
        System.out.println(isLower);

        for (int i = 0; i < greeting.length(); i++) {
            char cur = greeting.charAt(i);
            if (Character.isUpperCase(cur)){
                System.out.println(cur);
            }
        }

        // print all lower case letters

        // ascii code
        int a_code = 'a';
        System.out.println(a_code);
        System.out.println((int)'b');

        for (int i = 97; i < 97 + 26 ; i++) {
            System.out.println(i + " " + (char)i);
        }

        // print out all capitals A-Z

        String result = "";
        for (int i = 0; i < greeting.length(); i++) {
            char cur = greeting.charAt(i);
            if ( Character.isUpperCase(cur)) {
                result += cur;
            }
        }
        System.out.println(result);
    }
}
```