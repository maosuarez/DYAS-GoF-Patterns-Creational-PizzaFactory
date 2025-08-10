package edu.unisabana.pizzafactory.model.HorneadorPizza;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.model.AmasadorPizza.AmasadorPizzaGruesa;

public class HorneadorPizzaGruesa implements IHorneadorPizza {
    public void hornear() {
            Logger.getLogger(AmasadorPizzaGruesa.class.getName())
                .log(Level.INFO, "[~~] Horneando la pizza gruesa con masa convencional.");

            //CODIGO DE LLAMADO AL MICROCONTROLADOR
        }
}
