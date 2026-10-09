# Inheritance & Polymorphism 

Tugas **Latihan/Eksplorasi Materi Inheritance dan Polymorphism**
Mata Kuliah Pemrograman Berorientasi Objek, Program Studi Teknik Informatika, Fakultas Teknik, Universitas Mataram.

| | |
|---|---|
| **NIM** | `F1D02510033` |
| **Nama** | `Adelya Ega Syafa` |
| **Kelas** | `3B` |

## Deskripsi

Program ini mengimplementasikan Latihan 1–3 pada slide halaman 63–66, yaitu hierarki kelas bentuk geometri:

```
Bentuk
 ├── BujurSangkar
 └── Lingkaran
      └── Silinder
```

Pada `Main.java`, objek dibuat dengan data dummy lalu method-methodnya dipanggil untuk menghitung luas dan volume, tanpa input dari pengguna. Fokus program: **inheritance** dan **polymorphism**.

## Struktur Repositori

```
.
├── Bentuk.java
├── BujurSangkar.java
├── Lingkaran.java
├── Main.java
├── Silinder.java
├── README.md
└── output.png
```

## Cara Menjalankan

Pastikan JDK sudah terpasang (`javac -version`).

```bash
javac *.java
java Main
```

## Penjelasan Konsep OOP pada Kode

### 1. Encapsulation
Atribut pada tiap kelas dibuat `private` (`warna`, `sisi`, `radius`, `tinggi`) dan diakses lewat getter/setter, sesuai diagram kelas pada slide. Fokus program ini tetap pada inheritance dan polymorphism.

### 2. Inheritance (Pewarisan)
Pewarisan menggunakan keyword `extends`:

- `BujurSangkar extends Bentuk`
- `Lingkaran extends Bentuk`
- `Silinder extends Lingkaran` (pewarisan bertingkat / multilevel)

Subclass memakai `super(...)` untuk memanggil constructor kelas induk. `Silinder` otomatis memiliki `getWarna()` (dari `Bentuk`), serta `getRadius()` dan `hitungLuas()` (dari `Lingkaran`) tanpa menuliskannya ulang. `hitungVolume()` pada `Silinder` memakai `hitungLuas()` warisan sebagai luas alas.

### 3. Polymorphism

**Overriding** – method `printInfo()` ditimpa di setiap subclass:

| Objek | Output `printInfo()` |
|---|---|
| `Bentuk` | `Bentuk berwarna [warna]` |
| `BujurSangkar` | `Bujursangkar berwarna [warna], luas = [luas]` |
| `Lingkaran` | `Lingkaran [warna], luas = [luas]` |
| `Silinder` | `Silinder warna [warna], volume = [volume]` |

Variabel bertipe `Bentuk` dapat menampung objek subclass. Saat `printInfo()` dipanggil, method yang dijalankan mengikuti objek aslinya (*dynamic binding*):

```java
Bentuk[] arr = { b, bs, l, s };
for (Bentuk x : arr) {
    x.printInfo();
}
```

**Overloading** – constructor `Bentuk()` dan `Bentuk(String warna)` memiliki nama sama tetapi parameter berbeda.

## Data Dummy pada `Main`

| Objek | Data |
|---|---|
| `Bentuk` | warna kuning |
| `BujurSangkar` | sisi 5, warna merah |
| `Lingkaran` | radius 10, warna biru |
| `Silinder` | tinggi 8, radius 2, warna hijau |

## Screenshot Output
<img width="670" height="312" alt="output" src="https://github.com/user-attachments/assets/9c3c1db9-7a3e-4559-a640-41b7644a19f0" />

