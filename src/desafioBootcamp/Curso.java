package desafioBootcamp;

public class Curso extends Conteudo{

	private int cargaHoraria;

	public Curso(String titulo, String descricao, int cargaHoraria) {
		super(titulo, descricao);
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public int calcularXp() {
		return XP * cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso \n" 
				+ "titulo: " + titulo 
				+ "\ndescricao: " + descricao 
				+ "\nxp: " + calcularXp()
				+ "\ncarga horário: " + cargaHoraria + "\n";
	}
	
}
