package it.morfoza;

/**
 * Created by Wojt on 2016-08-10.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PhilosophyController {

    private PhilosopherRepository philosopherRepository;
    private Room room = new Room();

    @Autowired
    public PhilosophyController(PhilosopherRepository philosopherRepository) {
        this.philosopherRepository = philosopherRepository;
    }

    @RequestMapping("/")
    public String selector() {
        return "philosophy";
    }


    @RequestMapping("/map")
    public String map(Model model) {
        model.addAttribute("map", room.getMap());
        return "Mapa";
    }
//    @RequestMapping("/fight")
//    public String fight(Model model){
//        model.addAttribute("fightRoom", room.fightRoom());
//        return ""
//    }

    @RequestMapping("/goRight")
    public String goRight(Model model) {
        model.addAttribute("map", room.goRight());
        return "redirect:/map";
    }

    @RequestMapping("/goLeft")
    public String goLeft(Model model) {
        model.addAttribute("map", room.goLeft());
        return "redirect:/map";
    }

    @RequestMapping("/goUp")
    public String goUp(Model model) {
        model.addAttribute("map", room.goUp());
        return "redirect:/map";
    }

    @RequestMapping("/goDown")
    public String goDown(Model model) {
        model.addAttribute("map", room.goDown());
        return "redirect:/map";
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

        if (philosopher1.equals("Aristotle") && attack.equals("philosophise") && philosopher2.equals("Plato")) {

            return "aristoAttacksPlato";

        }
        if (philosopher1.equals("Aristotle") && attack.equals("philosophise") && philosopher2.equals("Socrates")) {

            return "socratesAttacksAristotle";

        }
        if (philosopher1.equals("Plato") && attack.equals("philosophise") && philosopher2.equals("Aristotle")) {

            return "aristoAttacksPlato";

        }
        if (philosopher1.equals("Plato") && attack.equals("philosophise") && philosopher2.equals("Socrates")) {

            return "socratesAttacksPlato";

        }
        if (philosopher1.equals("Socrates") && attack.equals("philosophise") && philosopher2.equals("Aristotle")) {

            return "socratesAttacksAristotle";

        }
        if (philosopher1.equals("Socrates") && attack.equals("philosophise") && philosopher2.equals("Plato")) {

            return "socratesAttacksPlato";

        }
        if (philosopher1.equals("Aristotle") && attack.equals("rhetorical attack") && philosopher2.equals("Plato")) {

            return "aristoAttacksPlato";

        }
        if (philosopher1.equals("Aristotle") && attack.equals("rhetorical attack") && philosopher2.equals("Socrates")) {

            return "socratesAttacksAristotle";

        }
        if (philosopher1.equals("Plato") && attack.equals("rhetorical attack") && philosopher2.equals("Aristotle")) {

            return "aristoAttacksPlato";

        }
        if (philosopher1.equals("Plato") && attack.equals("rhetorical attack") && philosopher2.equals("Socrates")) {

            return "socratesAttacksPlato";

        }
        if (philosopher1.equals("Socrates") && attack.equals("rhetorical attack") && philosopher2.equals("Aristotle")) {

            return "socratesAttacksAristotle";

        }
        if (philosopher1.equals("Socrates") && attack.equals("rhetorical attack") && philosopher2.equals("Plato")) {

            return "socratesAttacksPlato";

        }
        if (philosopher1.equals("Aristotle") && attack.equals("ad personam") && philosopher2.equals("Plato")) {

            return "aristoAttacksPlato";

        }
        if (philosopher1.equals("Aristotle") && attack.equals("ad personam") && philosopher2.equals("Socrates")) {

            return "socratesAttacksAristotle";

        }
        if (philosopher1.equals("Plato") && attack.equals("ad personam") && philosopher2.equals("Aristotle")) {

            return "aristoAttacksPlato";

        }
        if (philosopher1.equals("Plato") && attack.equals("ad personam") && philosopher2.equals("Socrates")) {

            return "socratesAttacksPlato";

        }
        if (philosopher1.equals("Socrates") && attack.equals("ad personam") && philosopher2.equals("Aristotle")) {

            return "socratesAttacksAristotle";

        }
        if (philosopher1.equals("Socrates") && attack.equals("ad personam") && philosopher2.equals("Plato")) {

            return "socratesAttacksPlato";

        }
        if (philosopher1.equals("Aristotle") && attack.equals("physical attack") && philosopher2.equals("Plato")) {

            return "aristoAttacksPlato";

        }
        if (philosopher1.equals("Aristotle") && attack.equals("physical attack") && philosopher2.equals("Socrates")) {

            return "socratesAttacksAristotle";

        }
        if (philosopher1.equals("Plato") && attack.equals("physical attack") && philosopher2.equals("Aristotle")) {

            return "aristoAttacksPlato";

        }
        if (philosopher1.equals("Plato") && attack.equals("physical attack") && philosopher2.equals("Socrates")) {

            return "socratesAttacksPlato";

        }
        if (philosopher1.equals("Socrates") && attack.equals("physical attack") && philosopher2.equals("Aristotle")) {

            return "socratesAttacksAristotle";

        }
        if (philosopher1.equals("Socrates") && attack.equals("physical attack") && philosopher2.equals("Plato")) {

            return "socratesAttacksPlato";

        }
        if (philosopher1.equals("Aristotle") && attack.equals("special") && philosopher2.equals("Plato")) {

            return "aristoAttacksPlato";

        }
        if (philosopher1.equals("Aristotle") && attack.equals("special") && philosopher2.equals("Socrates")) {

            return "socratesAttacksAristotle";

        }
        if (philosopher1.equals("Plato") && attack.equals("special") && philosopher2.equals("Aristotle")) {

            return "aristoAttacksPlato";

        }
        if (philosopher1.equals("Plato") && attack.equals("special") && philosopher2.equals("Socrates")) {

            return "socratesAttacksPlato";

        }
        if (philosopher1.equals("Socrates") && attack.equals("physical attack") && philosopher2.equals("Aristotle")) {

            return "socratesAttacksAristotle";

        }
        if (philosopher1.equals("Socrates") && attack.equals("physical attack") && philosopher2.equals("Plato")) {

            return "socratesAttacksPlato";

        }
        return "socratesAttacksPlato";
    }


    private Philosopher getPhilosopher(String philosopher) {
        return philosopherRepository.getByName(philosopher);
    }

}