/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

/**
 *
 * @author i03
 */

public enum TipoCliente {
    UNIVERSITÁRIO("Universitário",2),
    CORPORATIVO("Corporativo",3),
    EXCLUISIVO("Exclusivo", 4),
    VIP("Vip", 5);

    private TipoCliente( String descricao, int fatorMultiplicacao) {
        this.fatorMultiplicacao = fatorMultiplicacao;
        this.descricao = descricao;
    }
     
    private int fatorMultiplicacao;
    private String descricao;

    public int getFatorMultiplicacao() {
        return fatorMultiplicacao;
    }

    public String getDescricao() {
        return descricao;
    }
    
    
}