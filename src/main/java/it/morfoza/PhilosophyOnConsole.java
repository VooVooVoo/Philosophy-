package it.morfoza;

import spark.Spark;

import java.util.Scanner;

/**
 * Created by Wojt on 2016-08-08.
 */



public class PhilosophyOnConsole {
    public static void main(String[] args) {

            Philosopher aristo = new Aristotle();
            Philosopher plato = new Plato();
            Philosopher socrates = new Socrates();
        Aristotle aristo2 = new Aristotle();

            System.out.println(aristo);


            plato.attack1(aristo);
            System.out.println(aristo);
            plato.attack2(aristo);
            System.out.println(aristo);
            plato.attack3(aristo);
            System.out.println(aristo);
            plato.attack4(aristo);

//            System.out.println(aristo);
//        aristo.attack1(plato);
//        System.out.println(plato);
//        aristo.attack2(plato);
//        System.out.println(plato);
//        aristo.attack3(plato);
//        System.out.println(plato);
//        aristo.attack4(plato);
//        System.out.println(plato);
//        aristo2.attack5(plato);
//        System.out.println(plato);



        }
    }


