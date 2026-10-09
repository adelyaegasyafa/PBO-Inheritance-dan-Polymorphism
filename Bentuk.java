public class Bentuk {
    private String warna;

    // Constructor (overloading: ada 2 constructor)
    public Bentuk() {
        this("putih");
    }

    public Bentuk(String warna) {
        setWarna(warna);
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        // validasi: warna tidak boleh kosong
        if (warna == null || warna.trim().isEmpty()) {
            System.out.println("Warna tidak valid, nilai lama dipertahankan.");
            if (this.warna == null) {
                this.warna = "putih";
            }
            return;
        }
        this.warna = warna.trim();
    }

    public void printInfo() {
        System.out.println("Bentuk berwarna " + warna);
    }
}