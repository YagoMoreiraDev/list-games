# Projeto Backend para Treinamento em API REST com Spring
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/devsuperior/sds1-wmazoni/blob/master/LICENSE)

# Sobre o projeto

Este é um projeto pessoal de backend desenvolvido no Intensivão Java, ministrado pelo grande professor Nélio Alves, que tem como propósito praticar e aprimorar habilidades em API REST usando o framework Spring.

## Objetivo do Projeto

O objetivo deste projeto é explorar e aprender sobre os seguintes conceitos e tecnologias:

    Conceitos de API REST
    Sistemas Web e recursos
    Cliente/servidor, HTTP, JSON
    Padrão REST para APIs web
    Estruturação de projeto Spring REST
    Entidades e ORM
    Database seeding
    Padrão de camadas (Controller, Service, Repository)
    Padrão DTO (Data Transfer Object)
    Relacionamentos Many-to-Many
    Classe de associação, Embedded Id
    Consultas SQL no Spring Data JPA
    Projeções (Projections)
    Perfis de projeto
    Ambiente local com Docker Compose
    Processo de homologação local
    Processo de deploy com CI/CD
    Configuração de CORS

## Estrutura do Projeto

O projeto segue uma arquitetura de camadas comum em aplicações Spring:

    Controller: Responsável por lidar com as requisições HTTP, mapeando endpoints e chamando os serviços apropriados.
    
    Service: Implementa a lógica de negócio da aplicação, interagindo com os repositórios.
    
    Repository: Responsável pela interação com o banco de dados, utilizando o Spring Data JPA para operações CRUD.
    
    DTO: Classes que representam objetos de transferência de dados, usadas para comunicação entre a camada de controle e serviços.

## Modelo conceitual
![Modelo Conceitual](https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/dslist-model.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven

# Como executar o projeto

## Back end
Pré-requisitos: Java 17

```bash
# clonar repositório
git clone https://github.com/YagoMoreiraDev/list-games

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```
    
