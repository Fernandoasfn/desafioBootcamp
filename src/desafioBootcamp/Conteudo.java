package desafioBootcamp;

public abstract class Conteudo {
	
	protected String titulo;
	protected String descricao;
	protected final int XP = 10;

	public Conteudo(String titulo, String descricao) {
		this.titulo = titulo;
		this.descricao = descricao;
	}
	
	public abstract int calcularXp();
}
