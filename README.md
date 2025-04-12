# Factory Method – Exemplo em Java
### Este projeto demonstra a implementação do padrão de projeto Factory Method em Java, com base no exemplo proposto pelo site Refactoring Guru. O objetivo é apresentar de forma didática como o padrão pode ser aplicado para delegar a criação de objetos a subclasses, promovendo flexibilidade e reutilização de código.

## Objetivo do Projeto
### Ilustrar o uso do Factory Method por meio de uma aplicação simples com diferentes tipos de janelas (WindowsDialog e HtmlDialog), mostrando como o cliente pode utilizar as classes criadas sem conhecer diretamente suas implementações concretas.

### Dialog.java: Classe abstrata que define o método createButton() como Factory Method.
### HtmlDialog.java: Implementação concreta da classe Dialog, que cria botões HTML.
### WindowsDialog.java: Outra implementação concreta da classe Dialog, que cria botões de sistema nativo.
### Main.java: Classe principal que demonstra o uso do Factory Method, decidindo dinamicamente qual tipo de Dialog instanciar.

## Padrão de Projeto Utilizado
### Factory Method é um padrão criacional que fornece uma interface para criar objetos em uma superclasse, permitindo que subclasses alterem o tipo de objetos que serão criados.

## Neste projeto:

### -A classe Dialog contém um método fábrica (createButton()) abstrato.

### -Subclasses (HtmlDialog e WindowsDialog) definem a lógica de criação dos objetos específicos.

### -O código cliente (Main) utiliza as instâncias através da superclasse, mantendo baixo acoplamento.

## Como Executar

### Clone o repositório:

```bash 
git clone https://github.com/DevAnaBeatriz/PRJ_FactoryMethod.git
```

### Importe o projeto em uma IDE Java de sua preferência (ex: IntelliJ, Eclipse, VS Code).

### Execute a classe Main.java.

## Referência:
### Refactoring Guru – Factory Method
