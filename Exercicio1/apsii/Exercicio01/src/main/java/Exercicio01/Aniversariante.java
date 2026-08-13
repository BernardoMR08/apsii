package Exercicio01;

public class Aniversariante {
	private String nome;
	private DataAniversario dataAniversario;
	
	//gets e sets...
	public String getNome(){
		return this.nome;
	}

	public DataAniversario getDataAniversario(){
		return this.dataAniversario;
	}

	public Aniversariante(String nome, int dia, int mes){
		this.nome = nome;
		this.dataAniversario = new DataAniversario(dia, mes);
	}
	public Aniversariante(String nome, DataAniversario dataAniversaio){
		this.nome = nome;
		this.dataAniversario = dataAniversaio;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Aniversariante)) return false;

		Aniversariante outro = (Aniversariante) obj;
		return this.nome.equalsIgnoreCase(outro.nome) && this.dataAniversario.equals(outro.dataAniversario);
	}
}
