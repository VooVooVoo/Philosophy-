package it.morfoza;

/**
 * Created by Wojt on 2016-08-15.
 */
public class Room {

    static int[][] myRoom = new int [5][5];
    Player player = new Player();
    Room room1 = new Room();
    int x = 5;
    int y = 5;
    int playerCoordinateX;
    int playerCoordinateY;

    public static void main(String[] args) {


        myRoom[2][4]= 1;

    }



    public int getPlayerPosition(){
        return myRoom[playerCoordinateX][playerCoordinateY];
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





