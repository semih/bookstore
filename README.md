➜ devops git:(master) mvn clean install

➜ devops git:(master) java -jar bookapp-0.0.1-SNAPSHOT.jar

➜ devops git:(master) docker build -t bookapp:0.0.1 .

➜ devops git:(master) docker run -d --name bookapp bookapp:0.0.1

➜ devops git:(master) docker kill 6454a7520f16

➜ devops git:(master) docker run -d --name bookapp bookapp:0.0.1 docker: Error response from daemon: Conflict. The container name "/bookapp" is already in use by container "6454a7520f169c764d2bdf9c6318ba9bd1bc3162b757e9333c54ada61df6703c". You have to remove (or rename) that container to be able to reuse that name. See 'docker run --help'.

➜ devops git:(master) docker kill bookapp

➜ devops git:(master) docker rm bookapp

➜ devops git:(master) docker run 6454a7520f169c764d2bdf9c6318ba9bd1bc3162b757e9333c54ada61df6703c

➜ devops git:(master) docker kill bookapp

➜ devops git:(master) docker rm 6454a7520f169c764d2bdf9c6318ba9bd1bc3162b757e9333c54ada61df6703c

➜ devops git:(master) docker run -d --name bookapp -p 9090:8080 bookapp:0.0.1

➜ devops git:(master) docker ps CONTAINER ID IMAGE COMMAND CREATED STATUS PORTS NAMES c96cd1b923e4 bookapp:0.0.1 "java -jar bookapp-0.…" 3 seconds ago Up 2 seconds 0.0.0.0:9090->8080/tcp, :::9090->8080/tcp bookapp 8b59c747880d mongo:latest "docker-entrypoint.s…" 4 months ago Up 35 hours 0.0.0.0:27017->27017/tcp, :::27017->27017/tcp gateway-local

Dockerfile configuration has been modified to run with the "mvn clean install" command.

➜ devops git:(master) docker build -t bookapp:0.0.2 .

➜ devops git:(master) docker run --name bookapp -p 9090:8080 bookapp:0.0.2

➜ devops git:(master) ✗ docker kill c2b378025605d4767e80390bfa67856533d1b93681806e392b17124aa189fbbe

➜ devops git:(master) ✗ docker rm c2b378025605d4767e80390bfa67856533d1b93681806e392b17124aa189fbbe

➜ devops git:(master) docker exec -it bookapp bash

➜ devops git:(master) ✗ jenv exec ./mvnw clean install -U (compile the project)

Put a new argument to change the profile of spring boot project, ENTRYPOINT ["java","-jar","-Dspring.profiles.active=docker", "bookapp-0.0.1-SNAPSHOT.jar"]

➜ devops git:(master) ✗ docker build -t bookapp:0.0.3 .

➜ devops git:(master) ✗ docker run -d --name bookapp -p 9090:8080 bookapp:0.0.3

go to the folder where is a docker-compose.yaml file and execute "docker-compose up" command. h2 database running...