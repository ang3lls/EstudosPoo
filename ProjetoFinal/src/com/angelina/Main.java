package com.angelina;

public class Main {
    public static void main(String[] args){
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 POO");
        v[1] = new Video("Aula 12 PHP");
        v[2] = new Video("Aula 4 Java");

        Inscrito i[] = new Inscrito[2];
        i[0] = new Inscrito("Ana", 13, "F", "aninh4");
        i[1] = new Inscrito("João", 24,"M", "JJ20X");

        Visualizacao vis[] = new Visualizacao[2];
        vis[0] = new Visualizacao(i[0], v[1]);
        vis[1] = new Visualizacao(i[1], v[2]);

        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());

        System.out.println(i.toString());

        vis[0].avaliar(68.9f);
        System.out.println(vis[0].toString());

        vis[1].avaliar(10);
        v[2].like();
        System.out.println(vis[1].toString());

    }
}
