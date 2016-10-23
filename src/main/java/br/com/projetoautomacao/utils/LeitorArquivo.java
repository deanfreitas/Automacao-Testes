package br.com.projetoautomacao.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LeitorArquivo {
	
	private Map<String, String> map = new HashMap<String, String>();
    private String arquivo;
    
    /**
     * No construtor da classe deve ser passado o caminho do arquivo a ser lido
     * O arquivo � lido apenas no construtor, evitando acesso ao disco, salvo se o m�todo lerArquivo() for chamado novamente
     * @param arquivo 
     */
    public LeitorArquivo(String arquivo) {
        lerArquivo(arquivo);
    }

    /**
     * For�a a releitura do arquivo
     */
    public void lerArquivo() {
        leituraArquivo();
    }
    
    /**
     * For�a a releitura do arquivo, passando como par�metro um novo arquivo
     * @param arquivo 
     */
    public void lerArquivo(String arquivo){
        this.arquivo=arquivo;
        leituraArquivo();
    }
    
    /**
     * M�todo que realiza a leitura do arquivo, verifica as linhas e salva na lista
     */
    private void leituraArquivo(){
        
        try {
            FileReader fileReader = new FileReader(arquivo);
            BufferedReader leitor = new BufferedReader(fileReader);
            
            String linha=null;
            
            while (leitor.ready()) {
                 linha = leitor.readLine();
                
                 if (!linha.startsWith("//")){
	             
                	if (!linha.contains("="))
	                    break;
	                
	                if (linha.charAt(0)=='#' || linha.charAt(0)=='=')
	                    break;
	                
	                String temp[] = linha.split("=");
	                                
	                map.put(formataChave(temp[0]), temp[1]);
	                
                }
            }
            
            fileReader.close();
            leitor.close();

        } catch (FileNotFoundException e) {
            
        } catch (IOException e) {
            
        }
        
    }
    
    /**
     * Formata a chave para min�sculo e sem espa�os
     */
    private String formataChave(String chave){
        
        chave=chave.toLowerCase();
        chave=chave.replaceAll(" ", "");
        
        return chave;
    }
    
    /**
     * Recupera um valor, passando a chave como par�metro
     * @param chave
     * @return valor
     */
    public String get(String chave) {
        return (String) map.get(formataChave(chave));
    }
    
    /**
     * Recupera um valor, passando a chave como par�metro
     * Retorna um valor padr�o caso a chave n�o seja encontrada
     * @param chave
     * @param valor padr�o
     * @return valor
     */
    public String get(String chave, String padrao){
        String r = get(chave);
        
        if (r==null)
            r=padrao;
        
        return r;
    }
    
    /*
     * Recupera a lista completa
     */
    public Map<String, String> getList(){
        return map;
    }

}
