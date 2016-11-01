
mvn clean package

if exist "target/billing-service.war" (
	echo "file exist"
	cp billing-service.war %CATALINA_HOME%/webapp
) else (
	echo "error encountered"
)
