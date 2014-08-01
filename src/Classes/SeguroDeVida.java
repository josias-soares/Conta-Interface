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
public class SeguroDeVida implements Tributavel{

    @Override
    public double calculaTributos() {
        return 42;
    }
    
}
