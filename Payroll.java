import java.util.Scanner;
public class Payroll {
    public static void main(String[] args) {
        String name;
        int hours;
        double payRate;
        double grossPay;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is your name? : ");
        name = keyboard.nextLine();

        System.out.print("How many hours did you work this week? : ");
        hours = keyboard.nextInt();

        System.out.print("What is your hoursly pay rate? : ");
        payRate = keyboard.nextDouble();

        grossPay = hours * payRate;
        System.out.println("Hello " + name);
        System.out.println("Your gross pay is " + grossPay);

        /*
         1.nextByte() ชนิดข้อมูลแบบ Byte
         2.nextDouble() ชนิดข้อมูลแบบ Double
         3.nextFloat() ชนิดข้อมูลแบบ Float
         4.nextInt() ชนิดข้อมูลแบบ Int
         5.nextLine() ชนิดข้อมูลแบบ Line
         6.nextLong() ชนิดข้อมูลแบบ Long
         7.nextShort() ชนิดข้อมูลแบบ Short
         */
    }
}
