# Installasi Software

Sebelum kita memulai ada bebarapa yang harus disiapkan seperti installasi software-software berikut:

* Oracle JDK (Java Development Kit)
* Apache Tomcat (Web Server)
* Apache Maven
* PostgreSQL (Database Server)
* Text Editor

Setup yang pertama kita harus install dulu corenya yaitu **Oracle JDK** di Windows 10.

## Setup Oracle JDK

Ok, pertama kita sediakan dulu installernya yang bisa di unduh di halaman berikut 
[http://www.oracle.com/technetwork/java/javase/downloads/index.html](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
kemudian pilih yang JDK 8uXXX untuk saat ini versinya sudah mencapai 8u144 ya. pilih saja yang terbaru.

setelah di download, langsung ja running file installernya maka akan munculu tampilan seperti berikut:

![installer-java-jdk](images/java-jdk/install-jdk-1.png)

Klik **next** untuk menanjutkan, kemudian akan tampil form untuk menentukan lokasi JDK disimpan berikutnya:

![lokasi-java-jdk](images/java-jdk/install-jdk-2.png)

Lokasi JDKnya saya mau biarkan default saja, kemudian klik **next** untuk selanjutnya melakukan instalasi JRE seperti berikut:

![lokasi-java-jdk](images/java-jdk/install-jdk-3.png)

Sama dengan JDK lokasi JREnya saya mau biarkan default aja, Setelah itu klik **next** lagi dan selelai intallasi **Oracle JDK** kemudian klik **Close**


Tahap selanjutnya adalah setup PATHnya supaya bisa dikenali oleh Sistem Operasi Windowsnya jadi bisa di akses melalui Command Prompt (CMD). berkut langkah langkahnya:

Buka File **Explorer** kemudian Klik **Kanan** pada This PC setelah itu pilih **Properties** seperti berikut:

![lokasi-java-jdk](images/java-jdk/setpath-jdk-1.png)

Terus klik **Advanced system settings** maka akan tampil Form seperti Berikut:

![lokasi-java-jdk](images/java-jdk/setpath-jdk-2.png)

Kemudian klik **Environtment Variables…** maka akan tampil form seperti berikut:

![lokasi-java-jdk](images/java-jdk/setpath-jdk-3.png)

Di menu **User variables for dimMaryanto** klik button **New** maka akan tampil form seperti berikut:

![lokasi-java-jdk](images/java-jdk/setpath-jdk-4.png)

Kemudian isi **Variable name:** dengan **JAVA_HOME** 

*huruf besar semua dan 

untuk **Variable value:** anda arahkan ke lokasi hasil installasi JDK klo saya lokasinya di sini `C:\Program Files\Java\jdk1.8.0_91` 
setelah ikut Klik **OK**, maka hasilnya seperti berikut:

![lokasi-java-jdk](images/java-jdk/setpath-jdk-5.png)

Kemudian kita pindah ke **System variables**, anda cari **variable name:** dengan nama **PATH** atau **Path** seperti berikut:

![lokasi-java-jdk](images/java-jdk/setpath-jdk-6.png)

kemudian anda klik button **Edit** maka akan tampil form seperti berikut:

![lokasi-java-jdk](images/java-jdk/setpath-jdk-7.png)

Klik button **New** kemudian arahkan ke lokasi yang installasi folder bin di hasil installasi JDK jadi klo di saya seperti ini `C:\Program files\Java\jdk-8u101\bin` hasilnya seperti berikut:

![lokasi-java-jdk](images/java-jdk/setpath-jdk-8.png)

Setelah itu klik **OK** semua dialog yang ada sampe keluar dari **system properties**. setelah sampe sini proses instalasi di windows udah beres. saatnya tinggal kita cek aja configurasi.a dengan menggunakan Command Prompt

Buka Command Prompt dengan menggunakan kombinasi key **WIN + R** maka akan tampil form seperti berkut:

![lokasi-java-jdk](images/java-jdk/run-cmd-2.png)

kemudian coba cek configurasi javanya dengan cara melihat versi yang telah terinstall di OS menggunakan perintah seperti berikut:

```bash
 C:\Users\softw>java -version && java -version
 java version "1.8.0_91"
 Java(TM) SE Runtime Environment (build 1.8.0_91-b15)
 Java HotSpot(TM) 64-Bit Server VM (build 25.91-b15, mixed mode)
 java version "1.8.0_91"
 Java(TM) SE Runtime Environment (build 1.8.0_91-b15)
 Java HotSpot(TM) 64-Bit Server VM (build 25.91-b15, mixed mode)
 
 C:\Users\softw>
```

Setelah installasi **Oracle JDK** sekarang kita masuk ke tahap yang ke dua yaitu Installasi Web Server.

## Setup Apache Tomcat Web Server.








