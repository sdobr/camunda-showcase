## Prerequisites
* Java 11
* Maven

## Run the application and use Camunda Webapps

You can build the application with `mvn clean install` and then run it with `java -jar` command.
Then you can access Camunda Webapps in browser: `http://localhost:8080` (provide login/password from `application.yaml`, default: admin/admin)

## Run
* open your browser under `http://localhost:8080` and login
* go to Home -> Start process
* add Business Key = 1 and variable `milch=keine|Kuhmilch|Sojamilch`
