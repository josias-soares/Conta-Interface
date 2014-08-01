/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Classes.Cliente;
import Classes.ContaCorrente;
import Classes.TipoCliente;
import interfaces.Tributavel;

/**
 *
 * @author josias.soares
 */
public class TesteTributavel {
    public static void main(String args[]){
        ContaCorrente cc  = new ContaCorrente(new Cliente("Josias",TipoCliente.UNIVERSITÁRIO));
        cc.deposita(1000);
        System.out.println(cc.calculaTributos());
        
        //Testando o polimorfismo
        Tributavel t = cc;
        System.out.println(t.calculaTributos());
        
        
    }
}
