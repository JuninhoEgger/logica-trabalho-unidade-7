package main;

import main.entities.Lista;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {

    public static void main(String[] args) {

        Lista lista = new Lista();
        lista.adicionar(1);
        lista.adicionar(2);
        lista.adicionar(3);
        lista.adicionar(4);
        lista.adicionar(5);
        lista.adicionar(6);
        lista.adicionar(7);
        lista.adicionar(8);
        lista.adicionar(9);
        lista.adicionar(10);

        showMessageDialog(null, lista.imprimirDoInicioAoFim(), "DO INÍCIO AO FIM", INFORMATION_MESSAGE);
        showMessageDialog(null, lista.imprimirDoFimAoInicio(), "DO FIM AO INÍCIO", INFORMATION_MESSAGE);
    }

}
