# CadimiaApp

```mermaid
erDiagram gym

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
float pricePerUnit }
```
