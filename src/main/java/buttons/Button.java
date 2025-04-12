package buttons;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * Interface Button representa o "Produto" (Product) no padrão Factory Method.
 * Define as operações que todos os botões concretos devem implementar.
 * As implementações concretas (ConcreteProducts) irão definir esse comportamento
 * de forma específica (ex: WindowsButton, HTMLButton).
 */

/**
 * Interface do Produto no padrão Factory Method.
 * Esta interface garante que todos os tipos de botões tenham
 * métodos consistentes como renderização e tratamento de cliques.
 * 
 * No Factory Method, essa interface é usada pela "fábrica" (Creator)
 * para criar objetos sem acoplar o código à classe concreta.
 * 
 * @author Beatriz Aparecida
 */
public interface Button {

    // Método que será implementado para exibir o botão na tela
    void render();

    // Método que será implementado para lidar com eventos de clique
    void onClick();
}
