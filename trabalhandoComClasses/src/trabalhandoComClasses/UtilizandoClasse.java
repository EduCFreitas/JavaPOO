package trabalhandoComClasses;

public class UtilizandoClasse {

	public static void main(String[] args) {
		// Variáveis que serão parâmetros do método construtor
		String cor="não sei";
		String marca="não sei também";
		
		// Instanciando a classe Carro
		// Criando o objeto meuCarro
		Carro meuCarro = new Carro(cor, marca);
		
		// Executando o método
		meuCarro.mostraMarcaCor();
		
		// Trocando a cor do carro
		meuCarro.setCor("vermelho");
		meuCarro.mostraMarcaCor();
		
		// Trocando a marca do carro
		marca = "Fiat";
		meuCarro.setMarca(marca);
		meuCarro.mostraMarcaCor();
		
		
	}
}
