/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import enums.ETipo;
import interfaces.ITerra;

/**
 *
 * @author Luis Guilherme
 */
public class Terra extends Pokemon implements ITerra{

    public Terra() {
    }

    public Terra(String nome, ETipo tipo, double peso, double altura, int ataque, int forca, int defesa, int agilidade, int codigo) {
        super(nome, tipo, peso, altura, ataque, forca, defesa, agilidade, codigo);
    }

    

    @Override
    public void ataqueEspecialTerra() {
        setAtaqueEspecial("Areia");
    }
    
}
