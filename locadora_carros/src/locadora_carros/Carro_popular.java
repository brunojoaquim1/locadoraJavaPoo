/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora_carros;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Bruno
 * Regra de Preço Final, Carros pupulares: para carros populares, o valor base é 
 * reduzido em 7% para cada ano de idade do modelo, limitado a um desconto de 21%
 */
public class Carro_popular extends Carro{
    
    GregorianCalendar gc = new GregorianCalendar();
    
    //private double valor_final;

    public Carro_popular(String placa, int modelo, double valor_base, int ano, int codCad) {
        super(placa, modelo, valor_base, ano, codCad);
        
        this.valor_final = setaPrecoFinal(this.ano,this.valor_base);
        
    }
    
    @Override
    public double setaPrecoFinal(int _ano, double _valor_base){
        double valor_max_desc;
        double i_valor_final;
        int ano_atual ;
        int ix;
        int a = 7;
        int b = 21;

        ano_atual = gc.get(Calendar.YEAR);
        
        valor_max_desc = (_valor_base -((_valor_base * b)/100));
        
        ix = ((ano_atual - _ano )* a);
        
        i_valor_final = _valor_base - ((_valor_base * ix)/100);     
        
        if (i_valor_final < valor_max_desc) {
            i_valor_final = valor_max_desc ;
        } 
        
        return i_valor_final;     
    }
    
    public void mostraDetalhes(){
         System.out.println("PLACA: " + this.placa);
          System.out.println("VALOR BASE: " + this.valor_base);
           System.out.println("VALOR FINAL:" + this.valor_final);
    
    }
    
}
