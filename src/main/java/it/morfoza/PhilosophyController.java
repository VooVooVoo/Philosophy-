package it.morfoza;

/**
 * Created by Wojt on 2016-08-10.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;


@Controller
public class PhilosophyController {

    private PhilosopherRepository philosopherRepository;
    private Room room = new Room();
    private User user = new User();

    @Autowired
    public PhilosophyController(PhilosopherRepository philosopherRepository) {
        this.philosopherRepository = philosopherRepository;
    }

    @RequestMapping("/")
    public String userInput(@RequestParam(value = "error", required = false) String error, Model model) {
        model.addAttribute("error", error);

        return "start";
    }

    @RequestMapping("/start")
    public String start(@RequestParam(value = "userNick") String userNick,
                        @RequestParam(value = "userPhilosopher") String userPhilosopher,
                        Model model) {

        if (userNickIsLongerThan12(userNick)) {
            String error = encode("Your nick must not be longer than 12 characters!");
            return "redirect:/?error=" + error;
        }
        model.addAttribute("userNick", userNick);
        model.addAttribute("userPhilosopher", userPhilosopher);
        return "redirect:/map";
    }

    @RequestMapping("/fight")
    public String fight() {
        return "philosophy";
    }


    @RequestMapping("/map")
    public String map(Model model) {
        model.addAttribute("map", room.getMap());
        return "Mapa";
    }

    @RequestMapping("/philosopherStatus")
    public String philosopherStatus() {

        return "philosopherStatus";
    }

    @RequestMapping("/aristoAttacksPlato")
    public String aristoAttacksPlato(@RequestParam(value = "philosopher1") String philosopher1,
                                     @RequestParam(value = "attack") String attack,
                                     @RequestParam(value = "philosopher2") String philosopher2, Model model) {


        model.addAttribute("philosopher1", philosopher1);
        model.addAttribute("philosopher2", philosopher2);
        model.addAttribute("attack", attack);
        Philosopher philosopher;
        Philosopher rival;

        philosopher = getPhilosopher(philosopher1);
        model.addAttribute("philosopher", philosopher);
        rival = getPhilosopher(philosopher2);
        model.addAttribute("rival", rival);

        {

            return "aristoAttacksPlato";
        }
    }

    @RequestMapping("/socratesAttacksAristotle")
    public String socratesAttacksAristotle(@RequestParam(value = "philosopher1") String philosopher1,
                                           @RequestParam(value = "attack") String attack,
                                           @RequestParam(value = "philosopher2") String philosopher2, Model model) {


        model.addAttribute("philosopher1", philosopher1);
        model.addAttribute("philosopher2", philosopher2);
        model.addAttribute("attack", attack);
        Philosopher philosopher;
        Philosopher rival;

        philosopher = getPhilosopher(philosopher1);
        model.addAttribute("philosopher", philosopher);
        rival = getPhilosopher(philosopher2);
        model.addAttribute("rival", rival);

        return "socratesAttacksAristotle";
    }

    @RequestMapping("/socratesAttacksPlato")
    public String socratesAttacksPlato(@RequestParam(value = "philosopher1") String philosopher1,
                                       @RequestParam(value = "attack") String attack,
                                       @RequestParam(value = "philosopher2") String philosopher2, Model model) {


        model.addAttribute("philosopher1", philosopher1);
        model.addAttribute("philosopher2", philosopher2);
        model.addAttribute("attack", attack);
        Philosopher philosopher;
        Philosopher rival;

        philosopher = getPhilosopher(philosopher1);
        model.addAttribute("philosopher", philosopher);
        rival = getPhilosopher(philosopher2);
        model.addAttribute("rival", rival);
        {

            return "socratesAttacksPlato";
        }
    }


    @RequestMapping("/goRight")
    public String goRight() {
        room.goRight();
        return "redirect:/map";
    }

    @RequestMapping("/goLeft")
    public String goLeft() {
        room.goLeft();
        return "redirect:/map";
    }

    @RequestMapping("/goUp")
    public String goUp() {
        room.goUp();
        return "redirect:/map";
    }

    @RequestMapping("/goDown")
    public String goDown() {
        room.goDown();
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
        rival = getPhilosopher(philosopher2);
        model.addAttribute("rival", rival);

        if (philosopher2.equals(philosopher1)) {
            throw new RuntimeException("Cannot attack self!!!");

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


        if (philosopher1.equals("Aristotle") && attack.equals("philosophise") && philosopher2.equals("Plato")) {

            return "redirect:/aristoAttacksPlato?philosopher1=Aristotle&attack=philosophise&philosopher2=Plato";

        }
        if (philosopher1.equals("Aristotle") && attack.equals("philosophise") && philosopher2.equals("Socrates")) {

            return "redirect:/socratesAttacksAristotle?philosopher1=Aristotle&attack=philosophise&philosopher2=Socrates";

        }
        if (philosopher1.equals("Plato") && attack.equals("philosophise") && philosopher2.equals("Aristotle")) {

            return "redirect:/aristoAttacksPlato?philosopher1=Plato&attack=philosophise&philosopher2=Aristotle";

        }
        if (philosopher1.equals("Plato") && attack.equals("philosophise") && philosopher2.equals("Socrates")) {

            return "redirect:/socratesAttacksPlato?philosopher1=Plato&attack=philosophise&philosopher2=Socrates";

        }
        if (philosopher1.equals("Socrates") && attack.equals("philosophise") && philosopher2.equals("Aristotle")) {

            return "redirect:/socratesAttacksAristotle?philosopher1=Socrates&attack=philosophise&philosopher2=Aristotle";

        }
        if (philosopher1.equals("Socrates") && attack.equals("philosophise") && philosopher2.equals("Plato")) {

            return "redirect:/socratesAttacksPlato?philosopher1=Socrates&attack=philosophise&philosopher2=Plato";

        }
        if (philosopher1.equals("Aristotle") && attack.equals("rhetorical attack") && philosopher2.equals("Plato")) {

            return "redirect:/aristoAttacksPlato?philosopher1=Aristotle&attack=rhetorical+attack&philosopher2=Plato";

        }
        if (philosopher1.equals("Aristotle") && attack.equals("rhetorical attack") && philosopher2.equals("Socrates")) {

            return "redirect:/socratesAttacksAristotle?philosopher1=Aristotle&attack=rhetorical+attack&philosopher2=Socrates";

        }
        if (philosopher1.equals("Plato") && attack.equals("rhetorical attack") && philosopher2.equals("Aristotle")) {

            return "redirect:/aristoAttacksPlato?philosopher1=Plato&attack=rhetorical+attack&philosopher2=Aristotle";

        }
        if (philosopher1.equals("Plato") && attack.equals("rhetorical attack") && philosopher2.equals("Socrates")) {

            return "redirect:/socratesAttacksPlato?philosopher1=Plato&attack=rhetorical+attack&philosopher2=Socrates";

        }
        if (philosopher1.equals("Socrates") && attack.equals("rhetorical attack") && philosopher2.equals("Aristotle")) {

            return "redirect:/socratesAttacksAristotle?philosopher1=Socrates&attack=rhetorical+attack&philosopher2=Aristotle";

        }
        if (philosopher1.equals("Socrates") && attack.equals("rhetorical attack") && philosopher2.equals("Plato")) {

            return "redirect:/socratesAttacksPlato?philosopher1=Socrates&attack=rhetorical+attack&philosopher2=Plato";

        }
        if (philosopher1.equals("Aristotle") && attack.equals("ad personam") && philosopher2.equals("Plato")) {

            return "redirect:/aristoAttacksPlato?philosopher1=Aristotle&attack=ad+personam&philosopher2=Plato";

        }
        if (philosopher1.equals("Aristotle") && attack.equals("ad personam") && philosopher2.equals("Socrates")) {

            return "redirect:/socratesAttacksAristotle?philosopher1=Aristotle&attack=ad+personam&philosopher2=Socrates";

        }
        if (philosopher1.equals("Plato") && attack.equals("ad personam") && philosopher2.equals("Aristotle")) {

            return "redirect:/aristoAttacksPlato?philosopher1=Plato&attack=ad+personam&philosopher2=Aristotle";

        }
        if (philosopher1.equals("Plato") && attack.equals("ad personam") && philosopher2.equals("Socrates")) {

            return "redirect:/socratesAttacksPlato?philosopher1=Plato&attack=ad+personam&philosopher2=Socrates";

        }
        if (philosopher1.equals("Socrates") && attack.equals("ad personam") && philosopher2.equals("Aristotle")) {

            return "redirect:/socratesAttacksAristotle?philosopher1=Socrates&attack=ad+personam&philosopher2=Aristotle";

        }
        if (philosopher1.equals("Socrates") && attack.equals("ad personam") && philosopher2.equals("Plato")) {

            return "redirect:/socratesAttacksPlato?philosopher1=Socrates&attack=ad+personam&philosopher2=Plato";

        }
        if (philosopher1.equals("Aristotle") && attack.equals("physical attack") && philosopher2.equals("Plato")) {

            return "redirect:/aristoAttacksPlato?philosopher1=Aristotle&attack=physical+attack&philosopher2=Plato";

        }
        if (philosopher1.equals("Aristotle") && attack.equals("physical attack") && philosopher2.equals("Socrates")) {

            return "redirect:/socratesAttacksAristotle?philosopher1=Aristotle&attack=physical+attack&philosopher2=Socrates";

        }
        if (philosopher1.equals("Plato") && attack.equals("physical attack") && philosopher2.equals("Aristotle")) {

            return "redirect:/aristoAttacksPlato?philosopher1=Plato&attack=physical+attack&philosopher2=Aristotle";

        }
        if (philosopher1.equals("Plato") && attack.equals("physical attack") && philosopher2.equals("Socrates")) {

            return "redirect:/socratesAttacksPlato?philosopher1=Plato&attack=physical+attack&philosopher2=Socrates";

        }
        if (philosopher1.equals("Socrates") && attack.equals("physical attack") && philosopher2.equals("Aristotle")) {

            return "redirect:/socratesAttacksAristotle?philosopher1=Socrates&attack=physical+attack&philosopher2=Aristotle";

        }
        if (philosopher1.equals("Socrates") && attack.equals("physical attack") && philosopher2.equals("Plato")) {

            return "redirect:/socratesAttacksPlato?philosopher1=Socrates&attack=physical+attack&philosopher2=Plato";

        }
        if (philosopher1.equals("Aristotle") && attack.equals("special") && philosopher2.equals("Plato")) {

            return "redirect:/aristoAttacksPlato?philosopher1=Aristotle&attack=special&philosopher2=Plato";

        }
        if (philosopher1.equals("Aristotle") && attack.equals("special") && philosopher2.equals("Socrates")) {

            return "redirect:/socratesAttacksAristotle?philosopher1=Aristotle&attack=special&philosopher2=Socrates";

        }
        if (philosopher1.equals("Plato") && attack.equals("special") && philosopher2.equals("Aristotle")) {

            return "redirect:/aristoAttacksPlato?philosopher1=Plato&attack=special&philosopher2=Aristotle";

        }
        if (philosopher1.equals("Plato") && attack.equals("special") && philosopher2.equals("Socrates")) {

            return "redirect:/socratesAttacksPlato?philosopher1=Plato&attack=special&philosopher2=Socrates";

        }
        if (philosopher1.equals("Socrates") && attack.equals("special") && philosopher2.equals("Aristotle")) {

            return "redirect:/socratesAttacksAristotle?philosopher1=Socrates&attack=special&philosopher2=Aristotle";

        }
        if (philosopher1.equals("Socrates") && attack.equals("special") && philosopher2.equals("Plato")) {

            return "redirect:/socratesAttacksPlato?philosopher1=Socrates&attack=special&philosopher2=Plato";

        }

        return "redirect:/socratesAttacksPlato";
    }


    private Philosopher getPhilosopher(String philosopher) {
        return philosopherRepository.getByName(philosopher);
    }

    public boolean userNickIsLongerThan12(String userNick) {
        if (userNick.length() > 12) {
            return true;
        }

        return false;
    }

    private String encode(String text) {
        try {
            return URLEncoder.encode(text, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

}