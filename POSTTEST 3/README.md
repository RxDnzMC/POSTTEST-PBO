
        LAPORAN POSTTEST 3 PBO
=========================================

Nama   : Rangga Aditya Rahman
NIM    : 2409106044
Judul  : Sistem Manajemen Inventaris Senjata Medieval (Penerapan Inheritance)

-----------------------------------------
A. Perubahan di Posttest 3 (Inheritance)
-----------------------------------------
1. Penerapan Superclass: 
   Class 'Senjata' kini berperan sebagai Superclass (induk) yang menampung 
   atribut umum seperti nama, tipe, dan damage.

2. Penerapan Subclass (Child Class): 
   Dibuat dua class turunan yang spesifik secara logis, yaitu:
   - SenjataMelee: Untuk senjata jarak dekat (Pedang, Kapak, dll).
   - SenjataRange: Untuk senjata jarak jauh (Busur, Crossbow, dll).

3. Atribut Spesifik & Logis:
   - SenjataMelee memiliki atribut unik 'panjangBilah' (double).
   - SenjataRange memiliki atribut unik 'jarakTembak' (int).

4. Penggunaan Keyword 'extends' & 'super':
   - Menggunakan 'extends' untuk mewarisi sifat dari class Senjata.
   - Menggunakan 'super()' pada constructor untuk mengirim data ke class induk 
     dan 'super.info()' untuk menjalankan method info dari induk.

5. Method Overriding:
   Melakukan override pada method info() di setiap subclass untuk menampilkan 
   informasi tambahan yang spesifik sesuai jenis senjatanya.

-----------------------------------------
B. Struktur Class
-----------------------------------------
- Senjata (Superclass)
- - SenjataMelee (Subclass) -> Tambahan: panjangBilah
- - SenjataRange (Subclass) -> Tambahan: jarakTembak

-----------------------------------------
C. Cara Menjalankan
-----------------------------------------
1. Pastikan file Senjata.java, SenjataMelee.java, SenjataRange.java, 
   dan Main.java berada dalam satu folder yang sama.
2. Buka terminal/command prompt pada direktori tersebut.
3. Compile semua file dengan perintah: 
   javac *.java
4. Jalankan program dengan perintah: 
   java Main
5. Masukkan pilihan menu 1 untuk Melee atau 2 untuk Range untuk 
   melihat perbedaan input data.
