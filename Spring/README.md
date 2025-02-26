## O que é Spring Boot?
Enquanto o Spring Framework é baseado no padrão de injeção de dependências, o Spring Boot foca na configuração automática, produtividade e simplicidade. Antes do Spring Boot, era necessário lidar com dependências individuais, verbosidade, incompatibilidade de versões e configurações complexas e repetitivas.

## O que são Spring Boot Starters?
Os Starters são um conjunto de dependências convenientes que você pode incluir no seu projeto. Eles fornecem todas as bibliotecas e configurações necessárias para começar a usar uma funcionalidade específica do Spring Boot rapidamente. Por exemplo, o `spring-boot-starter-web` inclui todas as dependências necessárias para criar uma aplicação web com Spring MVC.

### Exemplos de Spring Boot Starters
- `data-jpa`: Integração ao banco de dados via JPA - Hibernate.
- `data-mongodb`: Interação com banco de dados MongoDB.
- `web`: Inclusão do container Tomcat para aplicações REST.
- `web-services`: Webservices baseados na arquitetura SOAP.
- `batch`: Implementação de JOBs de processos.
- `test`: Disponibilização de recursos para testes unitários como JUnit.
- `openfeign`: Client HTTP baseado em interfaces.
- `actuator`: Gerenciamento de monitoramento da aplicação.

## Beans vs Components
No Spring, tanto `@Bean` quanto `@Component` são usados para definir beans, mas eles são usados em contextos diferentes:

@Bean: Usado em métodos dentro de uma classe anotada com `@Configuration`. É útil quando você precisa de controle total sobre a criação do bean, como definir dependências complexas ou configurar propriedades específicas.

@Component: Usado diretamente em classes para indicar que elas são beans gerenciados pelo Spring. É útil para classes que podem ser automaticamente detectadas e registradas pelo Spring através de escaneamento de componentes.

Use @Bean quando você precisa de mais controle sobre a criação do bean, e @Component quando você deseja que o Spring descubra e registre automaticamente o bean.

## Escopos de Beans: Singleton vs Prototype
No Spring, os beans podem ter diferentes escopos, que definem o ciclo de vida e a visibilidade dos beans. Os dois escopos mais comuns são `singleton` e `prototype`:

- `Singleton`: Este é o escopo padrão. Apenas uma instância do bean é criada para cada contêiner Spring. Todos os pedidos subsequentes para esse bean retornarão a mesma instância.

- `prototype`: Uma nova instância do bean é criada cada vez que ele é solicitado. Este escopo é útil quando você precisa de um novo bean para cada uso.

Escolha o escopo singleton quando você deseja compartilhar uma única instância do bean em toda a aplicação, e prototype quando você precisa de uma nova instância do bean para cada solicitação.

## @Value vs @ConfigurationProperties
No Spring, você pode usar propriedades externas para configurar sua aplicação. Existem duas maneiras principais de injetar essas propriedades: `@Value` e `@ConfigurationProperties`.

### @Value
A anotação `@Value` é usada para injetar valores de propriedades diretamente em campos, métodos ou parâmetros de construtor. É útil para injetar valores simples e constantes.

### @ConfigurationProperties
A anotação `@ConfigurationProperties` é usada para mapear propriedades externas para uma classe Java. É útil para agrupar propriedades relacionadas e configurar objetos complexos.

Use @Value para injetar valores simples e constantes diretamente em campos ou métodos.
Use @ConfigurationProperties para agrupar propriedades relacionadas e configurar objetos complexos de forma mais estruturada.

## ORM
Object-Relational Mapping, é um recurso para aproximar o paradigma da orietação a objetos ao contexto de banco de dados relacional, é realizado através do mapeamento de objeto para uma tabela por uma biblioteca ou framework.

## JPA
A Java Persistence API (JPA) é uma especificação da plataforma Java que simplifica o gerenciamento de dados relacionais em aplicações Java. Ela fornece uma maneira padrão de mapear objetos Java para tabelas de banco de dados, permitindo que os desenvolvedores trabalhem com dados de maneira orientada a objetos. O JPA abstrai a complexidade das operações de banco de dados, como consultas, atualizações e transações, facilitando o desenvolvimento e a manutenção de aplicações. Implementações populares do JPA incluem Hibernate, EclipseLink e OpenJPA.

## Spring Data JPA
Spring Data JPA é um projeto do Spring que visa simplificar o uso da JPA em aplicações Spring. Ele fornece uma abstração de alto nível para o acesso a dados, eliminando a necessidade de escrever código boilerplate para operações comuns de banco de dados.

### Principais funcionalidades do Spring Data JPA:
- **Repositórios**: Interfaces que fornecem métodos CRUD (Create, Read, Update, Delete) prontos para uso, como `save()`, `findById()`, `findAll()`, `deleteById()`, entre outros.
- **Consultas derivadas**: Métodos de consulta podem ser definidos nas interfaces de repositório usando convenções de nomenclatura, como `findByLastName(String lastName)`.
- **Consultas personalizadas**: Consultas JPQL (Java Persistence Query Language) ou SQL nativas podem ser definidas usando a anotação `@Query`.
- **Paginação e ordenação**: Suporte integrado para paginação e ordenação de resultados de consultas.
- **Auditoria**: Suporte para auditoria automática de entidades, como criação e modificação de timestamps.

## Repository Pattern
*Repository* é um padrão de projeto similar ao DAO (Data Access Object) no sentido de que seu objetivo é abstrair o acesso a dados de forma genérica a partir do seu modelo

