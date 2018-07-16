package Trabalho1;
/**
 * @author Marcos Paulo de Castro
 */

import java.io.*;

public class Fonte
{
/*
 * Classe principal de grande import�ncia, o AFD ser� processado por esta classe.
 * Processa o arquivo.txt, realizando a leitura dos caracteres, das linhas e do arquivo
 * com um todo. Aqui cont�m todas as chamadas dos m�todos do AFD, identificando qual
 * � o caractere, token ou lexema em quest�o.
 */

	@SuppressWarnings("deprecation")
	public Fonte(String f)
    {
        String bufferIn;
        try
        {
        	//Lendo o arquivo.txt de entrada
            DataInputStream in = new DataInputStream(new FileInputStream(f));
            try
            {
            	//Lendo todos os tokens at� o fim do arquivo
                while((bufferIn = in.readLine()) != null)
                {
                    int i = 0;
                    
                    //Remove os espa�os em branco do �nicio e/ou final do arquivo
                    String tokenUnico = bufferIn.trim();
                    
                    //Percorrendo as linhas
                    while(i < tokenUnico.length())
                    {                    	
                    	//Lendo caractere por caractere do token
                        char elementoDoToken = tokenUnico.charAt(i);
                        
                        //Verifica se � um d�gito
                        if(Character.isDigit(elementoDoToken))
                        {
                            String formaLexema = "";
                            formaLexema += elementoDoToken;
                            int j = i+1;
                            
                            while(Character.isDigit(tokenUnico.charAt(j)))
                            {
                            	//Pr�ximo elemento � um n�mero concatena
                            	formaLexema += tokenUnico.charAt(j);
                                j++;
                                
                                //Quebra o token se chegou ao fim da linha
                                if(j == tokenUnico.length())
                                {
                                	break;
                                }
                            }
                            //Movendo a vari�vel i na cadeia
                            i = j;
                            
                            System.out.println("N�mero encontrado: " + formaLexema);
                            continue;
                        }
                        
                        //Verifica se � uma letra
                        else if(Character.isLetter(elementoDoToken))
                        {
                            String formaLexema = "";
                            formaLexema += elementoDoToken;
                            
                            int j = i+1;
                            while(Character.isLetterOrDigit(tokenUnico.charAt(j)))
                            {
                            
                            	// Como o pr�ximo item � uma letra ou d�gito
                            	// Uma vez que as vari�veis podem estar com os n�meros
                            	formaLexema += tokenUnico.charAt(j);
                                j++;
                                
                                if(j == tokenUnico.length())
                                	break;
                            }
                            i = j;
                            
                            //Verifica se � uma palavra reservada
                            if(PalavrasReservadas.mVerificaPalavraReservada(formaLexema))
                            {
                                System.out.println("Palavra reservada encontrada: " + formaLexema);
                            }
                            else
                            {
                                System.out.println("Identificador: " + formaLexema);
                            }
                            continue;
                        }
                        //Sen�o for letra ou n�mero entra
                        else if(!Character.isLetterOrDigit(elementoDoToken))
                        {
                        	//Verifica se � um Separador, retorno true
                            if(ControleOpSep.mVerificarCaractere(elementoDoToken))
                            {
                                System.out.println("Separador encontrado: " + Separador.mVerificarSeparador(elementoDoToken));
                            }
                            
                            //Verifica se � um Operador, retorno false
                            else if(!ControleOpSep.mVerificarCaractere(elementoDoToken))
                            {
                            	if(elementoDoToken == ' ')
                            	{
                            		//System.out.println("Espa�o descartado pelo compilador.");
                            		break;
                            	}
                            	else
                            	{
                            		if(ControleLiteral.mVerificarCaractereLiteral(elementoDoToken))
                            		{
                            			System.out.println("Literal encontrado: " + Literal.mVerificarLiteral(elementoDoToken));
                            		}
                            		else
                            		{
                            			System.out.println("Operador encontrado: " + Operador.mVerificarOperador(elementoDoToken));
                            		}
                            	}
                            }
                            i++;
                            continue;
                        }
                    }
                }
                System.out.println("**************************************");
                System.out.println("***         Fim do Arquivo         ***");
                System.out.println("*** Arquivo compilado com sucesso! ***");
                System.out.println("***                                ***");
                System.out.println("**************************************");
            }
            catch(IOException e)
            {
            	// TODO Auto-generated catch block
				e.printStackTrace();
				System.err.println("*** Erro IOException *** " + e);
            }
        }
        catch(FileNotFoundException e)
        {
        	// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("*** Erro FileNotFoundException *** " + e);
        }
    }    
}