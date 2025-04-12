/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import buttons.Button;
import buttons.WindowsButton;

/**
 * Classe WindowsDialog representa um "Criador Concreto" (ConcreteCreator)
 * no padrão de projeto Factory Method.
 * 
 * Ela herda da classe abstrata `Dialog` (o "Creator") e implementa o
 * método fábrica `createButton()` para retornar uma instância de `WindowsButton`,
 * que é um "Produto Concreto" (ConcreteProduct).
 * 
 * Esse padrão permite a criação de objetos de forma flexível e desacoplada,
 * delegando a instância do produto para as subclasses.
 * 
 * @autor Beatriz Aparecida
 */
public class WindowsDialog extends Dialog {

    /**
     * Implementação do Factory Method.
     * 
     * Retorna um botão específico para a plataforma Windows.
     * O cliente (por exemplo, a classe `Demo`) utilizará esse método
     * sem precisar conhecer diretamente a classe `WindowsButton`.
     */
    @Override
    public Button createButton() {
        return new WindowsButton(); // Produto concreto sendo retornado
    }
}
