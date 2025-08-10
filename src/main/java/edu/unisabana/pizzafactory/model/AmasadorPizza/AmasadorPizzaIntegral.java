package edu.unisabana.pizzafactory.model.AmasadorPizza;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AmasadorPizzaIntegral implements IAmasadorPizza {
    public void amasar() {
        Logger.getLogger(AmasadorPizzaIntegral.class.getName())
                .log(Level.INFO, "[@@] Amasando la pizza con masa Integral.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
        
    }
}
