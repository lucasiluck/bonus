package br.com.lucas.bonus;

public class Vendedor extends Funcionario {
    private float venda;

    public Vendedor(int id, float salario, int cargo, int departamento ,float venda) {
        super(id, salario, cargo, departamento);
        this.venda = venda;
    }

    public float getVenda() {
        return venda;
    }

    public void setVenda(float venda) {
        this.venda = venda;
    }

    public float salario(){
        float salario = super.getSalario() + (this.venda*0.1f);
        return salario;
    }


}
