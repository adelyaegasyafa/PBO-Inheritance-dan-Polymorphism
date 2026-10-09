public class Main {
    public static void main(String[] args) {
        Bentuk bentuk = new Bentuk("kuning");
        BujurSangkar bs = new BujurSangkar(5, "merah");
        Lingkaran lingkaran = new Lingkaran(10, "biru");
        Silinder silinder = new Silinder(8, 2, "hijau");

        // ===== 2. Inheritance: Silinder memakai method warisan =====
        System.out.println("\n=== Inheritance ===");
        System.out.println("Warna  (dari Bentuk)    = " + silinder.getWarna());
        System.out.println("Radius (dari Lingkaran) = " + silinder.getRadius());
        System.out.println("Luas alas (dari Lingkaran) = " + silinder.hitungLuas());

        // ===== 3. Polymorphism: variabel Bentuk, objek berbeda =====
        System.out.println("\n=== Polymorphism ===");
        Bentuk[] daftar = { bentuk, bs, lingkaran, silinder };
        for (Bentuk b : daftar) {
            b.printInfo(); // method yang jalan sesuai objek aslinya
        }
    }
}