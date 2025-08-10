package edu.unisabana.pizzafactory.model.Factories;

import edu.unisabana.pizzafactory.model.Masa;
import edu.unisabana.pizzafactory.model.AmasadorPizza.AmasadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.AmasadorPizza.AmasadorPizzaIntegral;
import edu.unisabana.pizzafactory.model.AmasadorPizza.IAmasadorPizza;

public class AmasadorPizzaFactory {
    
    public static IAmasadorPizza createAmasadorPizza(Masa masa){
        switch (masa) {
            case Masa.DELGADA:
                return new AmasadorPizzaDelgada();
            case Masa.GRUESA:
                return new AmasadorPizzaDelgada();
            case Masa.INTEGRAL:
                return new AmasadorPizzaIntegral();
            
            default:
                return new AmasadorPizzaDelgada();
        }
    }
}
