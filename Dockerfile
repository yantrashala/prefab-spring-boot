#This is a multi-stage docker build which uses the cachin internally of the images 

#Building Java application using maven build system
FROM maven:3.5.2-jdk-8-alpine as build

#labelling so that intermediate images without repository and tag can be identified
LABEL stage=intermediate

#copying the pom.xml of the project
COPY pom.xml /tmp/

#Getting all the dependencies layer and this would not change unless the pom.xml files get changed
RUN mvn -B dependency:go-offline -f /tmp/pom.xml -s /usr/share/maven/ref/settings-docker.xml

#copying the source code for building
COPY src /tmp/src/
WORKDIR /tmp/

#This will create an intermediate layer to build the jar file and then extract back from jar file
RUN mvn -B -s /usr/share/maven/ref/settings-docker.xml package \
	&& cd target \
	&& jar -xvf *.jar

#Copying the run script
COPY scripts /tmp/scripts

#Building the application layer
FROM java:8-jre-alpine

#Creating the directories for application and test results
RUN mkdir -p /app /scripts /TestResults

#getting the dependencies lib in the application
COPY --from=build /tmp/target/BOOT-INF/lib /app/lib
COPY --from=build /tmp/target/META-INF /app/META-INF 
RUN rm -rf /app/META-INF/maven

#Getting the application class
COPY --from=build /tmp/target/BOOT-INF/classes /app

#copy unit test case results
COPY --from=build /tmp/target/surefire-reports/*.xml /TestResults/test_results.xml

#Getting the entrypoint script
COPY --from=build /tmp/scripts /scripts
RUN dos2unix /scripts/*.sh
ENTRYPOINT ["sh", "/scripts/dockerRun.sh"]