package Trabalho1;
/**
 * @author Marcos Paulo de Castro
 */

public class Separador 
{
/*
 * Classe que verifica se há um separador, entre
 * os caracteres.
 */
    
	public static char mVerificarSeparador(char separador)
    {
        char separadorvalido = ' ';
        if(separador == '(')
        {
        	separadorvalido = '(';
        }
        else if(separador == ')')
        {
        	separadorvalido = ')';
        }
        else if(separador == '[')
        {
        	separadorvalido = '[';
        }
        else if(separador == ']')
        {
        	separadorvalido = ']';
        }
        else if(separador == '{')
        {
        	separadorvalido = '{';
        }
        else if(separador == '}')
        {
        	separadorvalido = '}';
        }
        return separadorvalido;
    }
}
