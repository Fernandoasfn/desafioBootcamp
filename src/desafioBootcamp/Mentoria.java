package desafioBootcamp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo{
	
	private LocalDate data = LocalDate.now();
	
	public Mentoria(String titulo, String descricao) {
		super(titulo, descricao);
	}
	
	@Override
	public int calcularXp() {
		return XP + 40;
	}
	

	@Override
	public String toString() {
		return "Mentoria\n"
				+ "data: " + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) 
				+ "\ntitulo: " + titulo 
				+ "\ndescrição: " + descricao 
				+ ", xp: " + calcularXp() + "\n";
	}

}
