package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {    //ToDo keyword "extends" uses when one class extends properties of another (child) class, classes ColorSupplier and Lottery provide fully different objects
    public Ball getRandomBall() {   //you can use this method by Lottery class objects with private access modifier
//ToDo this empty line is redundant
        Ball ball = new Ball(); //ToDo to create Ball object use another constructor, and put parameters without setter (lines 10,12 is redundant)
//ToDo this empty line is redundant
        ball.setBallColor(ColorSupplier.getRandomColor());  //ToDo with keyword "extends" we can use parent class methods without parent class name
//ToDo this empty line is redundant
        ball.setBallNumber(new Random().nextInt(100));  //ToDo this Random doesnt match this task (bound start from "0"), add constant variable for
//ToDo this empty line is redundant
        return ball;    //ToDo we can create Ball object directly
    }
}
