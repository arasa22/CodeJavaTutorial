public class ExNo1 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 30;
        System.out.println("Even numbers between " + num1 + " and " + num2 + ":");
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
