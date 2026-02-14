# Projeto: buscaCep

Projeto em Java para consulta de CEP utilizando a API pública ViaCEP.  
O sistema permite que o usuário digite um CEP no terminal e receba os dados do endereço correspondente, além de gerar um arquivo JSON com as informações retornadas.

---

## Funcionalidades

- Consulta de CEP via API pública (ViaCEP)
- Exibição do endereço no terminal
- Geração automática de arquivo JSON com os dados do endereço
- Tratamento de erros para CEP inválido
- Encerramento controlado pelo usuário

---

## Tecnologias Utilizadas

- Java
- API ViaCEP
- Biblioteca Gson (para conversão JSON)
- IntelliJ IDEA
- Git e GitHub

---

## Estrutura do Projeto
```
buscaCep/
│
├── src/
│ ├── Main.java
│ ├── ConsultaCep.java
│ ├── Endereco.java
│ └── GeradorDeArquivo.java
│
└── README.md
```

---

## ▶ Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/GabrielPree/buscaCep.git
```
2. Abra o projeto na sua IDE (IntelliJ recomendado)
3. Execute a classe Main
4. Digite um CEP válido (ex: 01001000)

---

## Exemplo de Uso
```
Bem vindo ao sistema de consulta de CEP
Digite um CEP para buscar o endereço correspondente ou digite '0' para encerrar o programa.

01001000
```
#### Saída esperada:
```
Logradouro: Praça da Sé
Bairro: Sé
Cidade: São Paulo
UF: SP
```

Um arquivo JSON será gerado automaticamente com os dados retornados.

---
## Aprendizados

#### Este projeto foi desenvolvido para praticar:

* Consumo de API REST

* Manipulação de JSON com Gson

* Tratamento de exceções

* Organização de código em múltiplas classes

* Versionamento com Git e GitHub
---
## Autor
#### Gabriel Preé
Estudante de Análise e Desenvolvimento de Sistemas

Projeto desenvolvido para prática de consumo de API e manipulação de dados em Java.

---

##  Licença

Este projeto é de código aberto e pode ser usado livremente para fins educacionais.

#### Contribuições e melhorias são bem-vindas!
