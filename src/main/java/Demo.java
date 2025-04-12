
import factory.Dialog;
import factory.HtmlDialog;
import factory.WindowsDialog;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Classe Demo atua como o "Cliente" no padrão Factory Method.
 * 
 * Ela contém a lógica de configuração e execução da aplicação.
 * O cliente utiliza o método `renderWindow()` da classe Dialog
 * sem conhecer a implementação concreta (ex: WindowsDialog ou HtmlDialog).
 * 
 * Isso demonstra como o padrão Factory Method promove o desacoplamento
 * entre o código cliente e as classes concretas de produto.
 * 
 * A decisão sobre qual implementação usar é feita em tempo de execução,
 * com base no sistema operacional.
 * 
 * @autor Beatriz Aparecida
 */
public class Demo {

    // Referência ao "Criador" abstrato
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();       // Define qual tipo de diálogo usar (Windows ou Web)
        runBusinessLogic(); // Executa a lógica usando o criador configurado
    }

    /**
     * Método de configuração que seleciona dinamicamente qual
     * implementação concreta do Creator (ConcreteCreator) será usada.
     * 
     * O Factory Method será chamado dentro dessa implementação concreta.
     */
    static void configure() {
        // Verifica o sistema operacional atual para decidir o tipo de diálogo
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog(); // Criador concreto para botões estilo Windows
        } else {
            dialog = new HtmlDialog(); // Criador concreto para botões estilo HTML/Web
        }
    }

    /**
     * Método que representa a lógica principal do sistema.
     * Ele utiliza o método do criador abstrato, que internamente
     * usará o Factory Method para criar o botão apropriado.
     */
    static void runBusinessLogic() {
        dialog.renderWindow(); // Usa o botão sem saber qual é a classe concreta
    }
}
