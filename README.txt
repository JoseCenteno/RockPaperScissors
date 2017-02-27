
The Project is generated with maven 3.3.9. It has 3 modules:
-	libModule contains the mains classes and jUnit Cases. Library dependencies resolved with maven: jUnit 4.12
-	consoleTest: contains a console application to execute the match. Library dependencies resolved with maven: 
	o	libModule
	o	 jUnit 4.12
-	webTest: contains a web application to execute the match. Include a Tomcat 7 pluging to deploy localy the application. Library dependencies resolved with maven:
	o	libModule
	o	javax.faces 2.1.17
	o	primefaces  5.3

Compile

To compile the project, run the following maven statement from the command line (from the RockPaperScissors parent project)

mvn clean install 

To deploy webTest module run the following maven statement from the command line (from the webTest module)

mvn tomcat:run
