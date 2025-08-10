
package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.Masa;
import edu.unisabana.pizzafactory.model.Tamano;
import edu.unisabana.pizzafactory.model.AmasadorPizza.IAmasadorPizza;
import edu.unisabana.pizzafactory.model.Exceptions.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.Factories.AmasadorPizzaFactory;
import edu.unisabana.pizzafactory.model.Factories.HorneadorPizzaFactory;
import edu.unisabana.pizzafactory.model.Factories.MoldeadorPizzaFactory;
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
        
        Logger.getLogger(PreparadorPizza.class.getName())
                .log(Level.INFO, "\n\n[O] Moldeando Pizza Delgada.");
        // Pizza delgada
        IAmasadorPizza am_delgada = AmasadorPizzaFactory.createAmasadorPizza(Masa.DELGADA);
        IHorneadorPizza hpd_delgada = HorneadorPizzaFactory.createHorneadorPizza(Masa.DELGADA);
        IMoldeadorPizza mp_delgada = MoldeadorPizzaFactory.createModeladorPizza(Masa.DELGADA);
        am_delgada.amasar();
        if (tam == Tamano.PEQUENO) {
            mp_delgada.moldearPizzaPequena();
        } else if (tam == Tamano.MEDIANO) {
            mp_delgada.molderarPizzaMediana();
        } else {
            throw new ExcepcionParametrosInvalidos("Tamano de piza invalido:"+tam);
        }
        aplicarIngredientes(ingredientes);
        hpd_delgada.hornear();

        Logger.getLogger(PreparadorPizza.class.getName())
                .log(Level.INFO, "\n\n[1] Moldeando Pizza Gruesa.");
        // Pizza gruesa
        IAmasadorPizza am_gruesa = AmasadorPizzaFactory.createAmasadorPizza(Masa.GRUESA);
        IHorneadorPizza hpd_gruesa = HorneadorPizzaFactory.createHorneadorPizza(Masa.GRUESA);
        IMoldeadorPizza mp_gruesa = MoldeadorPizzaFactory.createModeladorPizza(Masa.GRUESA);
        am_gruesa.amasar();
        if (tam == Tamano.PEQUENO) {
            mp_gruesa.moldearPizzaPequena();
        } else if (tam == Tamano.MEDIANO) {
            mp_gruesa.molderarPizzaMediana();
        } else {
            throw new ExcepcionParametrosInvalidos("Tamano de piza invalido:"+tam);
        }
        aplicarIngredientes(ingredientes);
        hpd_gruesa.hornear();

        Logger.getLogger(PreparadorPizza.class.getName())
                .log(Level.INFO, "\n\n[2] Moldeando Pizza Integral.");
        // Pizza integral
        IAmasadorPizza am_integral = AmasadorPizzaFactory.createAmasadorPizza(Masa.INTEGRAL);
        IHorneadorPizza hpd_integral = HorneadorPizzaFactory.createHorneadorPizza(Masa.INTEGRAL);
        IMoldeadorPizza mp_integral = MoldeadorPizzaFactory.createModeladorPizza(Masa.INTEGRAL);
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
