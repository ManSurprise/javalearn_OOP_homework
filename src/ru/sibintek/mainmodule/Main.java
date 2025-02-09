package ru.sibintek.mainmodule;
import ru.sibintek.squareroot.*;

public class Main {
    public static void main(String[] args) {
        double b = 4;
        double a = Squareroot.calculate(b);
        System.out.println("Корень " + b + " = " + a);
    }
}
