package it.morfoza;

/**
 * Created by Wojt on 2016-08-10.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Controller
public class PhilosophyController {


    private List<Philosopher> philosophers = new ArrayList<>();

    // Konstruktor, który zostanie wywołany gdy wywołana zostanie klasa PhilosophyController
    //Konstruktor doda mi do listy te obiekty
    public PhilosophyController() {
        philosophers.add(new Aristotle());
        philosophers.add(new Plato());
        philosophers.add(new Socrates());
    }

    @RequestMapping("/")
    public String selector() {
        return "philosophy";
    }


    @RequestMapping("/attack")
    public String fight(@RequestParam(value = "philosopher1") String philosopher1,
                        @RequestParam(value = "attack") String attack,
                        @RequestParam(value = "philosopher2") String philosopher2, Model model) {


        model.addAttribute("philosopher1", philosopher1);
        model.addAttribute("philosopher2", philosopher2);
        model.addAttribute("attack", attack);
        Philosopher philosopher;
        Philosopher rival;


        if (philosopher1.equals("Aristotle")) {
            philosopher = philosophers.get(0);
        } else if (philosopher1.equals("Plato")) {
            philosopher = philosophers.get(1);
        } else if (philosopher1.equals("Socrates")) {
            philosopher = philosophers.get(2);
        } else {
            throw new RuntimeException("No such philosopher: " + philosopher1);
        }
        model.addAttribute("philosopher", philosopher);

        if (philosopher2.equals("Aristotle")) {
            rival = philosophers.get(0);
        } else if (philosopher2.equals("Plato")) {
            rival = philosophers.get(1);
        } else if (philosopher2.equals("Socrates")) {
            rival = philosophers.get(2);
        } else if (philosopher2.equals(philosopher1)) {
            throw new RuntimeException("Cannot attack self!!!");
        } else {
            throw new RuntimeException("No such philosopher: " + philosopher2);
        }


        if (attack.equals("philosophise")) {
            philosopher.attack1(rival);

        } else if (attack.equals("rhetorical attack")) {
            philosopher.attack2(rival);
        } else if (attack.equals("ad personam")) {
            philosopher.attack3(rival);
        } else if (attack.equals("physical attack")) {
            philosopher.attack4(rival);
        } else {
            philosopher.attack5(rival);
        }
        model.addAttribute("rival", rival);
        return "afterAttack";
    }
}