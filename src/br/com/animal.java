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

public class animal {
    private String name;
    String especie;

    public animal(String name){
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public String getEspecie() {
        return especie;
    }    
}