package com.angelina;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String detalhes() {
        return "Livro{" +
                "titulo = '" + titulo + '\'' +
                "\n, autor = '" + autor + '\'' +
                "\n, totalPaginas = " + totalPaginas +
                "\n, paginaAtual = " + paginaAtual +
                "\n, aberto = " + aberto +
                "\n, leitor = '" + leitor.getNome() + '\'' +
                "\n, idade = '" + leitor.getIdade() + '\'' +
                "\n, sexo = '" + leitor.getSexo() + '\'' +
                '}';
    }


    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if(p > this.totalPaginas){
            this.paginaAtual = 0;
        }else {
            this.paginaAtual = p;
        }
    }

    @Override
    public void avancarPag() {
        this.paginaAtual++;
    }

    @Override
    public void voltarPag() {
        this.paginaAtual--;
    }
}
