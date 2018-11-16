/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import enums.ETipo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Guilherme
 */
public class Pokedex {
    
    private List<Pokemon> listaPokemon;

    public Pokedex() {
        listaPokemon = new ArrayList<Pokemon>();
    }
    
    public void inserirPokemon(Pokemon pokemon){
            listaPokemon.add(pokemon);
    }
    
    public void removePokemon(String nome){
        Pokemon pkm = buscarPorNome(nome);
        if(pkm != null){
            listaPokemon.remove(pkm);
        }
    }
    
    public Pokemon buscarPorNome(String nome){
        Pokemon pokemon = null;
        for(Pokemon p: listaPokemon){
            if(p.getNome().toLowerCase().equals(nome.toLowerCase())){
                pokemon = p;
            }
        }
        return pokemon;
    }
    
    public Pokemon buscarPorCodigo(int codigo){
        Pokemon pokemon = null;
        for(Pokemon p: listaPokemon){
            if(p.getCodigo() == codigo){
                pokemon = p;
            }
        }
        return pokemon;
    }
    
    public List<Pokemon> buscarPorTipo(String tipo){
        List<Pokemon> pokemon = new ArrayList<Pokemon>();
        for(Pokemon p: listaPokemon){
            if(p.getTipo().toString().equals(tipo.toUpperCase())){
                pokemon.add(p);
            }
        }
        return pokemon;
    }
     
    public void editarPokemon(Pokemon pokemon){
        Pokemon pkm = buscarPorNome(pokemon.getNome());
        if(pkm != null){
            int idx = listaPokemon.indexOf(pkm);
            listaPokemon.set(idx, pokemon);
        }
    }
    
    public List<Pokemon> imprimePokedex(){
        return listaPokemon;
    }
}
