package edu.unisabana.pizzafactory.model.Factories;

import edu.unisabana.pizzafactory.model.AmasadorPizza.AmasadorPizzaIntegral;
import edu.unisabana.pizzafactory.model.AmasadorPizza.IAmasadorPizza;
import edu.unisabana.pizzafactory.model.HorneadorPizza.HorneadorPizzaIntegral;
import edu.unisabana.pizzafactory.model.HorneadorPizza.IHorneadorPizza;
import edu.unisabana.pizzafactory.model.ModeladorPizza.IMoldeadorPizza;
import edu.unisabana.pizzafactory.model.ModeladorPizza.MoldeadorPizzaIntegral;

public class FactoryPizzaIntegral implements IFactoryPizza {

    @Override
    public IAmasadorPizza createAmasadorPizza() {
        return new AmasadorPizzaIntegral();
    }

    @Override
    public IHorneadorPizza createHorneadorPizza() {
        return new HorneadorPizzaIntegral();
    }

    @Override
    public IMoldeadorPizza createMoldeadorPizza() {
        return new MoldeadorPizzaIntegral();
    }

}
