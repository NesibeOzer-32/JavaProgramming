package day40_FinalKeyword;

import day39_Recap.ShapeTask.Circle;
import day39_Recap.ShapeTask.Square;

public class EncapsulationReview {

    private Circle circle;
    private Square square;

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }

    public Circle getCircle(){
        return circle;
    }

    public void Circle (Circle circle){

        if(circle.getRadius()<5){
            return;
        }
        this.circle=circle;

    }
}
