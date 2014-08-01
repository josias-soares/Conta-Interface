/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import interfaces.Conta;
/**
 *
 * @author i03
 */
public class ContaPoupanca implements Conta{
    private double saldo;
    protected Cliente cliente;
    public static final int VALOR_PADRAO_MULTIPLICACAO = 3;
    public static final double VALOR_DESCONTO_DEPOSITO = 0.10;

    public ContaPoupanca(Cliente cliente) {
        this.cliente = cliente;
    }
      
    @Override
    public void atualiza(double taxa){
        this.saldo += ((taxa*VALOR_PADRAO_MULTIPLICACAO)*this.saldo/100);
    }
    
    @Override
    public void deposita(double valor){
        this.saldo = valor - VALOR_DESCONTO_DEPOSITO;
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



    
}
