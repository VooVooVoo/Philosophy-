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


        philosopher = getPhilosopher(philosopher1);
        model.addAttribute("philosopher", philosopher);

        if (philosopher2.equals(philosopher1)) {
            throw new RuntimeException("Cannot attack self!!!");
        }

        rival = getPhilosopher(philosopher2);
        model.addAttribute("rival", rival);


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

        if (philosopher1.equals("Aristotle") && attack.equals("philosophise") && rival.equals("Plato")) {

            return "aristoAttacksPlato";

        }
        if (philosopher1.equals("Aristotle") && attack.equals("philosophise") && rival.equals("Socrates")) {

            return "socratesAttacksAristotle";

        }
        if (philosopher1.equals("Plato") && attack.equals("philosophise") && rival.equals("Aristotle")) {

            return "aristoAttacksPlato";

        }
        if (philosopher1.equals("Plato") && attack.equals("philosophise") && rival.equals("Socrates")) {

            return "socratesAttacksPlato";

        }
        if (philosopher1.equals("Socrates") && attack.equals("philosophise") && rival.equals("Aristotle")) {

            return "socratesAttacksAristotle";

        }
        if (philosopher1.equals("Socrates") && attack.equals("philosophise") && rival.equals("Plato")) {

            return "socratesAttacksPlato";

        }
        if (philosopher1.equals("Aristotle") && attack.equals("rhetorical attack") && rival.equals("Plato")) {

            return "aristoAttacksPlato";

        }
        if (philosopher1.equals("Aristotle") && attack.equals("rhetorical attack") && rival.equals("Socrates")) {

            return "socratesAttacksAristotle";

        }
        if (philosopher1.equals("Plato") && attack.equals("rhetorical attack") && rival.equals("Aristotle")) {

            return "aristoAttacksPlato";

        }
        if (philosopher1.equals("Plato") && attack.equals("rhetorical attack") && rival.equals("Socrates")) {

            return "socratesAttacksPlato";

        }
        if (philosopher1.equals("Socrates") && attack.equals("rhetorical attack") && rival.equals("Aristotle")) {

            return "socratesAttacksAristotle";

        }
        if (philosopher1.equals("Socrates") && attack.equals("rhetorical attack") && rival.equals("Plato")) {

            return "socratesAttacksPlato";

        }if (philosopher1.equals("Aristotle") && attack.equals("ad personam") && rival.equals("Plato")) {

            return "aristoAttacksPlato";

        }
        if (philosopher1.equals("Aristotle") && attack.equals("ad personam") && rival.equals("Socrates")) {

            return "socratesAttacksAristotle";

        }
        if (philosopher1.equals("Plato") && attack.equals("ad personam") && rival.equals("Aristotle")) {

            return "aristoAttacksPlato";

        }
        if (philosopher1.equals("Plato") && attack.equals("ad personam") && rival.equals("Socrates")) {

            return "socratesAttacksPlato";

        }
        if (philosopher1.equals("Socrates") && attack.equals("ad personam") && rival.equals("Aristotle")) {

            return "socratesAttacksAristotle";

        }
        if (philosopher1.equals("Socrates") && attack.equals("ad personam") && rival.equals("Plato")) {

            return "socratesAttacksPlato";

        }if (philosopher1.equals("Aristotle") && attack.equals("physical attack") && rival.equals("Plato")) {

            return "aristoAttacksPlato";

        }
        if (philosopher1.equals("Aristotle") && attack.equals("physical attack") && rival.equals("Socrates")) {

            return "socratesAttacksAristotle";

        }
        if (philosopher1.equals("Plato") && attack.equals("physical attack") && rival.equals("Aristotle")) {

            return "aristoAttacksPlato";

        }
        if (philosopher1.equals("Plato") && attack.equals("physical attack") && rival.equals("Socrates")) {

            return "socratesAttacksPlato";

        }
        if (philosopher1.equals("Socrates") && attack.equals("physical attack") && rival.equals("Aristotle")) {

            return "socratesAttacksAristotle";

        }
        if (philosopher1.equals("Socrates") && attack.equals("physical attack") && rival.equals("Plato")) {

            return "socratesAttacksPlato";

        }if (philosopher1.equals("Aristotle") && attack.equals("special") && rival.equals("Plato")) {

            return "aristoAttacksPlato";

        }
        if (philosopher1.equals("Aristotle") && attack.equals("special") && rival.equals("Socrates")) {

            return "socratesAttacksAristotle";

        }
        if (philosopher1.equals("Plato") && attack.equals("special") && rival.equals("Aristotle")) {

            return "aristoAttacksPlato";

        }
        if (philosopher1.equals("Plato") && attack.equals("special") && rival.equals("Socrates")) {

            return "socratesAttacksPlato";

        }
        if (philosopher1.equals("Socrates") && attack.equals("physical attack") && rival.equals("Aristotle")) {

            return "socratesAttacksAristotle";

        }
        if (philosopher1.equals("Socrates") && attack.equals("physical attack") && rival.equals("Plato")) {

            return "socratesAttacksPlato";

        }
        return "afterAttack";
    }


    private Philosopher getPhilosopher(@RequestParam(value = "philosopher1") String philosopher1) {
        Philosopher philosopher;
        if (philosopher1.equals("Aristotle")) {
            philosopher = philosophers.get(0);
        } else if (philosopher1.equals("Plato")) {
            philosopher = philosophers.get(1);
        } else if (philosopher1.equals("Socrates")) {
            philosopher = philosophers.get(2);
        } else {
            throw new RuntimeException("No such philosopher: " + philosopher1);
        }
        return philosopher;
    }

}