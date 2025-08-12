package edu.unisabana.pizzafactory.model.Factories;

import edu.unisabana.pizzafactory.model.AmasadorPizza.IAmasadorPizza;
import edu.unisabana.pizzafactory.model.HorneadorPizza.IHorneadorPizza;
import edu.unisabana.pizzafactory.model.ModeladorPizza.IMoldeadorPizza;

public interface IFactoryPizza {
    public IAmasadorPizza createAmasadorPizza();

    public IHorneadorPizza createHorneadorPizza();

    public IMoldeadorPizza createMoldeadorPizza();
}
