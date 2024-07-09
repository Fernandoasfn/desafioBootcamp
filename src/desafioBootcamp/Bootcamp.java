package desafioBootcamp;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {

	private String nome;
	private String descricao;
	private final LocalDate dataInicial = LocalDate.now();
	private final LocalDate dataFinal = dataInicial.plusDays(90);
	
	Set<Conteudo> conteudos = new LinkedHashSet<>();
	Set<Dev> devs = new HashSet<>();
	
	public Bootcamp(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public String getNome() {
		return nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public LocalDate getDataInicial() {
		return dataInicial;
	}
	public LocalDate getDataFinal() {
		return dataFinal;
	}
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	public Set<Dev> getDevs() {
		return devs;
	}
	
		
}
