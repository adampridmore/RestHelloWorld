Pre-requisites
==============

Install Java 1.x (1.7?)
http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html

Install maven:
http://maven.apache.org/

To build/run
============

Open a command shell to the root of the project (with the pom.xml file), and

to build;
	mvn install

to run;
	mvn jetty:run

Test methods URL:
	http://localhost:8081/RestHelloWorld/services/test/
	http://localhost:8081/RestHelloWorld/services/test/helloWorld2
