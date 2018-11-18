/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import enums.ETipo;
import interfaces.IFada;

/**
 *
 * @author Luis Guilherme
 */
public class Fada extends Pokemon implements IFada{

    public Fada() {
    }

    public Fada(String nome, ETipo tipo, double peso, double altura, int ataque, int forca, int defesa, int agilidade, int codigo) {
        super(nome, tipo, peso, altura, ataque, forca, defesa, agilidade, codigo);
    }

    

    @Override
    public void ataqueEspecialFada() {
        setAtaqueEspecial("Brilho");
    }
    
}
