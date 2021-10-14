package com.teoriadosgrafos.aplication;

import com.teoriadosgrafos.graph.core.Graph;
import com.teoriadosgrafos.graph.core.Vertices;

public class Main {
    public static void main(String[] args) throws Exception {
        Graph grafo = new Graph();

        grafo.adicionarVertices("RJ");
        grafo.adicionarVertices("SP");
        grafo.adicionarVertices("BH");
        grafo.adicionarVertices("PT");
        grafo.adicionarVertices("OS");
        grafo.adicionarVertices("SV");
        grafo.adicionarVertices("CR");
        grafo.adicionarVertices("PA");

        System.out.println("O grafo possui os seguintes vértices:\n\n");

        for (Vertices vertice : grafo.getVertices()) {
            System.out.println("Vertice\t" + vertice.getRotulo());

        }

    }

}
