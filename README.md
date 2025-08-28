Pemrograman Berorientasi Objek (**OOP**) adalah paradigma pemrograman yang memodelkan dunia nyata ke dalam program menggunakan **objek** dan **kelas**. OOP memudahkan pengembangan program yang **terstruktur, modular, dan fleksibel**.  

Beberapa konsep penting yang dipelajari pada praktikum ini antara lain:
- **Inheritance**: Memungkinkan kelas anak mewarisi atribut dan method dari kelas induk, sehingga kode dapat digunakan kembali tanpa menulis ulang.
- **Interface**: Mendefinisikan kontrak perilaku tanpa implementasi. Dengan interface, satu kelas dapat memiliki banyak peran (multi inheritance).
- **Constructor, this, dan super**: Constructor digunakan untuk menginisialisasi objek saat dibuat. `this` merujuk pada objek saat ini, sedangkan `super` merujuk pada kelas induk untuk memanggil constructor atau method dari superclass.

Praktikum ini bertujuan agar mahasiswa memahami cara **menggabungkan inheritance, interface, dan constructor**, serta mampu memodelkan berbagai peran dalam satu objek.

---

## 🚀 Konsep Praktikum
1. **Interface**
   - `ContentCreator` → membuat konten, live streaming, mendapatkan endorse.
   - `IbuRumahTangga` → memasak, mengurus anak, membersihkan rumah.
   - `PekerjaanGubernur` → memimpin, membuat kebijakan, mengawasi.

2. **Inheritance**
   - `Gubernur` mewarisi atribut dan method dari `Provinsi`.

3. **Constructor, this & super**
   - Constructor digunakan untuk menginisialisasi objek.
   - `this` merujuk ke atribut objek saat ini.
   - `super` memanggil constructor atau method dari kelas induk.

---

## 🖥️ Langkah-Langkah Praktikum
1. Buat project Java baru di IDE (NetBeans/Eclipse).  
2. Buat class **Provinsi** dengan atribut `namaProvinsi` dan `jumlahPenduduk`.  
3. Buat tiga interface: `ContentCreator`, `IbuRumahTangga`, `PekerjaanGubernur`.  
4. Buat class **Gubernur**:
   - `extends Provinsi`  
   - `implements ContentCreator, IbuRumahTangga, PekerjaanGubernur`  
   - Tambahkan atribut `namaGubernur` dan `jenisKelamin`.  
   - Gunakan `super` untuk memanggil constructor `Provinsi` dan `this` untuk membedakan atribut.  
5. Override semua method dari interface dengan isi aktivitas masing-masing.  
6. Buat class **Main** untuk membuat objek `Gubernur` dan memanggil semua method.  
7. Jalankan program dan periksa output.
