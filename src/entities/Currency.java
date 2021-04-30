package entities;

public class Currency {

    public static final double IOF  = 6.00;

    public static double conversor(double price, double dollar) {
        double value = price * dollar;
        return value += value * IOF / 100;

    }
}

