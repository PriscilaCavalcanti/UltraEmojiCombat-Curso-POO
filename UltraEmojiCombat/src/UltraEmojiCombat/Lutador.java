package UltraEmojiCombat;

public class Lutador {

	// Atributos
	private String nome;
	private String nacionalicade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias, derrotas, empates;

	// Metodos publicos
	public void apresentar() {

		System.out.println("=======================================================");
		System.out.println("CHEGOU A HORA... APRENSENTAMOS O LUTADOR: " + this.getNome());
		System.out.println("Diretamente de: " + this.getNacionalicade());
		System.out.println("Idade: " + getIdade() + " anos e " + this.getAltura() + " de Altura" );
		//System.out.println("Altura: " + getAltura());
		System.out.println("Pesando: " + getPeso() + " Kg");
		System.out.println("Ganhou: " + getVitorias());
		System.out.println("Perdeu: " + getDerrotas());
		System.out.println("Empatou: " + getEmpates());
		System.out.println("=======================================================");
	}

	public void status() {
		System.out.println("**************** STATUS LUTADOR **************** ");
		System.out.println(this.getNome() + " é um peso " +  this.categoria);
		//System.out.println("É um peso: " + this.categoria);
		System.out.println("Ganhou " + this.getVitorias() + " vezes ");
		System.out.println("Perdeu " + this.getDerrotas() + " vezes ");
		System.out.println("Empatou " + this.getEmpates() + " vezes " );
		System.out.println("=======================================================");
	}

	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}

	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}

	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}

	// Metodos Especiais = Construtor

	public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
		super();
		this.nome = no;
		this.nacionalicade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso(pe);
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;
	}

	// Metodos get set

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalicade() {
		return nacionalicade;
	}

	public void setNacionalicade(String nacionalicade) {
		this.nacionalicade = nacionalicade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	// Categoria é um metodo Interno
	private void setCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "Invalido";
		} else if (this.peso <= 70.3) {
			this.categoria = "Leve";
		} else if (this.peso <= 83.9) {
			this.categoria = "Medio";
		} else if (this.peso <= 120.0) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Invalido";
		}

	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

}
