package com.fabricio.minhapp.modelo;

public class OlaMundo {

    // 1. Campos (Atributos)
    private final long id;
    private final String conteudo; // ou 'content', dependendo do nome que você usou

    // 2. O Construtor NECESSÁRIO (para receber long e String)
    public OlaMundo(long id, String conteudo) {
        this.id = id;
        this.conteudo = conteudo;
    }

    // 3. Métodos Getters (para o Spring Boot)
    public long getId() {
        return id;
    }

    public String getConteudo() {
        return conteudo;
    }
}
