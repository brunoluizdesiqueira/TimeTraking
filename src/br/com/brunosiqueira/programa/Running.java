package br.com.brunosiqueira.programa;

import br.com.brunosiqueira.modelo.Membro;
import br.com.brunosiqueira.modelo.Projeto;
import br.com.brunosiqueira.modelo.StatusPessoa;
import br.com.brunosiqueira.modelo.Tarefa;
import br.com.brunosiqueira.modelo.TimeTracking;

public class Running {

	public static void main(String[] args) {
		
		// Criando um novo membro
		Membro bruno = new Membro("Bruno", StatusPessoa.Ativo, "brunoluizdesiqueira@gmail.com", "123456", "bruno");		   
		System.out.println("Membro: " + bruno.getNome());
		
		Membro amanda = new Membro("Amanda", StatusPessoa.Ativo, "amanda.manso@icloud.com", "654321", "amanda");		   
		System.out.println("Membro: " + amanda.getNome());
				
		// Criando um novo projeto
		Projeto erp = new Projeto("Bimer Project");
		erp.setMembro(amanda);
		erp.setMembro(bruno);
		erp.setResponsavel(bruno);
		// Criando uma nova tarefa e atribuindo ao projeto
		erp.setTarefas(new Tarefa("Tarefa de criação do Emissor MDF-e"));
		erp.setTarefas(new Tarefa("Tarefa de criação do Emissor CT-e"));
		
		System.out.println(erp.getMembros().toString() + " " + erp.getTarefa());
		
		// Criando a class TimeTracking
		TimeTracking timeTracking = new TimeTracking(erp, "Teste time tracking");		
		timeTracking.getTimeLine().registrar();
			
		System.out.println(timeTracking.getTimeLine().retornaTempo());	
			
	}

}
