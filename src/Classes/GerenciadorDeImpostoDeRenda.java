/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import interfaces.Tributavel;

/**
 *
 * @author josias.soares
 */
public class GerenciadorDeImpostoDeRenda {
    private double totalTributos;
    
    public void adiciona(Tributavel t){
        this.totalTributos += t.calculaTributos();
    }

    public double getSomaTributos() {
        return totalTributos;
    }
}
