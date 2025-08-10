package edu.unisabana.pizzafactory.model.HorneadorPizza;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HorneadorPizzaIntegral implements IHorneadorPizza {
    public void hornear() {
        Logger.getLogger(HorneadorPizzaIntegral.class.getName())
            .log(Level.INFO, "[~~] Horneando la pizza con masa integral.");

        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}
