/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import enums.ETipo;
import interfaces.INormal;

/**
 *
 * @author Luis Guilherme
 */
public class Normal extends Pokemon implements INormal{

    public Normal() {
    }

    public Normal(String nome, ETipo tipo, double peso, double altura, int ataque, int forca, int defesa, int agilidade, int codigo) {
        super(nome, tipo, peso, altura, ataque, forca, defesa, agilidade, codigo);
    }

    

    @Override
    public void ataqueEspecialNormal() {
        setAtaqueEspecial("Corrida");
    }
    
}
