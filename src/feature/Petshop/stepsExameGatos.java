/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feature.Petshop;

/**
 *
 * @author Alexandre
 */

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import tutocum.Cat;
import tutocum.Cliente;
import tutocum.Dog;
import tutocum.Recibo;
import tutocum.Veterinario;

public class stepsExameGatos {
        Cliente Traci;
        Veterinario vet;
        Recibo rec;
	@Given("'(.+)' traz seus dois gatos, '(.+)' e '(.+)', para serem castrados")
	public void entrarClinica(final String nomeTraci, final String nomeGato,final String nomeGato2){
		Traci = new Cliente(nomeTraci,new Cat(nomeGato),new Cat(nomeGato2));
	}
	
	@Then("'(.+)' realiza as '(.+)' que tem uma taxa normal de '(\\d+)' reais")
	public void cobrarCastra(final String nomeVet,final String servico, final double valor){
		vet = new Veterinario(nomeVet);
                rec = new Recibo(Traci, vet);
                rec.adicionaServico(servico, valor);
	}
        
        @Then("Traci pega seus gatos naquela noite, mas deseja pagar pelo servico ao final do mes")
	public void pegaGatos(){
	}
        
        @Then("Naquele dia, ela recebe uma unica fatura com os procedimentos detalhadas")
	public void recebeFatura(){
	}
	
	@Then("No final do mes, ela recebe um boleto referente aquela conta, com o qual ela paga pelo servico, entao ela pagou com '(\\d+)' reais a castracao")
	public void pagaEmDinheiroERecebeNotaFiscal(final double total){
                //Assert.assertTrue(rec.getTotal().equals(rec.getTotal()));
                System.out.println(rec.retornaNotaFiscal());
                Assert.assertTrue("Ele nao pagou corretamente",rec.getTotal() > total);
	}
	
}
