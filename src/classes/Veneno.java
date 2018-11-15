/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.IVeneno;

/**
 *
 * @author Luis Guilherme
 */
public class Veneno extends Pokemon implements IVeneno{

    public Veneno() {
    }

    public Veneno(String nome, String tipo, double peso, double altura, int ataque, int forca, int defesa, int agilidade, String ataqueEspecial, int codigo) {
        super(nome, tipo, peso, altura, ataque, forca, defesa, agilidade, ataqueEspecial, codigo);
    }

    @Override
    public void ataqueEspecialVeneno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
