package com.teoriadosgrafos.graph.core;

public class Vertices {
    private String rotulo;
    private int grau;

    public Vertices(String rotulo) throws Exception {

        // Um vértice não pode ter um rótulo em branco e nem nulo
        boolean isRotuloNullOrBlank = rotulo == null || rotulo != null && "".equals(rotulo.trim());

        if (isRotuloNullOrBlank) {
            throw new Exception("Não é permitido a inclusão de vértices com rótulo em branco");
        }

        this.rotulo = rotulo;

    }

    public String getRotulo() {
        return rotulo;
    }

}
