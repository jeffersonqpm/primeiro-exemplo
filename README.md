# Projeto Backend: Sistema com Spring Boot
> **Status:** Em desenvolvimento 🚀 (Curso Udemy)

## 📋 Sobre o Projeto
Este projeto está sendo desenvolvido como parte do meu aprendizado prático em Java e no ecossistema Spring. O objetivo é construir uma API RESTful robusta, focada em escalabilidade e seguindo as melhores práticas de mercado, como a arquitetura em camadas e o tratamento de exceções personalizado.

---

## 🛠️ Tecnologias Utilizadas
* **Linguagem:** Java 17+
* **Framework Principal:** Spring Boot 3
* **Acesso a Dados:** Spring Data JPA / Hibernate
* **Banco de Dados:** H2 (Ambiente de Testes) / PostgreSQL (Produção)
* **Documentação:** Swagger (SpringDoc OpenAPI)
* **Gerenciador de Dependências:** Maven

---

## 🏗️ Arquitetura do Sistema
O projeto utiliza a **Arquitetura em Camadas** para garantir a separação de responsabilidades e facilitar a manutenção:

1.  **Recursos (Controllers):** Responsáveis pelos endpoints da API e manipulação de requisições HTTP.
2.  **Serviços (Services):** Camada onde reside toda a lógica de negócio do sistema.
3.  **Acesso a Dados (Repositories):** Interfaces de comunicação direta com o banco de dados.
4.  **Entidades (Entities):** Representação das tabelas e modelos de domínio.
5.  **DTOs (Data Transfer Objects):** Objetos de transferência para otimizar a segurança e o tráfego de dados.

---

## 🚀 Principais Funcionalidades
* **Operações CRUD:** Implementação completa de fluxos de criação, consulta, edição e exclusão.
* **Tratamento de Exceções:** Retornos padronizados para o cliente (ex: erros 404, 400 ou 500).
* **Mapeamento Objeto-Relacional (ORM):** Gestão eficiente de associações entre entidades.
* **Seed de Dados:** Povoamento automático do banco para agilizar o processo de testes.

---

## ⚙️ Como executar o projeto
Para rodar este projeto localmente, você precisará do Java JDK e do Maven instalados.

1. Clone o repositório:
   ```bash
   git clone [https://github.com/seu-usuario/seu-repositorio.git](https://github.com/seu-usuario/seu-repositorio.git)
