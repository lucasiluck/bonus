package br.com.lucas.bonus;

import java.util.ArrayList;

public class Bonus {
    private int bonusMax = 2000;
    private int bonusPadrao = 1000;
    private int limiteSalario = 150000;

    public Bonus(ArrayList<Vendedor> vendedores) throws BonusException {
        if (vendedores.isEmpty()) {
            throw new BonusException("Nenhum vendedor cadastrado");
        }
    }
}