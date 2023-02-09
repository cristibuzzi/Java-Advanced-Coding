package AdvancedCodingExercise13;

/**
 * Create a Basket class that imitates a basket and stores the current number of items in the basket.
 * Add the addToBasket() method, which adds the element to the basket (increasing the current state by 1)
 * and the removeFromBasket() method, which removes the element from the basket (reducing the current state by 1).
 * The basket can store from 0 to 10 items. When a user wants to remove an element
 * at 0 items state or add an element at 10 items state, throw the appropriate runtime exception
 * (BasketFullException or BasketEmptyException).
 */

/**
 * Change the BasketFullException and BasketEmptyException exceptions from runtime exception type
 * to checked exception type. Handle them.
 */

public class Main {
    public static void main(String[] args) {

        try (Basket basket = new Basket()){
            try {
                basket.addToBasket();
                basket.addToBasket();
                basket.addToBasket();
                basket.addToBasket();
                basket.addToBasket();
                basket.addToBasket();
                basket.addToBasket();
                basket.addToBasket();
                basket.addToBasket();
                basket.addToBasket();
                basket.addToBasket();

            } catch (BasketFullException e) {
                System.err.println(e.getMessage());
            } finally {
                System.out.println(basket.getNumberOfElements());
            }

            try {

                basket.removeFromBasket();
                basket.removeFromBasket();
                basket.removeFromBasket();
                basket.removeFromBasket();
                basket.removeFromBasket();
                basket.removeFromBasket();
                basket.removeFromBasket();
                basket.removeFromBasket();
                basket.removeFromBasket();
                basket.removeFromBasket();
                basket.removeFromBasket();


            } catch (BasketEmptyException e) {
                System.err.println(e.getMessage());
            } finally {
                System.out.println(basket.getNumberOfElements());
            }
        }
    }
}
