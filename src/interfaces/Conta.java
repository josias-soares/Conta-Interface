/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;

/**
 *
 * @author i03
 */
public interface Conta {  
    double getSaldo();
    void deposita(double valor);
    void saca(double valor);
    void atualiza(double taxaSelic);
    
}
