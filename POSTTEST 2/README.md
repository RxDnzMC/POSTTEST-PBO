# Laporan Posttest 2 PBO

**Nama:** Rangga Aditya Rahman  
**NIM:** 2409106044  
**Judul:** Sistem Manajemen Inventaris & Resep Crafting Senjata Medieval

### Perubahan di Posttest 2 (Encapsulation):
1. **Access Modifier:** Mengubah atribut pada class `Senjata` dari `public` menjadi `private`. Hal ini dilakukan agar data tidak dapat diakses atau diubah secara sembarangan dari luar class (Data Hiding).
2. **Getter dan Setter:** Menambahkan method `getNama()`, `getTipe()`, dan `getDamage()` untuk mengambil nilai, serta `setNama()`, `setTipe()`, dan `setDamage()` untuk mengubah nilai variabel yang di-private tersebut.
3. **Keamanan Data:** Dengan encapsulation, validasi data bisa dilakukan di dalam setter sebelum benar-benar diubah.

### Cara Menjalankan:
1. Compile file `Senjata.java` dan `Main.java`.
2. Jalankan `Main.java`.
3. Masukkan pilihan menu 1-5.