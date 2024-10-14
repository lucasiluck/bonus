import br.com.lucas.bonus.Bonus;
import br.com.lucas.bonus.BonusException;
import br.com.lucas.bonus.Departamento;
import br.com.lucas.bonus.Vendedor;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws BonusException {
        float maiorVenda = 0;
        int vencedor = 0;
        int elegiveis = 0;

        //Gerando uma lista de departamentos
        ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
        departamentos.add(new Departamento(1,0));
        departamentos.add(new Departamento(2,0));
        departamentos.add(new Departamento(3,0));

        //Atribuindo nomes as posições dos departamentos na ArrayList
        Departamento telemarkting = departamentos.get(0);
        Departamento oficina = departamentos.get(1);
        Departamento externo = departamentos.get(2);

        //Gerando uma lista de Vendedores
        ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
        vendedores.add(new Vendedor(1,"Joao",1000000.0f, 1,telemarkting.getId(),30000.0f));
        vendedores.add(new Vendedor(1,"Maria",100000.0f, 1,telemarkting.getId(),20000.0f));
        vendedores.add(new Vendedor(3,"José",100000.0f, 1, oficina.getId(), 20000.0f));
        vendedores.add(new Vendedor(3,"Jean",100000.0f, 1, oficina.getId(), 20000.0f));
        vendedores.add(new Vendedor(3,"Edenilson",100000.0f, 1, externo.getId(), 20000.0f));

        for(Vendedor vendedor:vendedores){
            //Calcula salario de vendedor atualizado com comissão
            vendedor.salario();
            //Passa os valores de vendas dos vendedores para os departamentos
            if(vendedor.getDepartamento() == 1){
                telemarkting.totalVendas(vendedor.getVenda());
            }else if(vendedor.getDepartamento() == 2){
                oficina.totalVendas(vendedor.getVenda());
            }else if(vendedor.getDepartamento() == 3){
                externo.totalVendas(vendedor.getVenda());
            }
        }
        //Verifica departamento com maior numero de vendas
        for(Departamento departamento:departamentos){
            if(departamento.getTotalVendas() > maiorVenda){
                maiorVenda = departamento.getTotalVendas();
                vencedor = departamento.getId();
            }
        }
        //Verifica se há funcionarios elegiveis a receber bonus maximo para erro 2
        for(Vendedor vendedor:vendedores){
            if(vendedor.getDepartamento() == vencedor && vendedor.getSalario() < 150000){
                elegiveis += 1;
            }
        }
        //Gerando Bonus através da Classe Bonus
        try {
            Bonus bonus = new Bonus(vendedores, departamentos , elegiveis);
            bonus.aplicarBonus(vendedores,vencedor);
        }
        catch (BonusException e){
            System.out.println(e.getMessage());
        }
    }
}
