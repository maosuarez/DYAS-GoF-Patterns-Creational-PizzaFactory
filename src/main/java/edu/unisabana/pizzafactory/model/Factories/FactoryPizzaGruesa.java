package edu.unisabana.pizzafactory.model.Factories;

import edu.unisabana.pizzafactory.model.AmasadorPizza.AmasadorPizzaGruesa;
import edu.unisabana.pizzafactory.model.AmasadorPizza.IAmasadorPizza;
import edu.unisabana.pizzafactory.model.HorneadorPizza.HorneadorPizzaGruesa;
import edu.unisabana.pizzafactory.model.HorneadorPizza.IHorneadorPizza;
import edu.unisabana.pizzafactory.model.ModeladorPizza.IMoldeadorPizza;
import edu.unisabana.pizzafactory.model.ModeladorPizza.MoldeadorPizzaGruesa;

public class FactoryPizzaGruesa implements IFactoryPizza {

    @Override
    public IAmasadorPizza createAmasadorPizza() {
        return new AmasadorPizzaGruesa();
    }

    @Override
    public IHorneadorPizza createHorneadorPizza() {
        return new HorneadorPizzaGruesa();
    }

    @Override
    public IMoldeadorPizza createMoldeadorPizza() {
        return new MoldeadorPizzaGruesa();
    }

}
