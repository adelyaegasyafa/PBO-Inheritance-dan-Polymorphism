public class Lingkaran extends Bentuk {
    public static final double PHI = 3.14159;

    private double radius;

    public Lingkaran(double radius, String warna) {
        super(warna);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        if (r > 0) {
            this.radius = r;
        } else {
            System.out.println("Radius harus > 0, nilai tidak diubah.");
        }
    }

    public double hitungLuas() {
        return PHI * radius * radius;
    }

    @Override
    public void printInfo() {
        System.out.println("Lingkaran " + getWarna()
                + ", luas = " + hitungLuas());
    }
}