/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import interfaces.Conta;

/**
 *
 * @author josias.soares
 */
public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;

    public double getSelic() {
        return selic;
    }
        
    public AtualizadorDeContas(double selic){
        this.selic = selic;
    }

    public void aplicaTaxa(Conta c){
        imprimeSaldoAnterior(c);
        imprimeSaldoAtual(c);
        this.saldoTotal += c.getSaldo();
    }

    private void imprimeSaldoAtual(Conta c) {
        System.out.println("Saldo atual......: " + c.getSaldo());
    }

    private void imprimeSaldoAnterior(Conta c) {
        System.out.println("Saldo anterior...: " + c.getSaldo());
        c.atualiza(this.selic);
    }

    public double getSaldoTotal(){
            return this.saldoTotal;
    }
}
