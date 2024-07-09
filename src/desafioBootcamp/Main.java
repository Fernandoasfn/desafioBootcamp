package desafioBootcamp;

public class Main {

	public static void main(String[] args) {
		
		Mentoria mentoriaAbertura = new Mentoria("Mentoria Abertura",
		"Sejam bem vindos ao bootcamp Java da DIO");
		
		Curso logicaProgramacao = new Curso("Lógica de Programação",
		"Conceitos sobre variáveis, estruturas de repetição e codicionais", 10);
		
		Curso introducaoJava = new Curso("Introdução ao Java",
		"JVM, JDK e ferramentas IDE's", 20);
		
		Curso logicaEmJava = new Curso("Lógica aplicada ao Java",
		"variáveis em Java, condicionais if e else e switch, laços while e for", 20);
		
		Curso poo = new Curso("Orientação a Objetos",
		"Conceito de classes, objetos, herança, polimorfismo e encapsulamento", 30);
		
		Mentoria mentoriaEncerramento = new Mentoria("Mentoria Final",
		"Parabéns por ter chegado até aqui. O básico já foi!");
	
		Bootcamp bootcamp = new Bootcamp("Bootcamp Java", "Bootcamp DIO sobre Java e suas aplicações.");
		bootcamp.conteudos.add(mentoriaAbertura);
		bootcamp.conteudos.add(logicaProgramacao);
		bootcamp.conteudos.add(introducaoJava);
		bootcamp.conteudos.add(logicaEmJava);
		bootcamp.conteudos.add(poo);
		bootcamp.conteudos.add(mentoriaEncerramento);
		
		Dev fernando = new Dev("Fernando");
		fernando.inscreverBootcamp(bootcamp);
		
		fernando.progredir(mentoriaAbertura);
		fernando.progredir(logicaProgramacao);
		fernando.progredir(introducaoJava);
		fernando.progredir(logicaEmJava);
		
		fernando.exibirCursos();
		
		System.out.println("Seu Xp total é de: " + fernando.calcularXpTotal());
		
	}

}
