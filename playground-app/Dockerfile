# docker build --tag=gradle-artifactory-playground .
# docker run -it -p 8080:8080 -p 9990:9990 gradle-artifactory-playground
# http://localhost:8080/playground-app-web-0.1/hello (Mac OSX: `boot2docker ip` instead of localhost)

FROM sillenttroll/wildfly-java-8
RUN /opt/wildfly/bin/add-user.sh admin admin --silent
ADD playground-app-web/build/libs/playground-app-web-0.1.war /opt/wildfly/standalone/deployments/