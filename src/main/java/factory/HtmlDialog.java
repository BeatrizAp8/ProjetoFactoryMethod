/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import buttons.Button;
import buttons.HtmlButton;

/**
 * Classe HtmlDialog representa um "Criador Concreto" (ConcreteCreator)
 * no padrão de projeto Factory Method.
 * 
 * Ela sobrescreve o método fábrica `createButton()` definido na
 * classe abstrata `Dialog` (o "Creator") e retorna uma instância
 * concreta de `HtmlButton`.
 * 
 * Isso permite que o sistema crie diferentes tipos de botões
 * (produtos) dependendo da subclasse de `Dialog` utilizada,
 * promovendo flexibilidade e baixo acoplamento.
 * 
 * @autor Beatriz Aparecida
 */
public class HtmlDialog extends Dialog {

    /**
     * Factory Method sobrescrito.
     * Aqui é retornado um produto concreto: HtmlButton.
     * 
     * O cliente (por exemplo, a classe Demo) não precisa saber
     * dessa implementação — ele usa apenas a abstração `Button`.
     */
    @Override
    public Button createButton() {
        return new HtmlButton(); // Retorna o produto concreto do tipo HTML
    }
}
