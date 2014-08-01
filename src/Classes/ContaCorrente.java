/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import interfaces.ContaTributavel;

/**
 *
 * @author i03
 */
public class ContaCorrente implements ContaTributavel{
    private double saldo;
    protected Cliente cliente;
    
    public ContaCorrente(Cliente cliente) {
        this.cliente = cliente;

    }

    private Cliente getCliente() {
        return cliente;
    }
    
    @Override
    public void deposita(double valor){
        this.saldo += valor - 0.1;
    }


    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        }
    }

    @Override
    public void atualiza(double taxaSelic) {
        this.saldo += ((taxaSelic*getCliente().getTipoCliente().getFatorMultiplicacao())*this.saldo/100);
    }

    @Override
    public double calculaTributos() {
        return (getSaldo() * 0.01);
    }


}
