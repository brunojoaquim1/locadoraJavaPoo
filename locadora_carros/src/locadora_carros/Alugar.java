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
public class Alugar {
    
    private Cliente cliente;
    private Carro   carro;
    private int dias_aluguel;
    private double valor_total_previsto;
    private double valor_total_realizado;
    private Date data_devolucao_prevista;
    private boolean atrasado;


    public Alugar(Carro _carro, Cliente _cliente, int _diasAluguel)throws Exception{
       if(_carro.disponivel){
           this.dias_aluguel = _diasAluguel;
           this.cliente = _cliente;
           this.carro   = _carro;
           carro.setDisponivel(false);
           this.setAtrasado(false);
           this.valor_total_previsto = carro.getValor_final() * dias_aluguel;
           
           GregorianCalendar vencimento =  new GregorianCalendar(); //instancia calendário gregoriano
           vencimento.add(Calendar.DAY_OF_MONTH, _diasAluguel);     //Soma data atual com o valor informador de dias previstos no aluguel
           /**
           * Instancia objeto de data simples para ser utilizado no fator de comparação posteriormente
           */
           SimpleDateFormat  simpleDate_vencimento = new SimpleDateFormat("dd/MM/yyyy");  
           String vencimentoString = simpleDate_vencimento.format(vencimento.getTime()); // Faz conversão do Gregoriano para String
           
           Date date_vencimento =new SimpleDateFormat("dd/MM/yyyy").parse(vencimentoString); //Converte o string pra DateSimples

           this.data_devolucao_prevista = date_vencimento;

       }   
    }       
    public void devolver_carro(String _data_devolucao_realizada)throws Exception{
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(_data_devolucao_realizada);
        carro.setDisponivel(true);
        
        if (date1.after(this.data_devolucao_prevista)) {
                this.setAtrasado(true);
                valor_total_realizado = valor_total_previsto + (valor_total_previsto * 0.1);
            }else{
                this.setAtrasado(false);
                this.valor_total_realizado = this.valor_total_previsto;
            }
    }   
         

    public Date getData_devolucao_prevista(){
        return data_devolucao_prevista;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public int getDias_aluguel() {
        return dias_aluguel;
    }

    public void setDias_aluguel(int dias_aluguel) {
        this.dias_aluguel = dias_aluguel;
    }

    public double getValor_total_previsto() {
        return valor_total_previsto;
    }

    public void setValor_total_previsto(double valor_total_previsto) {
        this.valor_total_previsto = valor_total_previsto;
    }

    public double getValor_total_realizado() {
        return valor_total_realizado;
    }

    public void setValor_total_realizado(double valor_total_realizado) {
        this.valor_total_realizado = valor_total_realizado;
    }

    public void setData_devolucao_prevista(Date data_devolucao_prevista) {
        this.data_devolucao_prevista = data_devolucao_prevista;
    }

    public boolean isAtrasado() {
        return atrasado;
    }

    public void setAtrasado(boolean atrasado) {
        this.atrasado = atrasado;
    }
    
    
}
    

