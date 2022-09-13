package main.entities;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    private List<Node> nodes = new ArrayList<>();

    public Lista() {
    }

    public Lista(List<Node> nodes) {
        this.nodes = nodes;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void adicionar(int value) {
        this.getNodes().add(new Node(value));
    }

    public String imprimirDoInicioAoFim() {
        StringBuilder resposta = new StringBuilder();
        this.getNodes().forEach(node -> resposta.append(node).append("\n"));
        return resposta.toString();
    }

    public String imprimirDoFimAoInicio() {
        StringBuilder resposta = new StringBuilder();
        for (int i = this.getNodes().size(); i > 0; i--) resposta.append(this.getNodes().get(i - 1)).append("\n");
        return resposta.toString();
    }
}
