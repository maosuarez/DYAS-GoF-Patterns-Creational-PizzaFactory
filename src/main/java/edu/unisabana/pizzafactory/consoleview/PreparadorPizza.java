
package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.Masa;
import edu.unisabana.pizzafactory.model.Tamano;
import edu.unisabana.pizzafactory.model.AmasadorPizza.IAmasadorPizza;
import edu.unisabana.pizzafactory.model.Exceptions.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.Factories.FactoryPizzaIntegral;
import edu.unisabana.pizzafactory.model.Factories.IFactoryPizza;
import edu.unisabana.pizzafactory.model.HorneadorPizza.IHorneadorPizza;
import edu.unisabana.pizzafactory.model.ModeladorPizza.IMoldeadorPizza;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesarvefe
 */
public class PreparadorPizza {

    public static void main(String args[]){
        try {
            Ingrediente[] ingredientes=new Ingrediente[]{
                new Ingrediente("queso",1),
                new Ingrediente("jamon",2)
            };            
            PreparadorPizza pp=new PreparadorPizza();            
            pp.prepararPizza(ingredientes, Tamano.MEDIANO, Masa.DELGADA);
        } catch (ExcepcionParametrosInvalidos ex) {
            Logger.getLogger(PreparadorPizza.class.getName()).log(Level.SEVERE, "Problema en la preparacion de la Pizza", ex);
        }
                
    }
    
    
    public void prepararPizza(Ingrediente[] ingredientes, Tamano tam, Masa masa)
            throws ExcepcionParametrosInvalidos {

        IFactoryPizza factory;
        
        Logger.getLogger(PreparadorPizza.class.getName())
                .log(Level.INFO, "\n\n[O] Moldeando Pizza Delgada.");
        // Pizza delgada
        factory = new FactoryPizzaIntegral();
        proceso(factory, tam, ingredientes);

        Logger.getLogger(PreparadorPizza.class.getName())
                .log(Level.INFO, "\n\n[1] Moldeando Pizza Gruesa.");
        // Pizza gruesa
        factory = new FactoryPizzaIntegral();
        proceso(factory, tam, ingredientes);

        Logger.getLogger(PreparadorPizza.class.getName())
                .log(Level.INFO, "\n\n[2] Moldeando Pizza Integral.");
        // Pizza integral
        factory = new FactoryPizzaIntegral();
        proceso(factory, tam, ingredientes);
    }

    public void proceso(IFactoryPizza factory, Tamano tam, Ingrediente[] ingredientes) throws ExcepcionParametrosInvalidos{
        IAmasadorPizza am_integral = factory.createAmasadorPizza();
        IHorneadorPizza hpd_integral = factory.createHorneadorPizza();
        IMoldeadorPizza mp_integral = factory.createMoldeadorPizza();
        am_integral.amasar();
        if (tam == Tamano.PEQUENO) {
            mp_integral.moldearPizzaPequena();
        } else if (tam == Tamano.MEDIANO) {
            mp_integral.molderarPizzaMediana();
        } else {
            throw new ExcepcionParametrosInvalidos("Tamano de piza invalido:"+tam);
        }
        aplicarIngredientes(ingredientes);
        hpd_integral.hornear();
    }

    private void aplicarIngredientes(Ingrediente[] ingredientes) {
        Logger.getLogger(PreparadorPizza.class.getName())
                .log(Level.INFO, "APLICANDO INGREDIENTES!:{0}", Arrays.toString(ingredientes));
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}
