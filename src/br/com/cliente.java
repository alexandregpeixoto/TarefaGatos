/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com;

import java.util.ArrayList;


/**
 *
 * @author Alexandre
 */
public class cliente {
    private String name;
    private ArrayList<animal> animalExtimacao;
    
    public cliente(String name,animal animalExtimacao,animal animalExtimacao2){
        this.name = name;
        this.animalExtimacao = new ArrayList<animal>();
        this.animalExtimacao.add(animalExtimacao);
        this.animalExtimacao.add(animalExtimacao2);
    }

    public String getName() {
        return name;
    }

    public animal getAnim(int Idx) {
        return this.animalExtimacao.get(Idx);
    }
    
}
