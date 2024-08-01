public class result1to100 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            System.out.println("Result while loop : " + i);
            sum += i;
            i++;
        }
        System.out.println("Result 1 To 100 = " + sum);
    }
}
