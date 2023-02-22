# CadimíaApp

## Presentation

This is a Java App to be used by gym establishments. It will let the user register a new clientEntity, organize physical assessments for this clientEntity and use the registration date to persist data.



---

ER DIAGRAM for the Gym App

---

```mermaid
erDiagram

CLIENT ||--o{ REGISTRATION : register
    CLIENT { 
        Long id
        String name
        String cpf
        String street
        LocalDate birthDate
        AvaliacaoFisica physicalAvaliation
}

CLIENT ||--o{ PHYSICAL_ASSESSMENT : do
    PHYSICAL_ASSESSMENT { 
        Long id
        Client clientEntity
        LocalDateTime evaluationDate
        double weight
        double height
 }
 
REGISTRATION {
    Long id
    Client clientEntity
    LocalDateTime registrationDate
}

```

## Back-end flow

```mermaid
stateDiagram 
[*] --> Controller 
Controller --> Service 
Service --> Controller 
Service --> Repository 
Repository --> Service 
Repository --> PostgreSQL 
PostgreSQL --> Repository
```

## Used technologies

- Java

- Maven

- Spring Web

- Spring Data JPA

- PostgreSQL Driver

- Hibernate Validator

- Lombok
