package com.teoriadosgrafos.graph.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

    private List<Vertices> vertices = new ArrayList<>();
    private Map<String, Integer> rotulosEmIndice = new HashMap<>();
    private int qtdMaximaVertices;
    private int qtdAtualVertices = 0;
    private boolean isQtdMaximaDefinida;

    // Caso não passado nenhum parâmetro para o construtor da classe
    public Graph() {
        qtdMaximaVertices = 10;
    }

    // Caso escolha a quantidade de vércies para o grafo
    public Graph(int qtdVertices) {
        if (qtdVertices <= 0) {
            throw new IllegalArgumentException("A quantidade mínima de vértices deve ser maior que 0");
        }
        qtdMaximaVertices = qtdVertices;
        isQtdMaximaDefinida = true;
    }

    public void adicionarVertices(String rotulo) throws Exception {
         if (qtdAtualVertices <= qtdMaximaVertices - 1) {

            Vertices novoVertice = new Vertices(rotulo);
            this.vertices.add(novoVertice);
            System.out.println(qtdAtualVertices);
            System.out.println(qtdMaximaVertices);
            this.rotulosEmIndice.put(rotulo, qtdAtualVertices);
            qtdAtualVertices++;

        } else {
            throw new Exception("A quantidade de vértices permitida (" + qtdMaximaVertices + ") foi execida");
        }
    }

    public List<Vertices> getVertices() {
        return this.vertices;
    }

}
