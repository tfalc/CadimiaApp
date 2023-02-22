# CadimiaApp

```erDiagram 
---
title: GymEntityRelationship
---

ALUNO ||--o{ MATRICULA : cadastra
    ALUNO { 
        Long id
        String nome
        String cpf
        String bairro
        LocalDate dataDeNascimento
        AvaliacaoFisica avaliacaoFisica
}

ALUNO ||--|{ AVALIACAO FISICA { 
    int orderNumber 
    string deliveryAddress
 }
 
MATRICULA { 
string productCode 
int quantity 
float pricePerUnit }```
```

```classDiagram
Animal <|-- Duck
Animal <|-- Fish
Animal <|-- Zebra
Animal : +int age
Animal : +String gender
```
