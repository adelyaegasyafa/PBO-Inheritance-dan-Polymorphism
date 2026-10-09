public class Silinder extends Lingkaran {
    private double tinggi;

    public Silinder(double tinggi, double radius, String warna) {
        super(radius, warna);
        setTinggi(tinggi);
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double t) {
        if (t > 0) {
            this.tinggi = t;
        } else {
            System.out.println("Tinggi harus > 0, nilai tidak diubah.");
        }
    }

    public double hitungVolume() {
        // luas alas (dari Lingkaran) x tinggi
        return hitungLuas() * tinggi;
    }

    @Override
    public void printInfo() {
        System.out.println("Silinder warna " + getWarna()
                + ", volume = " + hitungVolume());
    }
}