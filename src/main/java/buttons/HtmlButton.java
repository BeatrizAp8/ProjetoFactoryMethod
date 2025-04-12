/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buttons;

/**
 * Classe HtmlButton representa um "Produto Concreto" (ConcreteProduct)
 * no padrão de projeto Factory Method.
 * 
 * Ela implementa a interface `Button`, que é o "Produto" abstrato,
 * e fornece uma versão específica do botão que simula um botão HTML.
 * 
 * Essa classe será instanciada por um "Criador Concreto" (ConcreteCreator),
 * como `HtmlDialog`, que decide qual tipo de botão criar em tempo de execução.
 * 
 * @autor Beatriz Aparecida
 */
public class HtmlButton implements Button {

    /**
     * Implementação do método render().
     * Simula a renderização de um botão HTML.
     * O método chama `onClick()` para associar o comportamento ao clique.
     */
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick(); // Simula o registro do evento de clique
    }

    /**
     * Implementação do comportamento ao clique do botão.
     * Simula a resposta de um botão HTML ao ser clicado.
     */
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
