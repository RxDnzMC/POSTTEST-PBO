=========================================
      README POSTTEST 5 - ABSTRACTION
=========================================

Nama  : Rangga Aditya Rahman
NIM   : 2409106044
Judul : Sistem Manajemen Inventaris Senjata Medieval (v2.0)

-----------------------------------------
A. UPDATE DARI POSTTEST 4
-----------------------------------------

1. KELAS ABSTRAK (Abstract Class & Method)
   - Class "Senjata" sekarang jadi Abstract (tidak bisa dibuat objek langsung).
   - Tambah method abstract "serang()", jadi tiap tipe senjata punya cara serang beda.

2. INTERFACE (IForgeable)
   - Membuat interface untuk fitur tempa senjata.
   - Method: reforge() (ganti bahan) dan cekKualitas() (cek kondisi).

-----------------------------------------
B. STRUKTUR PROGRAM
-----------------------------------------

- Senjata (Abstract Parent)
   ├── SenjataMelee (Child) -> implements IForgeable
   └── SenjataRange (Child) -> implements IForgeable
- IForgeable (Interface)

-----------------------------------------
C. FITUR UTAMA
-----------------------------------------

1. Tambah Senjata Melee (Bahan spesifik)
2. Tambah Senjata Range (Jarak tembak)
3. Lihat Inventaris & Tes Serang (Tes fungsi Abstract)
4. Upgrade Senjata (Overloading Damage)
5. Tempa Ulang / Reforge (Tes fungsi Interface)
6. Keluar

-----------------------------------------
D. CARA JALANIN
-----------------------------------------

1. Compile: javac *.java
2. Jalankan: java Main

=========================================