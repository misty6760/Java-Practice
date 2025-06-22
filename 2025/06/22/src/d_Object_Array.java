class Circle {
    int radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    public double getArray() {
        return 3.14*radius*radius;
    }
}

public class d_Object_Array {
    public static void main(String[] args) {
        Circle[] c;
        c = new Circle[5];

        for(int i = 0;i<c.length;i++) {
            c[i] = new Circle(i);
        }

        for (Circle circle : c) {
            System.out.print((int) (circle.getArray()) + " ");
        }
    }
}
