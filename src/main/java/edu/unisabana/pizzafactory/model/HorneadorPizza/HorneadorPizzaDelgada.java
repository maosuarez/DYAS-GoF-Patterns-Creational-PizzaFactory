
package edu.unisabana.pizzafactory.model.HorneadorPizza;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.model.AmasadorPizza.AmasadorPizzaDelgada;

/**
 *
 * @author cesarvefe
 */
public class HorneadorPizzaDelgada implements IHorneadorPizza {

    public void hornear() {
        Logger.getLogger(AmasadorPizzaDelgada.class.getName())
            .log(Level.INFO, "[~~] Horneando la pizza delgada con masa convencional.");

        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
    
}
