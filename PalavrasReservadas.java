package Trabalho1;
/**
 * @author Marcos Paulo de Castro
 */

public class PalavrasReservadas 
{
/*
 * Classe cujo propósito é checar se a palavra lida no arquivo.txt
 * é reservada ou não, se sim retorna verdadeira, senão retorna
 * false, foi utilizado o método nativa IgnoreCase() para tratar
 * palavras reservadas maiúsculas ou minúsculas.
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
