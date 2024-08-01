public class ExNo2 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("Numbers less than or equal to " + number + " that are divisible by both 3 and 5:");
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
