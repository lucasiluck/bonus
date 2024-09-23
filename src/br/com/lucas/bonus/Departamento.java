package br.com.lucas.bonus;

public class Departamento {
    private int id;
    private float vendas;

    public Departamento(int id,float vendas){
        this.id = id;
        this.vendas = vendas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void totalVendas(float vendas){
        this.vendas += vendas;
    }
    public float getTotalVendas(){
        return this.vendas;
    }


}
