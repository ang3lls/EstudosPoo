package com.angelina;

public class ProjetoLeitura {
    public static void main(String[] args){
        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[4];

        p[0] = new Pessoa("Ana", 23, "fem");
        p[1] = new Pessoa("Ricardo", 19, "masc");
        p[2] = new Pessoa("Laura", 20, "fem");

        l[0] = new Livro("O lado bom da vida", "Matthew Quick",  164, p[2]);
        l[1] = new Livro("Mindhunter",  "John Douglas", 250, p[1]);
        l[2] = new Livro("Contos de suspense e terro", "Edgar Poe", 158, p[0]);
        l[3] = new Livro("Extraordinário", "R.J. Palacio", 85, p[0]);

        System.out.println(l[0].detalhes());

        l[1].abrir();
        l[1].folhear(110);
        l[1].avancarPag();
        System.out.println(l[1].detalhes());

        l[2].voltarPag();
        System.out.println(l[2].detalhes());

        l[3].fechar();
        System.out.println(l[3].detalhes());

        p[0].fazerAniversario();
        System.out.println(p[0].getIdade());

    }
}
