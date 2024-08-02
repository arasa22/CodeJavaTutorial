public class DemoArg {
    public static void main(String[] args) {
        System.out.println("start in main.");
        int testNum = 10;
        int total;
        displayValue(5);
        displayValue(testNum);
        displayValue(testNum * 5);
        total = showSum(3, 4);
        System.out.println("Total have value : " + total);
    }
    public static void displayValue(int num) {
        System.out.println("value is " + num);
    }
    public static int showSum(int x, int y) {
        int sum;
        sum = x + y;
        return sum;
    }
}
