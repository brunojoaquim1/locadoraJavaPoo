package locadora_carros;

/**
 *
 * @author Bruno
 */
public abstract class Carro {
    protected String placa;
    protected int modelo;
    protected double valor_base;
    protected double valor_final;
    protected boolean disponivel;
    protected int ano;
    protected int codCad;
    
    public abstract double setaPrecoFinal(int _ano, double _valor_base);

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getValor_base() {
        return valor_base;
    }

    public void setValor_base(double valor_base) {
        this.valor_base = valor_base;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Carro(String placa, int modelo, double valor_base, int ano, int codCad) {
        this.placa = placa;
        this.modelo = modelo;
        this.valor_base = valor_base;
        this.ano = ano;
        this.codCad = codCad;
        this.disponivel = true;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public double getValor_final() {
        return valor_final;
    }

    public int getCodCad() {
        return codCad;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    
    
}
