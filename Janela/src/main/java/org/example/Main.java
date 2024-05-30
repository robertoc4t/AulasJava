package org.example;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JLabel label = new JLabel("I'm NIGGA", JLabel.CENTER);
        label.setFont(new Font("Impacat", Font.BOLD, 30));

        JFrame janela = new JFrame();
        janela.setVisible(true);
        janela.setSize(2000, 2000);
        janela.getContentPane().setBackground(new Color(20,20,20));
        janela.add(label);

        JButton botao = new JButton(">>>");
        janela.setLayout(null);
        botao.setBounds(20,150, 250,30);
        botao.setBackground(new Color(20,20,20));
        janela.add(botao);

    }
}