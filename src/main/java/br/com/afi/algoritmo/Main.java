package br.com.afi.algoritmo;

/**
 * Classe principal da aplicação.
 * 
 * @author André de Fontana Ignacio
 * @version 1.0
 */
public class Main {
	public static void main(String... args){
		if(args.length==0){
			System.out.println("Informe o texto que deseja utilizar.");
		}
		else{
			final String str = args[0];
			final StringStream stream = new StringStream(str);
			final PrimeiroCaracterQueNaoSeRepete algoritmo = new PrimeiroCaracterQueNaoSeRepete();
			final Character retorno = algoritmo.executa(stream);
			if(retorno!=null){
				System.out.println("Para o texto '" + args[0] + "' o primeiro caracter que não se repete é o '" + retorno + "'.");
			}
			else{
				System.out.println("Para o texto '" + args[0] + "' nenhum caracter não se repete.");
			}
		}
	}
}
