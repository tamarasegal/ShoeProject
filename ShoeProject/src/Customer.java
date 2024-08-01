public class Customer {

    public static void main(String[] args) {
        String s = "ABC.BCG.BCD.SHD";
        System.out.println(s);
        s = s.replaceAll(".", "three ");
        System.out.println(s);
    }
    private String first;
    private String last;
    private double shoeSize;

    public Customer(String first, String last, double shoeSize) {
        this.first = first;
        this.last = last;
        this.shoeSize = shoeSize;
    }

    public double getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(double shoeSize) {
        this.shoeSize = shoeSize;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    @Override
    public String toString() {
        return first + " " + last + " - " + shoeSize;
    }
}
