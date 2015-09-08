package br.com.afi.algoritmo;

/**
 * Stream que percorre uma {@link String}.
 * 
 * @author André de Fontana Ignacio
 * @version 1.0
 */
public class StringStream implements Stream{
	private final char[] chars;
	private int i;
	
	/**
	 * Constrói o objeto apartir de uma String.
	 * 
	 * @param str String
	 */
	public StringStream(String str){
		this.chars = str.toCharArray();
	}

	@Override
	public char getNext() {
		return chars[i++];
	}

	@Override
	public boolean hasNext() {
		return i < chars.length;
	}
}
