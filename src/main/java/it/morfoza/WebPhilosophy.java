package it.morfoza;

/**
 * Created by Wojt on 2016-08-08.
 */
public class WebPhilosophy {
        public Object philosophise(Philosopher philosopher,Philosopher rival) {

            philosopher.attack1(rival);
            return rival;
        }
        public Object thetoricalAttack(Philosopher philosopher,Philosopher rival) {

            philosopher.attack2(rival);
            return rival;
        }
        public Object adPersonam(Philosopher philosopher,Philosopher rival) {

            philosopher.attack3(rival);
            return rival;
        }
        public Object physicalAttack(Philosopher philosopher,Philosopher rival) {

            philosopher.attack4(rival);
            return rival;
        }


}
