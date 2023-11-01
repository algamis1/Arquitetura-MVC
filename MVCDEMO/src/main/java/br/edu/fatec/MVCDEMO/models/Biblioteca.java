package br.edu.fatec.mvcDemo.models;

public class Biblioteca {

    private String livro;
    private String classificacao;

    private double preco;

    private String editora;

    public Aluno(String nome, String classificacao, double preco, String editora) {
        this.setLivro(getLivro());
        this.setClassificacao(classificacao);
        this.setPreco(preco);
        this.setEditora(editora);
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}