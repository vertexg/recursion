public class sheeps {
  public static String sheep(int count) {
    return sheepsHelper(count, "");
  }

  public static String sheepsHelper(int count, String string) {
    if (count <= 0) {
      return string;
    }
    return sheepsHelper(count - 1, String.valueOf(count) + "sheep ~ " + string);
  }

  public static void main(String[] args) {
    System.out.println(sheep(10));
  }

}
