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

![Installer Oracle JDK](images/java-jdk/install-jdk-1.png)

Klik **next** untuk menanjutkan, kemudian akan tampil form untuk menentukan lokasi JDK disimpan berikutnya:

![Target Installasi JDK](images/java-jdk/install-jdk-2.png)

Lokasi JDKnya saya mau biarkan default saja, kemudian klik **next** untuk selanjutnya melakukan instalasi JRE seperti berikut:

![Target Installasi JRE](images/java-jdk/install-jdk-3.png)

Sama dengan JDK lokasi JREnya saya mau biarkan default aja, Setelah itu klik **next** lagi dan selelai intallasi **Oracle JDK** kemudian klik **Close**


Tahap selanjutnya adalah setup PATHnya supaya bisa dikenali oleh Sistem Operasi Windowsnya jadi bisa di akses melalui Command Prompt (CMD). berkut langkah langkahnya:

Buka File **Explorer** kemudian Klik **Kanan** pada This PC setelah itu pilih **Properties** seperti berikut:

![Setup environtment](images/java-jdk/setpath-jdk-1.png)

Terus klik **Advanced system settings** maka akan tampil Form seperti Berikut:

![Setup environtment Variables](images/java-jdk/setpath-jdk-2.png)

Kemudian klik **Environtment Variables…** maka akan tampil form seperti berikut:

![Setup user environment variables](images/java-jdk/setpath-jdk-3.png)

Di menu **User variables for dimMaryanto** klik button **New** maka akan tampil form seperti berikut:

![Setup JAVA_HOME](images/java-jdk/setpath-jdk-4.png)

Kemudian isi **Variable name:** dengan **JAVA_HOME** 

*huruf besar semua dan 

untuk **Variable value:** anda arahkan ke lokasi hasil installasi JDK klo saya lokasinya di sini `C:\Program Files\Java\jdk1.8.0_91` 
setelah ikut Klik **OK**, maka hasilnya seperti berikut:

![Hasil setup JAVA_HOME](images/java-jdk/setpath-jdk-5.png)

Kemudian kita pindah ke **System variables**, anda cari **variable name:** dengan nama **PATH** atau **Path** seperti berikut:

![Pilih PATH](images/java-jdk/setpath-jdk-6.png)

kemudian anda klik button **Edit** maka akan tampil form seperti berikut:

![Edit environtment PATH](images/java-jdk/setpath-jdk-7.png)

Klik button **New** kemudian arahkan ke lokasi yang installasi folder bin di hasil installasi JDK jadi klo di saya seperti ini `C:\Program files\Java\jdk-8u101\bin` hasilnya seperti berikut:

![Edit environtment PATH hasil](images/java-jdk/setpath-jdk-8.png)

Setelah itu klik **OK** semua dialog yang ada sampe keluar dari **system properties**. setelah sampe sini proses instalasi di windows udah beres. saatnya tinggal kita cek aja configurasi.a dengan menggunakan Command Prompt

Buka Command Prompt dengan menggunakan kombinasi key **WIN + R** maka akan tampil form seperti berkut:

![Testing versi java](images/java-jdk/run-cmd-2.png)

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

Untuk menginstall Apache Tomcat Web Server cukup mudah anda cukup mendownload binarynya dari link [https://tomcat.apache.org/download-80.cgi](https://tomcat.apache.org/download-80.cgi) yang ada beberapa pilihan seperti berikut:

![Tomcat installer](images/apache-tomcat/download-1.png)

Ada beberapa pilihan yaitu, 
zip file (untuk universal artinya windows, linux, mac) dan 
juga installer (khusus untuk windows) terserah aja pilih yang mana klo 
installer biasaya tinggal ikutin stepnya udah jadi klo yang manual pilih aja yang zip.

Nah karena download yang zip, jadi cukup di extract ja kemudian kita setup untuk user management di tomcatnya yaitu buka file `tomcat-user.xml`

di dalam folder `$TOMCAT_HOME/conf/tomcat-users.xml` seperti berikut:

```xml
<?xml version='1.0' encoding='cp1252'?>
<tomcat-users xmlns="http://tomcat.apache.org/xml"
              xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
              xsi:schemaLocation="http://tomcat.apache.org/xml tomcat-users.xsd"
              version="1.0">
<!--
  <role rolename="tomcat"/>
  <role rolename="role1"/>
  <user username="tomcat" password="<must-be-changed>" roles="tomcat"/>
  <user username="both" password="<must-be-changed>" roles="tomcat,role1"/>
  <user username="role1" password="<must-be-changed>" roles="role1"/>
-->
</tomcat-users>
```
Kemudian anda ubah menjadi seperti berikut:

```xml
<?xml version='1.0' encoding='cp1252'?>
<tomcat-users xmlns="http://tomcat.apache.org/xml"
              xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
              xsi:schemaLocation="http://tomcat.apache.org/xml tomcat-users.xsd"
              version="1.0">
  <user username="tomcat" password="tomcat" roles="manager-gui,admin-gui,manager-script"/>
<!--
  <role rolename="tomcat"/>
  <role rolename="role1"/>
  <user username="both" password="<must-be-changed>" roles="tomcat,role1"/>
  <user username="role1" password="<must-be-changed>" roles="role1"/>
-->
</tomcat-users>
```

Setelah itu untuk menjalankan web servernya atau start servicenya masuk folder `$TOMCAT_HOME/bin`
lalu klo windows klik 2x file `startup.bat` klo linux/unix run file `startup.sh` nanti akan muncul log seperti berikut:

```bash
Deploying web application directory [C:\Program Files\Apache Software Foundation\Tomcat 8.5\webapps\host-manager]
Deployment of web application directory [C:\Program Files\Apache Software Foundation\Tomcat 8.5\webapps\host-manager] has finished in [307] ms
Deploying web application directory [C:\Program Files\Apache Software Foundation\Tomcat 8.5\webapps\manager]
Deployment of web application directory [C:\Program Files\Apache Software Foundation\Tomcat 8.5\webapps\manager] has finished in [27] ms
Deploying web application directory [C:\Program Files\Apache Software Foundation\Tomcat 8.5\webapps\ROOT]
Deployment of web application directory [C:\Program Files\Apache Software Foundation\Tomcat 8.5\webapps\ROOT] has finished in [20] ms
14-Aug-2017 19:06:30.160 INFO [main] org.apache.coyote.AbstractProtocol.start Starting ProtocolHandler ["http-nio-8080"]
14-Aug-2017 19:06:30.166 INFO [main] org.apache.coyote.AbstractProtocol.start Starting ProtocolHandler ["ajp-nio-8009"]
14-Aug-2017 19:06:30.168 INFO [main] org.apache.catalina.startup.Catalina.start Server startup in 404 ms
```

Dan untuk mengetop serverinya klose aja, windows tomcat logsnya seperti berikut:

![Tomcat console logs](images/apache-tomcat/tomcat-logs.png)

Setup untuk installasi Apache tomcat web server udah selesai tahap salanjutnya yaitu installasi Apache Maven.

## Setup Apache Maven