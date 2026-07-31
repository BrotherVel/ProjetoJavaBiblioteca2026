# 📚 Biblioteca Unicesumar

> Sistema web para gerenciamento de livros desenvolvido em **Java Web** utilizando **Servlets, JSP, MVC e MySQL**.

![Java](https://img.shields.io/badge/Java-8%2B-orange)
![JSP](https://img.shields.io/badge/JSP-Java%20Server%20Pages-blue)
![Servlet](https://img.shields.io/badge/Servlet-Jakarta-green)
![MySQL](https://img.shields.io/badge/MySQL-Database-4479A1)
![Tomcat](https://img.shields.io/badge/Tomcat-9%2B-yellow)

---

# 📖 Sobre o projeto

Este projeto foi desenvolvido como atividade da disciplina **Imersão Profissional: Fábrica de Software**, do curso de **Análise e Desenvolvimento de Sistemas** da **Unicesumar**.

A aplicação implementa um sistema de gerenciamento de biblioteca utilizando a arquitetura **MVC (Model-View-Controller)**, permitindo o cadastro, listagem e exclusão de livros armazenados em um banco de dados MySQL.

---

# 👨‍🎓 Informações Acadêmicas

**Estudante:** Lucas Reis Rodrigues

**Curso:** Superior de Tecnologia em Análise e Desenvolvimento de Sistemas

**Disciplina:** Imersão Profissional: Fábrica de Software

**Instituição:** Unicesumar

---

# 🚀 Tecnologias Utilizadas

- Java
- Servlets
- JSP
- JDBC
- HTML5
- CSS3
- JavaScript
- MySQL
- Apache Tomcat
- Eclipse IDE

---

# 🏛 Arquitetura

O projeto segue o padrão **MVC (Model-View-Controller)** juntamente com o padrão **DAO (Data Access Object)**.

```text
View
│
├── index.html
├── Biblioteca.jsp
├── novo.html
├── validador.js
└── confirmador.js
        │
        ▼
Controller
│
└── Controller.java
        │
        ▼
Model
│
├── JavaBeans.java
└── DAO.java
```

---

# 📂 Estrutura do Projeto

```text
Biblioteca/

├── src/main/java
│
├── controller
│   └── Controller.java
│
└── model
    ├── DAO.java
    └── JavaBeans.java

src/main/webapp
│
├── index.html
├── Biblioteca.jsp
├── novo.html
├── style.css
├── style2.css
│
├── imagens/
│
└── scripts/
    ├── validador.js
    └── confirmador.js
```

---

# 🗄 Banco de Dados

O projeto utiliza um banco MySQL chamado **biblioteca**.

```sql
CREATE DATABASE biblioteca;
USE biblioteca;

CREATE TABLE livros(
    idcon INT PRIMARY KEY AUTO_INCREMENT,
    Titulo VARCHAR(50) NOT NULL,
    Autor VARCHAR(50) NOT NULL,
    Ano_Publicacao INT NOT NULL,
    ISBN VARCHAR(17) NOT NULL
);
```

Consultar os registros:

```sql
SELECT * FROM livros ORDER BY Titulo;
```

---

# ⚠ Configuração

Antes de executar o projeto, configure suas credenciais do MySQL em:

```text
src/main/java/model/DAO.java
```

```java
private String driver = "com.mysql.cj.jdbc.Driver";

private String url =
"jdbc:mysql://127.0.0.1:3306/biblioteca?useTimezone=true&serverTimezone=UTC";

private String user = "root"; // Exemplo

private String password = "SUA_SENHA"; // Coloque sua senha aqui
```

---

# ▶ Como Executar

## 1 - Clone o repositório

```bash
git clone https://github.com/SEU-USUARIO/java-biblioteca.git
```

---

## 2 - Configure o banco

Execute o script SQL presente neste README ou importe o arquivo `.sql` disponível no projeto.

---

## 3 - Importe no Eclipse

- File
- Import
- Existing Projects into Workspace

---

## 4 - Adicione o Driver JDBC

Adicione o **mysql-connector-j.jar** ao projeto.

---

## 5 - Configure o Tomcat

Utilize o Apache Tomcat 9 ou superior.

---

## 6 - Execute

Abra:

```
http://localhost:8080/Biblioteca/index.html
```

---

# ✅ Funcionalidades

- ✔ Cadastro de livros
- ✔ Listagem dinâmica utilizando JSP
- ✔ Exclusão de livros
- ✔ Validação de formulários com JavaScript
- ✔ Confirmação antes da exclusão
- ✔ Integração com banco MySQL
- ✔ Arquitetura MVC
- ✔ Persistência utilizando JDBC

---

# 📚 Referências

- José de Assis — Curso Java Web (Servlet, JSP e JDBC)
- Material da disciplina **Imersão Profissional: Fábrica de Software** — Unicesumar

---

# 📄 Licença

Este projeto foi desenvolvido para fins **acadêmicos e educacionais**.

Licenciado sob a licença **MIT**.
