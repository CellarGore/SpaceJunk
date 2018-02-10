package com.spacejunk.game.obstacles;

import com.badlogic.gdx.graphics.Texture;

/**
 * Created by vidxyz on 2/8/18.
 */

public abstract class Obstacle {

    // Initial dummy setting
    int x = -1;
    int y = -1;


    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String getType() {
        if(this instanceof AsteroidObstacle) {
            return "Asteroid";
        }
        else if (this instanceof FireObstacle) {
            return "Fire";
        }
        else {
            return "Default";
        }
    }

    public abstract void moveLeft();

    public abstract Texture getTexture();


}
