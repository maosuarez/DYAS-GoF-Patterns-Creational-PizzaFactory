package edu.unisabana.pizzafactory.model.Factories;

import edu.unisabana.pizzafactory.model.AmasadorPizza.AmasadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.AmasadorPizza.IAmasadorPizza;
import edu.unisabana.pizzafactory.model.HorneadorPizza.HorneadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.HorneadorPizza.IHorneadorPizza;
import edu.unisabana.pizzafactory.model.ModeladorPizza.IMoldeadorPizza;
import edu.unisabana.pizzafactory.model.ModeladorPizza.MoldeadorPizzaDelgada;

public class FactoryPizzaDelgada implements IFactoryPizza {

    @Override
    public IAmasadorPizza createAmasadorPizza() {
        return new AmasadorPizzaDelgada();
    }

    @Override
    public IHorneadorPizza createHorneadorPizza() {
        return new HorneadorPizzaDelgada();
    }

    @Override
    public IMoldeadorPizza createMoldeadorPizza() {
        return new MoldeadorPizzaDelgada();
    }

}
