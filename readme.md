# Redis with Spring Boot

[![My Skills](https://skillicons.dev/icons?i=azure,java,redis,kubernetes,docker,spring)](https://skillicons.dev)

[![Generic badge](https://img.shields.io/badge/status-developing-yellow.svg)](/#/)

## 🔗 Links

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://br.linkedin.com/in/luiza-andrade-ti/)  [![git](https://img.shields.io/badge/github-000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/luizaandradeti/) 
 

- [Redis with Spring Boot](#redis-with-spring-boot)
- [Tech Stack](#tech-stack--)
    * [Redis](#redis)
- [Hands on Redis](#hands-on-redis)


## Tech Stack  

**Acknowledges:**
- Spring Boot/Java
- Docker (https://docs.docker.com/get-docker/) 
- SQL

**Client tools:**
- Postman
- Azure account 

**Development tools :** 
- Java 17
- IntelliJ
- Docker
- Eksctl


## Redis 

<i>"Redis can be used as a database, cache, streaming engine, message broker, and more. The following quick start guides will show you how to use Redis for the following specific purposes:

Data structure store
Document database
Vector database." </i>

Redis can be used with lists, sets, maps, strings e others. 
https://redis.io/docs/latest/develop/get-started/

## Hands on Redis
Create an application using [Spring Initializr](https://start.spring.io/),

As per picture below:

![Spring Initializr](imgs/spring_initializr.jpeg)

[Docker](https://hub.docker.com/_/redis)
[mvn](https://mvnrepository.com/artifact/com.github.javafaker/javafaker/1.0.2)

![Spring Initializr](imgs/APP.png)

Run docker redis in terminal

````
docker pull redis:8.0-M04-alpine
docker run -d -p 6379:6379 --name redis-local redis:8.0-M04-alpine
````

Turn on telnet:
![telnet](imgs/telnet.png)

Test connectivity in git bash: 

```
telnet localhost 6379
```

Set environment variables:

![env](imgs/variables.png)

