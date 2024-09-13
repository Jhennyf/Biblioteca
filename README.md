# Biblioteca de Livros - Sistema de Gerenciamento
O BibliotecaApp é um projeto desenvolvido em Java para a disciplina de Programação Orientada a Objetos. Ele simula um sistema de gerenciamento de livros em uma biblioteca. Neste README, vou explicar como a hierarquia de classes foi organizada.

## Hierarquia de Classes
1. **Pessoa**: A classe base que representa uma pessoa genérica. Ela contém atributos comuns a todos os tipos de pessoas, como nome, data de nascimento e endereço.
2. **Aluno**: Uma subclasse de Pessoa que representa um estudante. Além dos atributos herdados, pode incluir informações específicas, como matrícula e curso.
3. **Funcionario**: Outra subclasse de Pessoa para representar funcionários. Além dos atributos comuns, pode ter informações como cargo e salário.
4. **Professor**: Uma subclasse específica para professores. Além dos atributos herdados, pode conter informações como disciplina lecionada.

## Funcionalidades
Cadastro de livros.
Consulta por título, autor ou gênero.
Empréstimo e devolução.

## Telas do sistema 
1. **Cadastro de Pessoas**: Permite adicionar novas pessoas (alunos, funcionários, professores).
2. **Consulta de Pessoas**: Exibe informações sobre as pessoas cadastradas.
3. **Atualização de Dados**: Permite editar informações existentes.
4. **Exclusão de Pessoas**: Remove registros do sistema.
