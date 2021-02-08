package com.angelina;

import com.angelina.ave.Arara;
import com.angelina.mamifero.Cachorro;
import com.angelina.peixe.Goldfish;
import com.angelina.reptil.Cobra;
import com.angelina.reptil.Tartaruga;

public class Main {
    public static void main(String[] args) {

        Arara a = new Arara(4.6f, 3, 2);
        Cachorro c = new Cachorro(15.00f, 3, 4);
        Goldfish g = new Goldfish(0.4f, 4, 0);
        Cobra cb = new Cobra(3.9f, 3, 0);
        Tartaruga t = new Tartaruga(10, 50, 4);

        a.locomover();
        a.alimentar();
        a.emitirSom();

        c.enterrarOssso();
        c.emitirSom();

        t.locomover();

    }
}
