package edu.unisabana.pizzafactory.model.Factories;

import edu.unisabana.pizzafactory.model.Masa;
import edu.unisabana.pizzafactory.model.HorneadorPizza.HorneadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.HorneadorPizza.HorneadorPizzaGruesa;
import edu.unisabana.pizzafactory.model.HorneadorPizza.HorneadorPizzaIntegral;
import edu.unisabana.pizzafactory.model.HorneadorPizza.IHorneadorPizza;

public class HorneadorPizzaFactory {
    public static IHorneadorPizza createHorneadorPizza(Masa masa){
        switch (masa) {
            case Masa.DELGADA:
                return new HorneadorPizzaDelgada();
            case Masa.GRUESA:
                return new HorneadorPizzaGruesa();
            case Masa.INTEGRAL:
                return new HorneadorPizzaIntegral();
            
            default:
                return new HorneadorPizzaDelgada();
        }
    }
}
