package palindrome;

public class Palindrome {
    public static void main(String[] args) {
        boolean IsPalindromOrNot = Palindrome.isPalindrome("ravfrs");
        if (IsPalindromOrNot) {
            System.out.println("Is a palindrom");
        }else{
            System.out.println("Is not a palindrom");
        }
        if (Palindrome.isPalindromeReverseTheString("ababa")){
            System.out.println("Is a palindrome");
        }else{
            System.out.println("Is not a palindrome");
        }
    }


    public static boolean isPalindrome(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }
    public static boolean isPalindromeReverseTheString(String text) {
        StringBuilder reverse = new StringBuilder();
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        char[] plain = clean.toCharArray();
        for (int i = plain.length-1; i>= 0; i-- ){
            reverse.append(plain[i]);
        }
        return (reverse.toString()).equals(clean);
    }
}

