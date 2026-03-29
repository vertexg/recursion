public class reverseString {
  public static String reverseStrings(String s) {
    if (s.length() <= 1)
      return s;
    return s.charAt(s.length() - 1) + reverseStrings(s.substring(0, s.length() - 1));
  }

  public static void main(String[] args) {
    System.out.println(reverseStrings("Hello"));
  }
}
