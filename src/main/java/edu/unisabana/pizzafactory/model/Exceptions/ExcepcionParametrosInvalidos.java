
package edu.unisabana.pizzafactory.model.Exceptions;

/**
 *
 * @author cesarvefe
 */
public class ExcepcionParametrosInvalidos extends Exception {

    public ExcepcionParametrosInvalidos(String message, Throwable cause) {
        super(message, cause);
    }

    public ExcepcionParametrosInvalidos(String message) {
        super(message);
    }
 
}
