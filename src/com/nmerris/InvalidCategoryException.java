package com.nmerris;

/**
 * Throw this exception if the user enters an invalid category from Book.
 * Use it's toString method to output an appropriate message.
 *
 * @author Nathan Merris
 * @see com.nmerris.Book#categories
 *
 */
public class InvalidCategoryException extends Exception {

    @Override
    public String toString() {
        return "Please enter a category exactly as given";
    }

}
