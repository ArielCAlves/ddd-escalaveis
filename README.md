## TP3 - Pet Friends (DDD + Event Sourcing + CQRS)
Projeto desenvolvido para o TP3 de Engenharia de Software, utilizando Spring Boot, DDD, Commands, Events, CQRS e Swagger.

### Tecnologias Utilizadas
- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Lombok
- Springdoc OpenAPI (Swagger)

### Como Executar
1. Clone o repositório
2. Rode o projeto:
`mvn spring-boot:run`
ou pode executar diretamente pela IDE

4. Acesse o Swagger:
http://localhost:8080/swagger


### Estrutura do Projeto
- command: Commands e CommandHandlers
- event: Eventos e EventSourcingHandlers
- domain: Entidade Pedido + Repository
- service: CommandService e QueryService
- controller: APIs REST (commands + queries)

### Endpoints
- POST /pedidos: Executa o command
- GET /pedidos: Lista pedidos
- GET /pedidos/{id}: Busca por ID
