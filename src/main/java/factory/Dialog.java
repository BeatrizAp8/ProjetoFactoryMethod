/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import buttons.Button;

/**
 * Classe abstrata que representa o "Criador" (Creator) no padrão Factory Method.
 * 
 * Ela declara o método fábrica abstrato `createButton()`, que será implementado
 * pelas subclasses para decidir qual tipo concreto de botão (produto) será criado.
 * 
 * Além disso, fornece um método `renderWindow()` que utiliza o produto criado
 * pelo Factory Method. Esse método demonstra o uso do botão sem saber sua classe exata.
 * 
 * Isso permite que o código seja facilmente estendido para diferentes interfaces
 * (Windows, Web, Mobile, etc.) sem modificar a classe base.
 * 
 * @author Beatriz Aparecida
 */
public abstract class Dialog {

    /**
     * Método que usa o produto criado pelo Factory Method.
     * 
     * Esse método não conhece a classe concreta do botão.
     * Ele apenas usa a interface Button, promovendo baixo acoplamento.
     */
    public void renderWindow() {
        // Chama o Factory Method para criar o botão
        Button okButton = createButton();
        
        // Usa o botão criado
        okButton.render();
    }

    /**
     * Factory Method: este método será implementado pelas subclasses
     * para retornar diferentes tipos de botões (ex: WindowsButton, HTMLButton).
     * 
     * Ele define um "ponto de extensão" para as subclasses decidirem qual
     * produto concreto instanciar.
     */
    public abstract Button createButton();
}
