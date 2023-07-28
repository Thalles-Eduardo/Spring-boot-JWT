<h1 align="center">
  JWT-API
</h1>

<p align="center">
 <img src="https://img.shields.io/static/v1?label=License&message=MIT&color=8257E5&labelColor=000000" alt="License" />
</p>

Essa API faz a geração de um JWT(Json web token), autenticando uma página através do token gerado, além da criptografia hash da senha.


## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Spring Security](https://spring.io/projects/spring-security)
- [PostgreSQL](https://www.postgresql.org/download/)
- [JWT](https://jwt.io)
- [Lombok](https://projectlombok.org)

## Práticas adotadas

- SOLID, DRY, YAGNI, KISS
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências

## Como Executar

- Clonar repositório git
```bash
$ git clone https://github.com/Thalles-Eduardo/Spring-boot-JWT
```
- Executar a aplicação:
```bash
$ ./mvnw spring-boot:run
```

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [Postman](https://www.postman.com/downloads/) ou de sua preferência.

- Criar usuário.  

![Criar usuário](https://github.com/Thalles-Eduardo/Spring-boot-JWT/assets/69612509/ac2193dd-2256-4018-999e-d7b028594acb)

- Fazer login.

![Fazer login](https://github.com/Thalles-Eduardo/Spring-boot-JWT/assets/69612509/63c872b9-26be-4608-86a8-13a04b40b95d)

- Adicionar produto, para adicionar o produto você deve passar o token, pelo Postman deve-se ir nas opções "Authorization" -> "Type" -> "Bearer Token" e assim colar o token no campo "Token".

![Adicionar produto](https://github.com/Thalles-Eduardo/Spring-boot-JWT/assets/69612509/938acf4f-d31a-49d3-b54d-8f957fc01222)

- Listas de todos os produtos, para listar todos os produtos basta fazer o mesmo procedimento feito no adicionar produto, mas com o método GET.
  
![Listas de todos os produtos](https://github.com/Thalles-Eduardo/Spring-boot-JWT/assets/69612509/56dbd941-56b7-4659-b451-fe7a9b91161a)


# Author

Thalles Eduardo Dias da Silva

- [Linkedin](https://linkedin.com/in/thalles-eduardo-7297a6237)
