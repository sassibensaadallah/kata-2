package com.kata.racemus.objects;


import com.kata.racemus.utils.Constants;

import java.util.Objects;

public class Position {
    int x;
    int y;
    Orientation orientation;
    public void turnLeft(){
        if(this.orientation.equals(Orientation.S))
            this.orientation=Orientation.E;
        else if(this.orientation.equals(Orientation.E))
            this.orientation=Orientation.N;
        else if(this.orientation.equals(Orientation.N))
            this.orientation=Orientation.W;
        else if(this.orientation.equals(Orientation.W))
            this.orientation=Orientation.S;
    }
    public void turnRight(){
        if(this.orientation.equals(Orientation.S))
            this.orientation=Orientation.W;
        else if(this.orientation.equals(Orientation.W))
            this.orientation=Orientation.N;
        else if(this.orientation.equals(Orientation.N))
            this.orientation=Orientation.E;
        else if(this.orientation.equals(Orientation.E))
            this.orientation=Orientation.S;
    }

    public void avancer(){
        if(this.orientation.equals(Orientation.S)&&this.y-1>= Constants.getMinY()){
            this.y--;
        }else if(this.orientation.equals(Orientation.N)&&this.y+1<= Constants.getMaxY()){
            this.y++;
        }else if(this.orientation.equals(Orientation.W)&&this.x-1>= Constants.getMinX()){
            this.x--;
        }else if(this.orientation.equals(Orientation.E)&&this.y+1<= Constants.getMaxX()){
            this.x++;
        }
    }

    @Override
    public String toString() {
        return  x +
                " " + y +
                " " + orientation;
    }

    public Position(int x, int y, Orientation orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;
        Position position = (Position) o;
        return x == position.x && y == position.y && orientation == position.orientation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, orientation);
    }
}
