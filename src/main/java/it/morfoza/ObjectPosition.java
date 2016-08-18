package it.morfoza;

/**
 * Created by Wojt on 2016-08-17.
 */

    public class ObjectPosition {
        int objectCoordinateX = (int) (Math.random() * 10)/2;
        int objectCoordinateY = (int) (Math.random() * 10)/2;

        public ObjectPosition(int x, int y) {
            this.objectCoordinateX = x;
            this.objectCoordinateY = y;

        }
    }
