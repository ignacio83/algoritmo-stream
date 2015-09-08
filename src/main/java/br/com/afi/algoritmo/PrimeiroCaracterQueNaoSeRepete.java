package br.com.afi.algoritmo;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Algoritmo que encontra o primeiro caracter que não se repete em uma {@link Stream}.
 * 
 * @author André de Fontana Ignacio
 * @version 1.0
 */
public class PrimeiroCaracterQueNaoSeRepete {

	/**
	 * Executa o algoritmo.
	 * 
	 * @param stream Stream
	 * @return Primeiro caracter que não se repete
	 */
	public Character executa(Stream stream){
		final Map<Character,Integer> map = contaCaracteres(stream);
		return getPrimeiroSemRepeticao(map);
	}
	
	/**
	 * Conta a quantidade de vezes que cada um dos caracteres aparece na {@link Stream}.
	 * 
	 * @param stream Stream
	 * @return Map, onde a chave é o caracter e o valor é quantidade de vezes que o caracter aparece.
	 */
	private Map<Character,Integer> contaCaracteres(Stream stream){
		final Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		
		//Conta a quantidade de cada caracter
		while(stream.hasNext()){
			final char c = stream.getNext();
			int qtd;
			if(map.containsKey(c)){
				qtd = map.get(c);
				qtd++;
			}
			else{
				qtd = 1;
			}
			map.put(c, qtd);
		}
		return map;
	}
	
	/**
	 * Obtém o primeiro carácter que não se repete.
	 * 
	 * @param map Map, onde a chave é o caracter e o valor é quantidade de vezes que o caracter aparece.
	 * @return primeiro carácter que não se repete. 
	 */
	private Character getPrimeiroSemRepeticao(Map<Character,Integer> map){
		for(Map.Entry<Character, Integer> entry : map.entrySet()){
			if(entry.getValue() == 1){
				return entry.getKey();
			}
		}
		return null;
	}
}
