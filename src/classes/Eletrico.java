/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import enums.ETipo;
import interfaces.IEletrico;

/**
 *
 * @author Luis Guilherme
 */
public class Eletrico extends Pokemon implements IEletrico{

    public Eletrico() {
    }

    public Eletrico(String nome, ETipo tipo, double peso, double altura, int ataque, int forca, int defesa, int agilidade, int codigo) {
        super(nome, tipo, peso, altura, ataque, forca, defesa, agilidade, codigo);
    }

    

    @Override
    public void ataqueEspecialEletrico() {
        setAtaqueEspecial("Choque do Trovão");
    }
    
}
