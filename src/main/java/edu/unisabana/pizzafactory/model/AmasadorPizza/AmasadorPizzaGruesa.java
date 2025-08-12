package edu.unisabana.pizzafactory.model.AmasadorPizza;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AmasadorPizzaGruesa implements IAmasadorPizza{
    public void amasar() {
        Logger.getLogger(AmasadorPizzaGruesa.class.getName())
                .log(Level.INFO, "[@@] Amasando la pizza gruesa con masa convencional.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
        
    }
}
