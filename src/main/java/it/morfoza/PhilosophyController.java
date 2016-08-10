package it.morfoza;

/**
 * Created by Wojt on 2016-08-10.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PhilosophyController {

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
            philosopher = new Aristotle();
        } else if (philosopher1.equals("Plato")) {
            philosopher = new Plato();
        } else if (philosopher1.equals("Socrates")) {
            philosopher = new Socrates();
        } else {
            throw new RuntimeException("No such philosopher: " + philosopher1);
        }
        model.addAttribute("philosopher", philosopher);

        if (philosopher2.equals("Aristotle")) {
            rival = new Aristotle();
        } else if (philosopher2.equals("Plato")) {
            rival = new Plato();
        } else if (philosopher2.equals("Socrates")) {
            rival = new Socrates();
        } else {
            throw new RuntimeException("No such philosopher: " + philosopher2);
        }


        if (attack.equals("philosophise")) {
            philosopher.attack1(rival);

        } else if (attack.equals("rhetorical attack")) {
            philosopher.attack2(rival);
        } else if (attack.equals("ad personam")) {
            philosopher.attack3(rival);
        } else {
            philosopher.attack4(rival);
        }
        model.addAttribute("rival", rival);
        return "afterAttack";
    }
}