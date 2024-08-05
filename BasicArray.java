public class BasicArray {
    public static void main(String[] args) {
        final int LIMAT = 15, MULTIPLE = 10;
        int [ ] list = new int[LIMAT];
        int sum = 0;
        for(int index = 0; index < LIMAT; index++){
            list[index] = index * MULTIPLE;
        }
        list[5] = 999;
        for(int value : list){
            System.out.print(value + " ");
        }
        for(int value : list){
            sum += value;
        }
        System.out.println("Sum = : " + sum);
    }
}
