package edu.unisabana.pizzafactory.model.Factories;

import edu.unisabana.pizzafactory.model.Masa;
import edu.unisabana.pizzafactory.model.ModeladorPizza.IMoldeadorPizza;
import edu.unisabana.pizzafactory.model.ModeladorPizza.MoldeadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.ModeladorPizza.MoldeadorPizzaGruesa;
import edu.unisabana.pizzafactory.model.ModeladorPizza.MoldeadorPizzaIntegral;

public class MoldeadorPizzaFactory {
    public static IMoldeadorPizza createModeladorPizza(Masa masa){
        switch (masa) {
            case Masa.DELGADA:
                return new MoldeadorPizzaDelgada();
            case Masa.GRUESA:
                return new MoldeadorPizzaGruesa();
            case Masa.INTEGRAL:
                return new MoldeadorPizzaIntegral();
            
            default:
                return new MoldeadorPizzaDelgada();
        }
    }
}
