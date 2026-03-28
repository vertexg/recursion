public class numberOfDots {
    public static void main(String[] args) {
        // staticメソッドはクラス名で呼ぶ
        System.out.println(numberOfDots.numberOfDot(5));
    }

    public static int numberOfDot(int x) {
        if (x == 0) {
            return 0;
        }
        return x + numberOfDot(x - 1);
    }
}
