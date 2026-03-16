# Cofrinho em Java

Projeto do curso de **Engenharia de Software da UNINTER**.

O sistema simula um cofrinho que permite armazenar moedas em diferentes moedas (`Real`, `Dólar` e `Euro`) e calcular o total convertido para Reais.

## Funcionalidades

- Adicionar moeda ao cofrinho
- Remover moeda do cofrinho
- Listar as moedas que estão guardadas no cofrinho
- Calcular total de moedas para um valor convertido para Real
- Estrutura orientada a objetos com herança e polimorfismo

## Estrutura do Projeto

```text
src/
  cofrinho/
    Main.java
    Cofrinho.java
    Moeda.java
    Real.java
    Dolar.java
    Euro.java
```

## Conceitos de POO aplicados

- **Abstração**: classe abstrata `Moeda`
- **Herança**: `Real`, `Dolar` e `Euro` herdam de `Moeda`
- **Polimorfismo**: implementação dos métodos `info()` e `converter()` em cada moeda
- **Encapsulamento**: organização das regras de negócio na classe `Cofrinho`

## Como executar

### Pré-requisitos

- Java JDK 8+ instalado
- Terminal (PowerShell, CMD ou bash)

### Compilar

```bash
javac -d bin src/cofrinho/*.java
```

### Executar

```bash
java -cp bin cofrinho.Main
```

## Exemplo de uso

```text
Menu do Cofrinho
1 - Adicionar moeda
2 - Remover moeda
3 - Listar moedas
4 - Converter para Real
0 - Sair
```

## Regras de conversão usadas

- `Real`: valor original
- `Dólar`: valor * 5.37
- `Euro`: valor * 6.15