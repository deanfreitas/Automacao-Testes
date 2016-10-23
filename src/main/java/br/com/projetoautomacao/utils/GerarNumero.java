package br.com.projetoautomacao.utils;

/**
 * @author erik.borowik.rosa
 *
 */
public class GerarNumero {

	public static int gerarNumeroInteiro(int qtdNumero){
		int numeros[]= new int[qtdNumero];
		for(int i=0;i<qtdNumero ;i++){
			numeros[i] = (int)Math.round(Math.random() * 9);
		}
		String num="";
		for (int i : numeros) {
			num = num.concat(Integer.toString(i));
		}
		return Integer.parseInt(num);
	}

}
