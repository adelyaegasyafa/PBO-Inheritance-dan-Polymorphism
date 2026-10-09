public class BujurSangkar extends Bentuk {
    private double sisi;

    public BujurSangkar(double sisi, String warna) {
        super(warna);          // memanggil constructor kelas induk
        setSisi(sisi);
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        if (sisi > 0) {
            this.sisi = sisi;
        } else {
            System.out.println("Sisi harus > 0, nilai tidak diubah.");
        }
    }

    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public void printInfo() {
        System.out.println("Bujursangkar berwarna " + getWarna()
                + ", luas = " + hitungLuas());
    }
}