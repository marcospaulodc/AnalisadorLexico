package Trabalho1;
/**
 * @author Marcos Paulo de Castro
 */

public class Main
{
/* Classe que deverá ser executada para realizar a análise léxico no arquivo.txt.
 * O arquivo.txt deverá ficar no mesmo diretório do pacote. Esse classe foi separada, 
 * das demais a fim de obter a transparência para o usuário, que executará o analidador 
 * léxico.
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
			System.err.println("Erro ao processar o arquivo, próximo à linha: " + e.getMessage().toString().substring(26,28).trim());
		}
	}
}	