/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com;

/**
 *
 * @author Alexandre
 */
public class veterinario {
    private String name;
    public veterinario(String nome){
        this.name = nome;
    }

    public String getName() {
        return name;
    }
    public Double getValor(){
        return 1.99;
    }
}