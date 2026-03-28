class totalSquareArea {
  public static int totalSquareAreas(int x) {
    if (x <= 0) {
      return x;
    }
    return (int) Math.pow(x, 3) + totalSquareAreas(x - 1);
  }

  public static void main(String[] args) {
    // staticメソッドはクラス名で呼ぶ
    System.out.println(totalSquareArea.totalSquareAreas(5));
  }
}
