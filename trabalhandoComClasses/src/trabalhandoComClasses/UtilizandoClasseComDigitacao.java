package trabalhandoComClasses;

import java.util.Scanner;

public class UtilizandoClasseComDigitacao {

	public static void main(String[] args) {
		String cor="";
		String marca="";
		
		// Instanciando a classe Carro
		// Criar o objeto carroAluno
		Carro carroAluno = new Carro("","");
		
		// Instanciando a classe Scanner
		Scanner entrada = new Scanner(System.in);
		
		// Recebendo a digitação do usuário
		System.out.print("Informe a cor: ");
		cor = entrada.nextLine();
		carroAluno.setCor(cor);
		
		System.out.print("Informe a marca: ");
		marca = entrada.nextLine();
		carroAluno.setMarca(marca);
		
		// Mostrando os resultados
		carroAluno.mostraMarcaCor();

	}

}
