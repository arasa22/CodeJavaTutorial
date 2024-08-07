public class LengthDemo {
    public static void main(String[] args) {
        Rectangle box = new Rectangle();
        System.out.println("Sending the value 10.0 to the setLength method.");
        box.setLength(10.0);
        box.setWidth(20.0);
        System.out.println("The box's length is " + box.setLength());
        System.out.println("The box's width is " + box.setWidth());
        System.out.println("The box's area is " + box.getArea());
        System.out.println("Done");
    }
}
