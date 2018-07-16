package Trabalho1;
/**
 * @author Marcos Paulo de Castro
 */

public class Main
{
/* Classe que dever� ser executada para realizar a an�lise l�xico no arquivo.txt.
 * O arquivo.txt dever� ficar no mesmo diret�rio do pacote. Esse classe foi separada, 
 * das demais a fim de obter a transpar�ncia para o usu�rio, que executar� o analidador 
 * l�xico.
 */
	
	public static void main(String[] args)
	{
		try 
		{
			new Fonte("arquivoErro.txt");
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			System.err.println("Erro ao processar o arquivo, pr�ximo � linha: " + e.getMessage().toString().substring(26,28).trim());
		}
	}
}	