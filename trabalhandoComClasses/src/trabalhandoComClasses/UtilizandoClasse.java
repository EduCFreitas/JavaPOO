package trabalhandoComClasses;

public class UtilizandoClasse {

	public static void main(String[] args) {
		// Vari�veis que ser�o par�metros do m�todo construtor
		String cor="n�o sei";
		String marca="n�o sei tamb�m";
		
		// Instanciando a classe Carro
		// Criando o objeto meuCarro
		Carro meuCarro = new Carro(cor, marca);
		
		// Executando o m�todo
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
