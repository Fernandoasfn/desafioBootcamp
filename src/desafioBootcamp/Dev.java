package desafioBootcamp;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {
	
	private String nome;
	Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
	Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	
	
	
	public Dev(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}
	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}
	
	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudosInscritos = bootcamp.getConteudos();
		bootcamp.devs.add(this);
	}
	
	public void progredir(Conteudo conteudo) {
			if(conteudosInscritos.contains(conteudo)) {
				conteudosConcluidos.add(conteudo);
				conteudosInscritos.remove(conteudo);
			}
	}
	
	public int calcularXpTotal() {
		int xpTotal = 0;
		for(Conteudo c: conteudosConcluidos) 
			xpTotal += c.calcularXp();
		return xpTotal;
	}
	
	public void exibirCursos() {
		if(!conteudosInscritos.isEmpty()) {
			System.out.println("*** Conteudos Inscritos ***");
			for(Conteudo c : conteudosInscritos) {
				System.out.println(c.titulo);
			}
		}
		
		if(!conteudosConcluidos.isEmpty()) {
			System.out.println("*** Conteudos Concluidos ***");
			for(Conteudo c : conteudosConcluidos) {
				System.out.println(c.titulo);
			}
		}
	}
	

}
