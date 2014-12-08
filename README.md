Struts hibernate Spring -Sample-
===============================

1. Download Zip

2. Decompress file

2. execute : 
```sh
$ cd struts_hibernate_spring-master/struts_hibernate_spring
$ mvn -Dwtpversion=2.0 clean install eclipse:clean eclipse:eclipse
```
3. import projects into eclipse
```
File > import > Existing Projects into Workspace > {ALL projects}
```
4. to run web app :
```sh
$ cd struts_hibernate_spring-master/struts_hibernate_spring-web
$ mvn clean install jetty:run
```
5. Open in browser
```url
http://localhost:9090/
```
