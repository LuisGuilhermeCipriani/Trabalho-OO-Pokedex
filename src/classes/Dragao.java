/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.IDragao;

/**
 *
 * @author Luis Guilherme
 */
public class Dragao extends Pokemon implements IDragao{

    public Dragao() {
    }

    public Dragao(String nome, String tipo, double peso, double altura, int ataque, int forca, int defesa, int agilidade, String ataqueEspecial, int codigo) {
        super(nome, tipo, peso, altura, ataque, forca, defesa, agilidade, ataqueEspecial, codigo);
    }

    @Override
    public void ataqueEspecialDragao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
