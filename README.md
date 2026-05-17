# Java Spring Boot Projects

Este workspace contém dois projetos de exemplo em Java usando Spring Boot:

1. `springboot_JPA_H2`
   - Projeto Spring Boot com persistência JPA e banco de dados em memória H2.
   - Contém recursos REST para `Category`, `Order`, `Product` e `User`.
   - Inclui camadas de controller, service e repository.
   - Arquivos principais:
     - `src/main/java/com/springboot/jpa/SpringbootApplication.java`
     - `src/main/java/com/springboot/jpa/a_resources_controller/*`
     - `src/main/java/com/springboot/jpa/b_services/*`
     - `src/main/java/com/springboot/jpa/c_dal_repositories/*`
     - `src/main/resources/application.properties`
     - `src/main/resources/application-test.properties`

2. `springboot_mongoDB`
   - Projeto Spring Boot com persistência MongoDB.
   - Estrutura de domínio, DTOs, repositórios, serviços e recursos REST.
   - Aplicação exemplo para trabalhar com dados em MongoDB.
   - Arquivos principais:
     - `src/main/java/com/springboot/mongodb/MongodbApplication.java`
     - `src/main/java/com/springboot/mongodb/config/*`
     - `src/main/java/com/springboot/mongodb/domain/*`
     - `src/main/java/com/springboot/mongodb/dto/*`
     - `src/main/java/com/springboot/mongodb/repository/*`
     - `src/main/java/com/springboot/mongodb/resources/*`
     - `src/main/java/com/springboot/mongodb/services/*`
     - `src/main/resources/application.properties`

## Como executar

Cada projeto possui seu próprio wrapper Maven (`mvnw` / `mvnw.cmd`) e `pom.xml`.

- Para rodar o projeto JPA + H2:
  - Navegue até `springboot_JPA_H2`
  - Execute `./mvnw spring-boot:run` no Linux/macOS ou `mvnw.cmd spring-boot:run` no Windows

- Para rodar o projeto MongoDB:
  - Navegue até `springboot_mongoDB`
  - Execute `./mvnw spring-boot:run` no Linux/macOS ou `mvnw.cmd spring-boot:run` no Windows

## Observações

- O projeto `springboot_JPA_H2` utiliza H2 para testes rápidos em memória.
- O projeto `springboot_mongoDB` deve ser executado com um MongoDB disponível conforme configuração de `application.properties`.
