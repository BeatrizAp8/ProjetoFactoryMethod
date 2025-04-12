/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Classe concreta que implementa a interface Button.
 * Esta classe representa o "Produto Concreto" (ConcreteProduct)
 * no padrão Factory Method.
 *
 * Ela fornece uma implementação específica do botão com aparência
 * e comportamento no estilo Windows (usando Swing).
 *
 * Esta classe é instanciada por uma classe "Criadora Concreta"
 * (ConcreteCreator), como por exemplo `WindowsDialog`.
 * 
 * @author Beatriz Aparecida
 */
public class WindowsButton implements Button {

    // Componentes gráficos usados para construir a interface do botão
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JButton button;

    /**
     * Método que renderiza o botão na tela com uma janela personalizada.
     * Este método é chamado pelo "Creator" (ex: WindowsDialog) para exibir
     * o botão criado.
     */
    public void render() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criação de um rótulo estilizado
        JLabel label = new JLabel("Hello World!");
        label.setOpaque(true);
        label.setBackground(new Color(235, 233, 126));
        label.setFont(new Font("Dialog", Font.BOLD, 44));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        // Layout e organização da janela
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(panel);
        panel.add(label);

        // Cria o botão com ação de clique
        onClick();
        panel.add(button);

        // Define tamanho da janela e torna-a visível
        frame.setSize(320, 200);
        frame.setVisible(true);
    }

    /**
     * Método que define a ação executada quando o botão é clicado.
     * Neste caso, fecha a janela e encerra o programa.
     */
    public void onClick() {
        button = new JButton("Exit");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                System.exit(0);
            }
        });
    }
}
