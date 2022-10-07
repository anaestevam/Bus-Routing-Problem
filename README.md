# Algoritmo NP-Díficil Roteamento de Ônibus para Evacuação em Acidentes Industriais e Desastres Naturais

Para o algoritmo heurítico, o método do vizinho mais próximo é usado para produzir uma solução inicial.
## Compilação e execução
Linux(terminal)
1. `$ cd entities/java/main/src/`
2. `$ javac Main.java `
3. `$ java Main`

Eclipse/Intellij
```
1. `entities/java/main/src/`
2. ` Basta executar o Main.java `
```
## Alunas:
- Ana Luisa
- Tarsila Samille



# QAP Algorithms
This repo contains a bunch of implementations of algorithms, either exact or using metaheuristics, for solving the [Quadratic Assignment Problem (QAP)](https://en.wikipedia.org/wiki/Quadratic_assignment_problem). It was developed as the main assignment of the DIM0605 - PROJETO E ANÁLISE DE ALGORITMOS (algorithm projecting and analysis).

# Exact Algorithm
- Branch-and-Bound

# Metaheuristics
- Tabu Search
- Genetic Algorithm
- Hybrid Algorithm

## Compilation
To compile the code, execute the following command:
```
make
```

## Usage
To run the project, execute the following command, where `INSTANCES` is the path to a file containing addresses of instances of the QAP:
```
./exe.out INSTANCES
