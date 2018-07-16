package Trabalho1;
/**
 * @author Marcos Paulo de Castro
 */

public class PalavrasReservadas 
{
/*
 * Classe cujo prop�sito � checar se a palavra lida no arquivo.txt
 * � reservada ou n�o, se sim retorna verdadeira, sen�o retorna
 * false, foi utilizado o m�todo nativa IgnoreCase() para tratar
 * palavras reservadas mai�sculas ou min�sculas.
 */

    public static boolean mVerificaPalavraReservada(String palavraReservada)
    {
        if(palavraReservada.equalsIgnoreCase("final")) 
        {
        	return true;
        }
        else if(palavraReservada.equalsIgnoreCase("int"))
        {
        	return true;
        }
        else if(palavraReservada.equalsIgnoreCase("byte"))
        {
        	return true;
        }
        else if(palavraReservada.equalsIgnoreCase("string"))
        {
        	return true;
        }
        else if(palavraReservada.equalsIgnoreCase("while"))
        {
        	return true;
        }
        else if(palavraReservada.equalsIgnoreCase("if"))
        {
        	return true;
        }
        else if(palavraReservada.equalsIgnoreCase("else"))
        {
        	return true;
        }
        else if(palavraReservada.equalsIgnoreCase("begin"))
        {
        	return true;
        }
        else if(palavraReservada.equalsIgnoreCase("endwhile"))
        {
        	return true;
        }
        else if(palavraReservada.equalsIgnoreCase("endif"))
        {
        	return true;
        }
        else if(palavraReservada.equalsIgnoreCase("endelse"))
        {
        	return true;
        }
        else if(palavraReservada.equalsIgnoreCase("readln"))
        {
        	return true;
        }
        else if(palavraReservada.equalsIgnoreCase("write"))
        {
        	return true;
        }
        else if(palavraReservada.equalsIgnoreCase("writeln"))
        {
        	return true;
        }
        else if(palavraReservada.equalsIgnoreCase("true"))
        {
        	return true;
        }
        else if(palavraReservada.equalsIgnoreCase("false"))
        {
        	return true;
        }
        else if(palavraReservada.equalsIgnoreCase("boolean"))
        {
        	return true;
        }
        else 
        {
        	return false;
        }
    }
}
