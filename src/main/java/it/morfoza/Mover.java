package it.morfoza;

/**
 * Created by Wojt on 2016-08-16.
 */
public class Mover {
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
