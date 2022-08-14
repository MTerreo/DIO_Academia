# Projeto Spring Data JPA na Prática
## | Java | Spring JPA | PostgreSQL |

Este projeto tem como referência o projeto de LAB _"Projeto Spring Data JPA na Prática"_ oferecido  pela plataforma de cursos online  https://dio.me/ - Digital Innovation One.


### Objetivo do Projeto   🎯 

- Mostrar os principais conceitos de mapeamento objeto relacional (ORM) usando o _Spring Data JPA_
- Desenvolver uma  _API RESTful_  com ênfase na modelagem de suas entidades, no domínio de uma academia de ginástica.
- Uso do PostgreSQL com o Java.


### Passos

- Apresentação do Projeto Base
- Configuração do banco de dados SGBD _PostgreSQL_
- Aplicando as _annotations_
- Execução do fluxo back-end: _Controller - Service - Repository_
- Validação _Hibernate Validator_
- Consultas Avançadas _Derived Query - Native Query_

### Tecnologias Utilizadas   🛠

- IDE IntelliJ
- Java 11
- Maven
- Spring Web
- Spring Data JPA
- PostgreSQL Driver
- Hibernate Validator
- Lombok
- Postman

###  Anotações de Mapeamento @

- @Entity - Usada para especificar que a classe anotada atualmente representa um tipo de entidade.
- @Table - Usada para especificar a tabela principal da entidade atualmente anotada.
- @Id - Especifica o identificador da entidade. Uma entidade deve sempre ter um atributo identificado.
- @GeneratedValue - Especifica que o valor do identificador de entidade é gerado automaticamente.
- @Column - Usada para especificar o mapeamento entre um atributo de entidade básico e a coluna da tabela de banco de dados.
- @JoinColumn - Usada para especificar a coluna FOREIGN KEY. Indica que a entidade é a responsável pelo relacionamento.
- @OneToMany - Usada para especificar um relacionamento de banco de dados um-para-muitos.
- @OneToOne - Usada para especificar um relacionamento de banco de dados um-para-um.
- @ManyToOne - Usada para especificar um relacionamento de banco de dados muitos-para-um.
- cascade - Realizar operações em cascata só faz sentido em relacionamentos Pai - Filho.
- mappedBy - Indica qual é o lado inverso ou não dominante da relação.

### Setup do Spring Initializr:

- Project: Maven
- Language: Java
- Spring Boot: 2.7.2

Project Metadata
- Group: Study
- Artifact: Academia
- Name: Academia
- Description: Tutorial API RESTful modelando sistema de academia de ginástica
- Package name: Study.Academia
- Packaging: Jar
- Java: 11

Dependencies:


- Spring Data JPA SQL
Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.

- PostgreSQL Driver SQL
A JDBC and R2DBC driver that allows Java programs to connect to a PostgreSQL database using standard,
database independent Java code.

- Lombok DEVELOPER TOOLS
Java annotation library which helps to reduce boilerplate code.
- Spring Web WEB
Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.

### Nota
Neste projeto usamos application.yml  no lugar de application.properties
no link abaixo temos uma explicaçãi da diferença dos dois formatos de arquivo:
https://www.baeldung.com/spring-boot-yaml-vs-properties

### Links Úteis   🔗

- "https://strn.com.br/artigos/2018/12/11/todas-as-anota%C3%A7%C3%B5es-do-jpa-anota%C3%A7%C3%B5es-de-mapeamento/"
- "https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.6.1&packaging=jar&jvmVersion=11&groupId=me.dio.academia&artifactId=academia-digital&name=academia-digital&description=Tutorial%20API%20RESTful%20modelando%20sistema%20de%20academia%20de%20gin%C3%A1stica&packageName=me.dio.academia.digital&dependencies=web,data-jpa,postgresql,validation,lombok" Spring Initializr
- "https://docs.spring.io/spring-boot/docs/2.0.x/reference/html/common-application-properties.html" Common application properties
- ="https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.repositories" Spring Data JPA - Reference Documentation
- "https://docs.jboss.org/hibernate/stable/validator/reference/en-US/html_single/#validator-gettingstarted" Validation Reference Implementation: Reference Guide


### Agradecimentos:

> A equipe da DIO pelo trabalho e empenho para disponibilizar conhecimento


