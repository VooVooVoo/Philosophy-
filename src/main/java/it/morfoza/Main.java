package it.morfoza;

import spark.Spark;

import java.util.Scanner;

/**
 * Created by Wojt on 2016-08-08.
 */



public class Main {
    public static void main(String[] args) {

//        Spark.staticFileLocation("/webfiles");
//
//        Spark.get("/calculator", (request, response) -> {
//            String philosopher = request.queryParams("Philosopher 1");
//            String rival = request.queryParams("Philosopher 2");
//            String operation = request.queryParams("operation");
//

//        Philosopher philosopher = request.queryParams("Philosopher 1");
//        Philosopher rival = request.queryParams("Philosopher 2");
//        String operation = request.queryParams("Type of attack");
//
//        Philosopher philosopher = (philosopher);
//        Philosopher rival = String.parseObject(rival);
//        int result =0;
//
//        if (operation.equals("philosophise")) {
//            result = WebPhilosophy.attack1(philosopher, rival);
//        }
//        ;
//        if (operation.equals("-")) {
//            result = WebPhilosophy.attack2(philosopher, rival);
//        }
//
//        if (operation.equals("*")) {
//            result = WebPhilosophy.attack3(philosopher, rival);
//        }
//
//        if (operation.equals("/")) {
//            result = WebPhilosophy.attack4(philosopher, rival);
//        }

            Philosopher aristo = new Aristotle();
            Philosopher plato = new Plato();

            System.out.println(aristo);


            plato.attack1(aristo);
            System.out.println(aristo);
            plato.attack2(aristo);
            System.out.println(aristo);
            plato.attack3(aristo);
            System.out.println(aristo);
            plato.attack4(aristo);

            System.out.println(aristo);


        }
    }


