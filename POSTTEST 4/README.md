=========================================
   README POSTTEST 4 - POLYMORPHISM
=========================================

Nama  : Rangga Aditya Rahman
NIM   : 2409106044
Judul : Sistem Manajemen Inventaris Senjata Medieval

-----------------------------------------
A. PERUBAHAN DARI POSTTEST 3 KE 4
-----------------------------------------

1. METHOD OVERRIDING (Menu 3 - Lihat Inventaris)
   - Menambah method tampilkanInfo() di class Senjata
   - Method di-override di SenjataMelee dan SenjataRange
   - Output menampilkan info spesifik masing-masing senjata

2. METHOD OVERLOADING (Menu 4 - Upgrade Senjata)
   - upgrade()         : menambah damage +5
   - upgrade(int bonus): menambah damage sesuai bonus input user

3. PERBAIKAN CLASS SenjataMelee
   - Constructor diubah dari (String, int, double) menjadi (String, int, String)
   - Menambah atribut "bahan" untuk menyimpan material senjata

-----------------------------------------
B. CARA MENJALANKAN
-----------------------------------------

1. Compile: javac *.java
2. Jalankan: java Main

-----------------------------------------
C. FITUR PROGRAM
-----------------------------------------

1. Tambah Senjata Melee (Pedang + Bahan)
2. Tambah Senjata Range (Busur + Jarak Tembak)
3. Lihat Inventaris (Menampilkan semua senjata)
4. Upgrade Senjata (Pilih: +5 atau custom)
5. Keluar

=========================================