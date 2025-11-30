# Construindo um Serviço Web RESTful com Spring Boot  
![Java](https://img.shields.io/badge/Java-17+-informational?logo=java&color=blue)  
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?logo=springboot)  
![Build](https://img.shields.io/github/actions/workflow/status/USERNAME/REPO/build.yml?label=Build&logo=github)  
![License](https://img.shields.io/badge/Licença-Apache%202.0-yellow)  
![Issues](https://img.shields.io/github/issues/USERNAME/REPO)  
![Stars](https://img.shields.io/github/stars/USERNAME/REPO?style=social)  

> ⚠️ Substitua `USERNAME/REPO` pelo usuário e nome do seu repositório no GitHub.

---

## 📌 Visão Geral

Este projeto demonstra como construir um serviço web **RESTful** simples usando **Spring Boot**.  
Ele expõe um endpoint `/olamundo` que retorna um cumprimento em formato JSON e permite personalizar o nome via parâmetro de consulta (`query param`).

---

## 🛠️ Tecnologias Utilizadas

- Java **17+**
- Spring Boot **3.x**
- Spring Web
- Maven ou Gradle
- Jackson (serialização automática para JSON)

---

## 📂 Estrutura do Projeto

src/
└── main/
├── java/com/fabricio/minhapp/
│ ├── Minhapp.java
  └── controle/
│ ├── Controle.java
  └── modelo/
│ ├── OlaMundo.java
│
└── resources/
└── application.properties

---

## 📘 Endpoints da API

### GET `/olamundo`

#### Resposta Padrão
http://localhost:8080/olamundo
```json
{"id": 1, "content": "Hello, World!"}

http://localhost:8080/olamundo?nome=User
{"id": 2, "content": "Hello, User!"}

## 📘 Rodar
./mvnw spring-boot:run

