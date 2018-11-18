/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import enums.ETipo;
import interfaces.IPedra;

/**
 *
 * @author Luis Guilherme
 */
public class Pedra extends Pokemon implements IPedra{

    public Pedra() {
    }

    public Pedra(String nome, ETipo tipo, double peso, double altura, int ataque, int forca, int defesa, int agilidade, int codigo) {
        super(nome, tipo, peso, altura, ataque, forca, defesa, agilidade, codigo);
    }

    

    @Override
    public void ataqueEspecialPedra() {
        setAtaqueEspecial("Lança Pedras");
    }
    
}
