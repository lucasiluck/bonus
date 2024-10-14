package br.com.lucas.bonus;

public abstract class Funcionario {
    private int id;
    private String nome;
    private double salario;
    private int cargo;
    private int departamento;

    public Funcionario(int id,String nome, float salario, int cargo , int departamento){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
        this.departamento = departamento;

    }

    public float getSalario() {
        return (float) salario;
    }

    public void setSalario(float salario) {
        this.salario = salario+this.salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

}
