package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
//ToDo this empty line is redundant
//ToDo this empty line is redundant
    public static String getRandomColor() { //ToDo better create new class object (with necessary variables and methods) than use static method
        int index = new Random().nextInt(Colors.values().length);   //ToDo add access modifier
        return Colors.values()[index].toString();   //ToDo use name() for getting String representation of enum constant
    }
}
