package br.com.lucas.bonus;

import java.util.ArrayList;

public class Bonus {
    private int bonusMax = 2000;
    private int bonusPadrao = 1000;
    private int limiteSalario = 150000;

    public Bonus(ArrayList<Vendedor> vendedores ,ArrayList<Departamento> departamentos , int elegiveis) throws BonusException {
        if(vendedores.isEmpty() || departamentos.isEmpty()) {
            if (vendedores.isEmpty()) {
                throw new BonusException("Nenhum vendedor cadastrado");
            }else if(departamentos.isEmpty()){
                throw new BonusException("Nenhum departamento cadastrado");
            }
        }else if(elegiveis == 0){
            throw new BonusException("Não há nenhum funcionário elegível a receber bonus máximo no departamento vencedor.");
        }
    }

    public void aplicarBonus(ArrayList<Vendedor> vendedores ,int vencedor){
        for(Vendedor vendedor:vendedores){
            if(vendedor.getDepartamento() == vencedor && vendedor.getSalario() <= limiteSalario){
                vendedor.setSalario(bonusMax);
            }else{
                vendedor.setSalario(bonusPadrao);
            }
            System.out.println("O salario atualizado de " + vendedor.getNome() + " é:" + vendedor.getSalario());
        }
    }

}