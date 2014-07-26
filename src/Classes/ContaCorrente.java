/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import interfaces.Conta;
import interfaces.ContaTributavel;

/**
 *
 * @author i03
 */
public class ContaCorrente implements ContaTributavel{
    protected Cliente cliente;
    
    public ContaCorrente(Cliente cliente) {
        this.cliente = cliente;

    }

    @Override
    public void deposita(double valor){
        double saldoL = getSaldo();
        saldoL = valor - 0.1;
    }

    @Override
    public double calculaTributos() {
        return (getSaldo() * 0.01);
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void saca(double valor) {

    }

    @Override
    public void atualiza(double taxaSelic) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
