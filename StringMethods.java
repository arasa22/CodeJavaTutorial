public class StringMethods {
    public static void main(String[] args) {
        String message = "Java is Great Fun";
        /*
         1. toUpperCase() ปรับค่าข้อความให้เป็นตัวพิมพ์ใหญ่
         2. toLowerCase() ปรับค่าข้อความให้เป็นตัวพิมพ์เล็ก
         3. length() เก็บความยาวของสตริง
         4. charAt(2) บอกให้เก็บตัวอักษรตามตำแหน่งพารามิเตอร์ที่ส่งเข้าไป
         */
        String upper = message.toUpperCase();
        String Lower = message.toLowerCase();
        int length = message.length();
        char charAt = message.charAt(3);

        System.out.println(upper);
        System.out.println(Lower);
        System.out.println(length);
        System.out.println(charAt);
    }
}
