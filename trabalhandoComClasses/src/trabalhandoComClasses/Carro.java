package trabalhandoComClasses;

public class Carro {
	// Atributos
	// Lembrar do encapsulamento
	private String cor;
	private String marca;
	// Fim dos atributos
	
	// M�todo construtor
	public Carro(String cor, String marca) {
		this.cor = cor;
		this.marca = marca;
	}
	// Fim do m�todo construtor
	
	// In�cio getters e setters
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	// Fim dos getters e setters
	
	// Outros m�todos da classe Carro
	public void mostraMarca() {
		System.out.println("A marca do carro � "+getMarca());
	}
	
	public void mostraMarcaCor() {
		System.out.println("Meu carro � "+getCor()+" e a marca do carro � "+getMarca());
	}
	// Fim dos outros m�todos
}
