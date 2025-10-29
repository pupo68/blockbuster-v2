# 🎬 Blockbuster V2 - Sistema Inteligente de Recomendação de Filmes

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Data Structures](https://img.shields.io/badge/Data_Structures-%23009688.svg?style=for-the-badge&logo=databricks&logoColor=white)]()
[![Algorithms](https://img.shields.io/badge/Algorithms-%23FF6B6B.svg?style=for-the-badge&logo=algolia&logoColor=white)]()

## 📋 Sobre o Projeto

Blockbuster V2 é um sistema avançado de gerenciamento e recomendação de filmes desenvolvido em Java puro, que implementa estruturas de dados clássicas e algoritmos de grafos para criar uma experiência personalizada de descoberta de filmes. O projeto demonstra a aplicação prática de conceitos fundamentais de Ciência da Computação em um contexto real e relevante.

## 🎯 Objetivo

Criar um sistema completo que simula uma plataforma de streaming moderna, combinando:
- **Algoritmos de grafos** para análise de distância entre filmes
- **Estruturas de dados avançadas** para otimização de performance
- **Sistema de recomendações inteligente** baseado em histórico do usuário
- **Gerenciamento de filas** para controle de espera

## ⭐ Diferenciais

### 🔍 Algoritmo de Dijkstra Aplicado
Implementação do algoritmo de Dijkstra para calcular a "distância" entre filmes, permitindo encontrar caminhos mais curtos em um grafo de similaridade.

### 🧠 Sistema de Recomendações
Engine de recomendações que analisa:
- Histórico de navegação do usuário
- Padrões de visualização
- Similaridade entre filmes
- Preferências personalizadas

### 📊 Estruturas de Dados Otimizadas
- **Filas (Queue)**: Gerenciamento eficiente de espera
- **Pilhas (Stack)**: Histórico de navegação com backtracking
- **Listas Encadeadas**: Armazenamento dinâmico de filmes
- **Grafos**: Representação de relações entre filmes

### 🎲 Algoritmos de Ordenação
Implementação de múltiplos algoritmos para ordenação de filmes por:
- Popularidade
- Avaliação
- Ano de lançamento
- Relevância personalizada

## 🛠️ Tecnologias e Conceitos

### Linguagem
- **Java** - Linguagem orientada a objetos, robusta e amplamente utilizada na indústria

### Estruturas de Dados Implementadas
- **Grafos** (Graph): Modelagem de relacionamentos entre filmes
- **Filas** (Queue): Sistema de espera e processamento sequencial
- **Pilhas** (Stack): Histórico de navegação
- **Listas** (Lists): Coleções dinâmicas de dados

### Algoritmos Aplicados
- **Dijkstra**: Caminho mais curto em grafos ponderados
- **Algoritmos de Ordenação**: Bubble Sort, Quick Sort, Merge Sort
- **Análise de Distância**: Cálculo de similaridade entre itens
- **Sistema de Recomendação**: Algoritmo colaborativo baseado em conteúdo

### Padrões de Projeto
- **POO** (Programação Orientada a Objetos)
- **Encapsulamento**: Classes bem definidas e isoladas
- **Modularização**: Separação clara de responsabilidades

## 📁 Estrutura do Projeto

```
blockbuster-v2/
│
├── Main.java                    # Ponto de entrada da aplicação
├── Filme.java                   # Modelo de dados para filmes
├── Usuario.java                 # Modelo de dados para usuários
├── FilaDeEspera.java           # Implementação de fila para gerenciamento
├── HistoricoNavegacao.java     # Pilha para histórico de navegação
├── AlgoritmoDijkstra.java      # Implementação do algoritmo de Dijkstra
├── AnaliseDistancia.java       # Análise de similaridade entre filmes
├── RecomendacoesFilmes.java    # Engine de recomendações
├── Ordenacao.java              # Algoritmos de ordenação
├── Motivo.java                 # Enum para motivos de recomendação
└── README.md                   # Documentação do projeto
```

## 🚀 Funcionalidades

### 1. Gerenciamento de Filmes
- Cadastro e armazenamento de filmes
- Atributos: título, gênero, ano, avaliação, diretor
- Busca e filtragem avançada

### 2. Sistema de Filas
- Fila de espera para filmes indisponíveis
- Processamento FIFO (First In, First Out)
- Notificações de disponibilidade

### 3. Histórico de Navegação
- Registro de filmes visualizados
- Backtracking com estrutura de pilha
- Análise de padrões de visualização

### 4. Algoritmo de Dijkstra
- Cálculo de distância entre filmes em um grafo
- Encontra o caminho mais curto de similaridade
- Otimização de recomendações

### 5. Análise de Distância
- Medição de similaridade entre filmes
- Métricas baseadas em:
  - Gênero
  - Ano de lançamento
  - Diretor
  - Avaliações

### 6. Sistema de Recomendações
- Recomendações personalizadas por usuário
- Análise de histórico de visualização
- Filtragem colaborativa
- Explicação do motivo da recomendação

### 7. Ordenação Inteligente
- Múltiplos critérios de ordenação
- Algoritmos eficientes implementados do zero
- Comparação de performance

## 💻 Como Executar

### Pré-requisitos
- Java JDK 8 ou superior
- IDE (Eclipse, IntelliJ IDEA, VSCode) ou terminal

### Compilação e Execução

```bash
# Clone o repositório
git clone https://github.com/pupo68/blockbuster-v2.git

# Entre no diretório
cd blockbuster-v2

# Compile os arquivos Java
javac *.java

# Execute o programa principal
java Main
```

### Usando uma IDE

1. Abra o projeto na sua IDE favorita
2. Configure o JDK
3. Execute a classe `Main.java`

## 📚 Conceitos de Ciência da Computação Aplicados

### Teoria dos Grafos
- **Representação**: Filmes como vértices, similaridade como arestas
- **Peso das Arestas**: Grau de similaridade entre filmes
- **Aplicação Prática**: Sistema de recomendações baseado em proximidade

### Complexidade Algorítmica
- **Dijkstra**: O(V²) ou O((V+E) log V) com heap
- **Ordenação**: O(n log n) para algoritmos eficientes
- **Busca**: O(1) para acesso direto, O(n) para busca linear

### Estruturas de Dados
- **Fila**: FIFO, O(1) para enqueue/dequeue
- **Pilha**: LIFO, O(1) para push/pop
- **Lista**: O(1) para inserção, O(n) para busca

## 🎓 Aplicações em Portfólio

Este projeto demonstra competências essenciais para:

### Desenvolvimento de Software
- ✅ Programação Orientada a Objetos
- ✅ Implementação de estruturas de dados do zero
- ✅ Aplicação de algoritmos clássicos
- ✅ Resolução de problemas complexos

### Análise e Design
- ✅ Modelagem de dados
- ✅ Arquitetura de software
- ✅ Otimização de performance
- ✅ Padrões de projeto

### Competências Técnicas
- ✅ Java avançado
- ✅ Algoritmos e estruturas de dados
- ✅ Pensamento computacional
- ✅ Código limpo e documentado

## 🔧 Possíveis Melhorias Futuras

- [ ] Interface gráfica (GUI) com JavaFX ou Swing
- [ ] Persistência de dados com banco de dados (MySQL, PostgreSQL)
- [ ] API REST para integração com frontend
- [ ] Machine Learning para recomendações mais precisas
- [ ] Sistema de avaliações e reviews
- [ ] Autenticação e autorização de usuários
- [ ] Integração com APIs de filmes (TMDB, OMDB)
- [ ] Testes unitários com JUnit
- [ ] Deploy em cloud (AWS, Azure, GCP)

## 📊 Métricas do Projeto

- **Linhas de Código**: ~1000+
- **Classes**: 11
- **Algoritmos Implementados**: 5+
- **Estruturas de Dados**: 4+
- **Complexidade**: Intermediário a Avançado

## 🤝 Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para:

1. Fazer um fork do projeto
2. Criar uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abrir um Pull Request

## 📝 Licença

Este projeto é de código aberto e está disponível para fins educacionais.

## 👤 Autor

**pupo68**

- GitHub: [@pupo68](https://github.com/pupo68)
- Projeto: [blockbuster-v2](https://github.com/pupo68/blockbuster-v2)

## 🌟 Agradecimentos

- Comunidade Java
- Recursos educacionais de Estruturas de Dados e Algoritmos
- Inspiração em plataformas de streaming modernas

---

<div align="center">

**⭐ Se este projeto foi útil, considere dar uma estrela!**

*Desenvolvido com ☕ e Java*

</div>
