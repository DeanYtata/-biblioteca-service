package com.uniminuto.biblioteca.dto;

public class LibroResponseDto {

    private Long id;
    private String titulo;
    private String autor;
    private String isbn;

    public LibroResponseDto(Long id, String titulo, String autor, String isbn) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }
}