package br.com.caelum.banco;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by peter on 24/03/2017.
 */
public class TestaArrayList {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();

        l.add("Cristian Luiz");
        l.add("Gustavo");
        l.add("Amanda");
        l.add("Amelia");
        l.add("Amora");
        l.add("Thiago");

        System.out.println(l);

        Collections.sort(l);

        System.out.println(l);

        Collections.reverse(l);

        System.out.println(l);

    }
}
