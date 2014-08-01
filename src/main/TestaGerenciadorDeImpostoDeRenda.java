/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Classes.Cliente;
import Classes.ContaCorrente;
import Classes.GerenciadorDeImpostoDeRenda;
import Classes.SeguroDeVida;
import Classes.TipoCliente;

/**
 *
 * @author josias.soares
 */
public class TestaGerenciadorDeImpostoDeRenda {
     public static void main(String args[]){
        GerenciadorDeImpostoDeRenda gerenc = new GerenciadorDeImpostoDeRenda();
        
        SeguroDeVida sv = new SeguroDeVida();
        gerenc.adiciona(sv);
        
        ContaCorrente cc = new ContaCorrente(new Cliente("Josias", TipoCliente.CORPORATIVO));
        cc.deposita(1000);
        gerenc.adiciona(cc);
        
        System.out.println("Total de tributos: " + gerenc.getSomaTributos());
        
    }
    
}
