/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Alexandre
 */

public class notaFiscal {
    private cliente Traci;
    private veterinario vet;
    private HashMap<String,Double> servicos;

    public notaFiscal(cliente cli, veterinario vet){
        this.Traci = cli;
        this.vet = vet;
        this.servicos = new HashMap<String, Double>();
    }
    
    public cliente getTraci() {
        return Traci;
    }

    public veterinario getVet() {
        return vet;
    }

    public Double getTotal() {
        double total = 0;
        for(Map.Entry<String,Double> entrada: servicos.entrySet()){
            total += entrada.getValue();
        }
        return total;
    }
    
    public void adicionaServico(String titulo,Double valor){
        this.servicos.put(titulo, valor);
    }
    
    public String retornaNotaFiscal(){
        String retorno ="";
        for(Map.Entry<String,Double> entrada: servicos.entrySet()){
            retorno+= "Servico:"+entrada.getKey()+"\nValor:"+entrada.getValue();
        }
        return retorno;
    }
    
}
