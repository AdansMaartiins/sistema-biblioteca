<div align="center">
  <img src="https://img.icons8.com/fluency/96/library.png" alt="Library Icon" />
  <h1>📚 Library Management System Java</h1>
  <p><i>Sistema de gestão de biblioteca desenvolvido em Java, focado em Orientação a Objetos e organização de dados.</i></p>
</div>

<hr>

## 📌 Sobre o Projeto
Este projeto gerencia o acervo de uma biblioteca, permitindo o controle de livros, usuários e empréstimos. Foi desenvolvido como parte dos estudos de Java para aplicar conceitos de lógica e persistência em memória.

## 🚀 Funcionalidades
- [x] **Gestão de Acervo:** Cadastro e listagem de livros com título, autor e ID único.
- [x] **Filtro por Seção:** Organização de livros por categorias (Aventura, Terror, Suspense, etc).
- [x] **Sistema de Empréstimos:** Vinculação de livros a usuários com controle de status.
- [x] **Validação de IDs:** Garantia de que operações de busca e empréstimo utilizem identificadores válidos.
- [x] **Interface via Console:** Menu interativo para navegação entre as funções do sistema.
- [x] **POO Aplicada:** Uso de encapsulamento, herança e composição para estruturar as entidades.

## 🛠️ Tecnologias e Conceitos Aplicados
<div style="display: inline-block;">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white" />
  <img src="https://img.shields.io/badge/POO-blue?style=for-the-badge" />
</div>

- **Organização:** Separação clara entre a classe principal (`Main`) e a lógica de negócio (`Gerenciador`).
- **Conceitos Java:** Uso de `ArrayList` para armazenamento e `Enums` para padronização.
- **Clean Code:** Métodos focados em responsabilidade única e nomes de variáveis significativos.
- **Arquitetura:** Estrutura baseada em Entidades (Models) e Gerenciamento (Services).

## 📂 Estrutura de Pastas
```bash
PROJETO-BIBLIOTECA/
├── src/
│   ├── Main.java                 # Ponto de entrada do sistema (Interface Console)
│   ├── GerenciadorBiblioteca.java # Regras de negócio e gestão das listas
│   ├── Livro.java                # Modelo da entidade Livro
│   ├── Usuario.java              # Modelo da entidade Usuário
│   ├── Emprestimo.java           # Lógica do fluxo de empréstimo/devolução
│   ├── Secao.java                # Enum com as categorias da biblioteca
│   └── StatusEmprestimo.java     # Enum para estados (Disponível, Emprestado)
├── .idea/                        # Configurações da IDE IntelliJ
├── .gitignore                    # Arquivos ignorados pelo Git (out, .class)
└── README.md                     # Documentação do projeto
```
## 💻 Como Rodar o Projeto
1. **Clone o repositório:**
   ```bash
   git clone https://github.com/AdansMaartiins/sistema-biblioteca.git
## 📈 Próximos Passos (Roadmap)
[ ] Implementar persistência de dados com PostgreSQL.

[ ] Criar interface gráfica ou API.

[ ] Adicionar sistema de multas por atraso.
