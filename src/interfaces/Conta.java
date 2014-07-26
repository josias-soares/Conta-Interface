/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;

import Classes.Cliente;
import Classes.TipoCliente;

/**
 *
 * @author i03
 */
public interface Conta {
    public static double saldo = 0;
    public static Cliente cliente = new Cliente(null, null);
    
    double getSaldo();
    void deposita(double valor);
    void saca(double valor);
    void atualiza(double taxaSelic);
    
}
