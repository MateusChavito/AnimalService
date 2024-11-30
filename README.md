# 🐾 Animal Service - Gerenciamento de Animais

Este é um sistema de gerenciamento de animais em um abrigo. O projeto permite o cadastro, consulta e gerenciamento de informações sobre cachorros e gatos, incluindo dados como condições de chegada, adoção, e outros detalhes.

## 🚀 Funcionalidades
- **Cadastro de Animais**: Adicione novos animais (cachorros e gatos) ao sistema.
- **Listagem Geral**: Consulte todos os animais cadastrados no sistema.
- **Animais Não Adotados**: Filtre animais que ainda estão disponíveis para adoção.
- **Animais Adotados**: Filtre animais que já foram adotados.

## 💻 Tecnologias Utilizadas
- **Java**: Linguagem de programação principal.
- **Spring Boot**: Framework para criação de APIs RESTful.
- **Jakarta Persistence (JPA)**: Mapeamento objeto-relacional.
- **H2 Database**: Banco de dados em memória para testes.
- **Lombok**: Simplificação do código Java.

## 📦 Instalação
1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/animal-service.git
   
## 🔧 Configurações

O projeto utiliza o banco de dados H2 em memória. Para acessar o console H2:

- **Acesse**: [http://localhost:8081/h2-console](http://localhost:8081/h2-console)
- **Credenciais**:
  - **JDBC URL**: `jdbc:h2:mem:db-animais`
  - **User**: `sa`
  - **Password**: `password`

## 🎮 Como Usar

1. Inicie o servidor na porta padrão `8081`.
2. Use ferramentas como **Postman** ou **cURL** para interagir com as rotas da API.
3. **Rotas principais**:
   - `GET /animais`: Lista todos os animais.
   - `POST /animais`: Adiciona um novo animal (enviar JSON no corpo da requisição).
   - `GET /animais/not-adopted/Cachorro OU Gato`: Lista animais não adotados.
   - `GET /animais/adopted/Cachorro OU Gato`: Lista animais adotados.
   - (Modificar o final para Cachorro ou Gato para aplicar a filtragem, ex: GET /animais/adopted/Cachorro ou GET /animais/adopted/Gato

### Exemplo de JSON para Cadastro

```json
{
  "nomeProvisorio": "Miau",
  "idadeEstimada": 2,
  "raca": "Siamês",
  "dataEntrada": "2024-11-01",
  "condicoesChegada": "Saudável",
  "nomeRecebedor": "João",
  "porte": "Pequeno"
}

