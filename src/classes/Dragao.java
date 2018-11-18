/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import enums.ETipo;
import interfaces.IDragao;

/**
 *
 * @author Luis Guilherme
 */
public class Dragao extends Pokemon implements IDragao{

    public Dragao() {
    }

    public Dragao(String nome, ETipo tipo, double peso, double altura, int ataque, int forca, int defesa, int agilidade, int codigo) {
        super(nome, tipo, peso, altura, ataque, forca, defesa, agilidade, codigo);
    }

    

    @Override
    public void ataqueEspecialDragao() {
        setAtaqueEspecial("Garras");
    }
    
}
