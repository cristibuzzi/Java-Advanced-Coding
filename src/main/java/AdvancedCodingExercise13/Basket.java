package AdvancedCodingExercise13;

import java.io.Closeable;
import java.io.IOException;

public class Basket implements Closeable {

    private static final int MIN = 0;
    private static final int MAX = 10;

    private int numberOfElements;

    public void addToBasket() throws BasketFullException {
        if (numberOfElements >= MAX) {
            throw new BasketFullException("Max capacity reached");
        } else {
            numberOfElements++;
        }
    }

    public void removeFromBasket() throws BasketEmptyException {
        if (numberOfElements <= MIN) {
            throw new BasketEmptyException("Min capacity reached");
        } else {
            numberOfElements--;
        }
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    @Override
    public void close() {
        numberOfElements = 0;
        System.out.println("Basket closed");
    }
}