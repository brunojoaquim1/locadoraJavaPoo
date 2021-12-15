/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora_carros;


    import java.util.Date;
    import java.util.GregorianCalendar;
    import java.util.Calendar;
    import java.text.SimpleDateFormat;



/**
 *
 * @author Bruno
 */
public class Testes {
        private Cliente cliente;
        private Carro   carro;
        private int dias_aluguel;
        private double valor_total;
        private Date data_devolucao_prevista;

    public void teste_retorno()throws Exception{
           
           GregorianCalendar vencimento =  new GregorianCalendar(); //instancia calendário gregoriano
           vencimento.add(Calendar.DAY_OF_MONTH, 10);     //Soma data atual com o valor informador de dias previstos no aluguel
           /**
           * Instancia objeto de data simples para ser utilizado no fator de comparação posteriormente
           */
           SimpleDateFormat  simpleDate_vencimento = new SimpleDateFormat("dd/MM/yyyy");  
           String vencimentoString = simpleDate_vencimento.format(vencimento.getTime()); // Faz conversão do Gregoriano para String
           
           Date date_vencimento =new SimpleDateFormat("dd/MM/yyyy").parse(vencimentoString); //Converte o string pra DateSimples

           System.out.println("Data Final:" + date_vencimento);

    }
}
