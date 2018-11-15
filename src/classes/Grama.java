/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.IGrama;

/**
 *
 * @author Luis Guilherme
 */
public class Grama extends Pokemon implements IGrama{

    public Grama() {
    }

    public Grama(String nome, String tipo, double peso, double altura, int ataque, int forca, int defesa, int agilidade, String ataqueEspecial, int codigo) {
        super(nome, tipo, peso, altura, ataque, forca, defesa, agilidade, ataqueEspecial, codigo);
    }

    @Override
    public void ataqueEspecialGrama() {
        setAtaqueEspecial("");
    }
    
}