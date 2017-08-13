# Template ZK Java EE Framework

membuat project dengan maven archetype:

```bash
mvn archetype:generate -Dpackage=com.tabeldata -DgroupId=com.tabeldata.template-zkoss -DartifactId=template-zkoss -Dversion=1.0-SNAPSHOT -DarchetypeGroupId=org.zkoss -DarchetypeArtifactId=zk-archetype-webapp
```

untuk menjalankan project bisa menggunakan terminal atau cmd dengan syarat telah menginstall apache-maven berikut scriptnya:

```bash
mvn clean package tomcat:run
```

berikut lognya: 

```bash
C:\Users\dimMaryanto93\Documents\Projects\tabeldata.com\template-zk>mvn clean package tomcat:run
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building The template-zkoss Project 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- maven-war-plugin:2.1.1:war (default-war) @ template-zkoss ---
[INFO] Packaging webapp
[INFO] Assembling webapp [template-zkoss] in [C:\Users\dimMaryanto93\Documents\Projects\tabeldata.com\template-zk\target\template-zkoss]
[INFO] Processing war project
[INFO] Copying webapp resources [C:\Users\dimMaryanto93\Documents\Projects\tabeldata.com\template-zk\src\main\webapp]
[INFO] Webapp assembled in [512 msecs]
[INFO] Building war: C:\Users\dimMaryanto93\Documents\Projects\tabeldata.com\template-zk\target\template-zkoss.war
[WARNING] Warning: selected war files include a WEB-INF/web.xml which will be ignored
(webxml attribute is missing from war task, or ignoreWebxml attribute is specified as 'true')
[INFO]
[INFO] --- maven-assembly-plugin:2.2:single (webapp) @ template-zkoss ---
[INFO] Reading assembly descriptor: src/main/assembly/webapp.xml
[INFO] Building zip: C:\Users\dimMaryanto93\Documents\Projects\tabeldata.com\template-zk\target\template-zkoss-1.0-SNAPSHOT-FL-2017-08-13.zip
[INFO]
[INFO] >>> tomcat-maven-plugin:1.1:run (default-cli) > compile @ template-zkoss >>>
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ template-zkoss ---
[WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\Users\dimMaryanto93\Documents\Projects\tabeldata.com\template-zk\src\main\resources
[INFO]
[INFO] --- maven-compiler-plugin:2.3.2:compile (default-compile) @ template-zkoss ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] <<< tomcat-maven-plugin:1.1:run (default-cli) < compile @ template-zkoss <<<
[INFO]
[INFO]
[INFO] --- tomcat-maven-plugin:1.1:run (default-cli) @ template-zkoss ---
[INFO] Running war on http://localhost:8080/template-zkoss
[INFO] Creating Tomcat server configuration at C:\Users\dimMaryanto93\Documents\Projects\tabeldata.com\template-zk\target\tomcat
Aug 13, 2017 12:45:54 PM org.apache.catalina.startup.Embedded start
INFO: Starting tomcat server
Aug 13, 2017 12:45:54 PM org.apache.catalina.core.StandardEngine start
INFO: Starting Servlet Engine: Apache Tomcat/6.0.29
Aug 13, 2017 12:45:55 PM org.zkoss.zk.ui.http.WebManager <init>
INFO: Starting ZK 8.0.2.2 CE (build: 2016110115)
Aug 13, 2017 12:45:55 PM org.zkoss.zk.ui.sys.ConfigParser parseConfigXml
INFO: Loading system default
Aug 13, 2017 12:45:55 PM org.zkoss.zk.ui.sys.ConfigParser parse
INFO: Parsing jar:file:/C:/Users/dimMaryanto93/.m2/repository/org/zkoss/zk/zul/8.0.2.2/zul-8.0.2.2.jar!/metainfo/zk/zk.xml
Aug 13, 2017 12:45:55 PM org.zkoss.zk.ui.sys.ConfigParser parse
INFO: Parsing jndi:/localhost/template-zkoss/WEB-INF/zk.xml
Aug 13, 2017 12:45:55 PM org.apache.coyote.http11.Http11Protocol init
INFO: Initializing Coyote HTTP/1.1 on http-8080
Aug 13, 2017 12:45:55 PM org.apache.coyote.http11.Http11Protocol start
INFO: Starting Coyote HTTP/1.1 on http-8080
```

Untuk melihat hasilnya bisa di cek di alamat berikut 
```[INFO] Running war on``` [http://localhost:8080/template-zkoss](http://localhost:8080/template-zkoss)