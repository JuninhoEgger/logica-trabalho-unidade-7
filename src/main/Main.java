package main;

import main.entities.Lista;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {

    public static void main(String[] args) {

        Lista lista = new Lista();

        for (int i = 1; i < 11; i++) {
            lista.adicionar(i);
        }

        showMessageDialog(null, lista.imprimirDoInicioAoFim(), "DO INÍCIO AO FIM", INFORMATION_MESSAGE);
        showMessageDialog(null, lista.imprimirDoFimAoInicio(), "DO FIM AO INÍCIO", INFORMATION_MESSAGE);
    }

}
