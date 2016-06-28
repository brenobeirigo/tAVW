package model;

public class Livro {

    private long isbn;
    private String titulo;
    private int edicao;
    private int publicacao;
    private String descricao;

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(int publicacao) {
        this.publicacao = publicacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Livro(int isbn, String titulo, int edicao, int publicacao, String descricao) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.edicao = edicao;
        this.publicacao = publicacao;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "ISBN: " + this.isbn + "\nTítulo: " + this.titulo + "\nEdição: " + this.edicao + "\nPublicação: " + this.publicacao + "\nDescrição: " + this.descricao + "\n";
    }
}
