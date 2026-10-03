# Simulação de Votação Eletrónica

Este projeto é uma simulação de um sistema de votação eletrónica desenvolvido em Java.

## 🎯 Objetivo
O objetivo principal do projeto é aplicar conceitos fundamentais de Programação Orientada por Objetos (POO), como **encapsulamento**, **validação de regras de negócio** e **interação entre objetos**, sem a utilização de estruturas de armazenamento coletivo (como *arrays* ou listas).

## ⚙️ Funcionalidades
- **Registo de Candidatos:** Os candidatos começam com zero votos e os votos são incrementados individualmente através de métodos seguros.
- **Registo de Eleitores:** Controlo de participação para garantir que um eleitor vote apenas uma vez, preservando totalmente o sigilo do voto.
- **Controle da Urna:**
  - Validação se a urna está aberta para receber votos.
  - Verificação da validade de eleitores e candidatos.
  - Incremento seguro do total de votos e registo de participação do eleitor.
  - Encerramento da votação.
- **Apuração de Resultados:** Exibição do total de votos, quantidade de votos por candidato, identificação do vencedor ou ocorrência de empate.

## 🏗️ Estrutura do Projeto (Classes)
O projeto é composto por quatro classes principais:
1. `Candidato`: Gere os dados do candidato (número, nome e quantidade de votos) e o recebimento de votos.
2. `Eleitor`: Gere os dados do eleitor (título, nome) e controla o estado da sua participação na eleição.
3. `Urna`: Centraliza a lógica de votação, validando regras e relacionando eleitores e candidatos.
4. `Main`: Classe principal que simula a eleição instanciando três candidatos e cinco eleitores, realizando testes de votos válidos e inválidos, e exibindo o resultado final.

## 🚀 Como executar
1. Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado na sua máquina.
2. Faça o clone deste repositório ou descarregue os ficheiros fonte.
3. Compile os ficheiros Java abrindo o terminal na pasta do projeto e digitando:
   ```bash
   javac Main.java


## 📂 Estrutura do Repositório 
/votacao

├── Candidato.java       # Definição dos atributos e métodos do candidato

├── Eleitor.java         # Definição dos atributos e estado de votação do eleitor

├── Urna.java            # Lógica de validação, contagem e encerramento da votação

├── Main.java            # Ponto de entrada do programa e simulação de testes
