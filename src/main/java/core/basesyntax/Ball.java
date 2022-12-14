package core.basesyntax;

public class Ball {
    String ballColor;   //ToDo use private modifier for class variables,
    int ballNumber;     //ToDo  only class objects must have access for own variables

    public Ball() {
    }

    public Ball(String color, int number) {
        this.ballColor = color;     //ToDo if method parameters has all different variables name than use class variables, keyword "this" never used
        this.ballNumber = number;   //ToDo
    }

    public String getBallColor() {  // ToDo drop all methods and variables that never uses in code
        return this.ballColor;  //ToDo keyword "this" is redundant for getters and setters (and other methods) with empty method parameters
    }

    public void setBallColor(String ballColor) {
        this.ballColor = ballColor; //in this case, keyword "this" uses correctly
    }

    public int getBallNumber() {    // ToDo all drop methods and variables that never uses in code
        return this.ballNumber; //ToDo keyword "this" is redundant for getters and setters (and other methods) with empty method parameters
    }

    public void setBallNumber(int ballNumber) {
        this.ballNumber = ballNumber;
    }

    public String toString() {  //ToDo add @Override annotation when override parent methods
        String ball = "ball";   //ToDo delete variables that never used
        return "Ball with number: " + ballNumber + " and color: " + ballColor;
    }
}
