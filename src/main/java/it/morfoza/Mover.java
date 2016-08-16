package it.morfoza;

import java.util.List;

/**
 * Created by Wojt on 2016-08-16.
 */
public class Mover {
    Player player = new Player();
    Room room1 = new Room();
    int x;
    int y;

    public static void main(String[] args) {


    }


    public void goLeft(){
        if(x>0){
            x-=1;
        }
    }
    public void goRight(){
        if(x<4){
            x+=1;
        }
    }
    public void goDown(){
        if(y<4){
            y+=1;
        }
    }
    public void goUp(){
        if(y>0){
            y-=1;
        }
    }

}
