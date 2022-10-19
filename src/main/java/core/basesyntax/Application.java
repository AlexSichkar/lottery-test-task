package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery ball1 = new Lottery();  //ToDo use "for" loop when create few objects of class, in this task you can create one Lottery object with three Balls if you want
        System.out.println(ball1.getRandomBall().toString());   //ToDo with "for" loop lines 6,8,10 (and lines 5,7,9) can replace by one line
        Lottery ball2 = new Lottery();
        System.out.println(ball2.getRandomBall().toString());   //ToDo dont forget about constant variables for magic numbers
        Lottery ball3 = new Lottery();
        System.out.println(ball3.getRandomBall().toString());
    }
}
