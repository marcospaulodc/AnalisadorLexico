package Trabalho1;
/**
 * @author Marcos Paulo de Castro
 */

public class Operador 
{
/*
 * Classe que verifica se o caractere � um operador, foi inclu�da nessa
 * classe todas as verifica��es de s�mbolos que s�o um operador,
 * se o s�mbolo foi encontrado, ele � retornado.
 */

    public static char mVerificarOperador(char operador)
    {
    	char operadorValido = ' ';
    	if(operador == '&')
    	{
    		operadorValido = '&';
    	}
    	else if(operador == '|')
    	{
    		operadorValido = '|';
    	}
    	else if(operador == '!')
    	{
    		operadorValido = '!';
    	}
    	else if(operador == '<')
    	{
    		operadorValido = '<';
    	}
    	else if(operador == '-')
    	{
    		operadorValido = '-';
    	}
    	else if(operador == '=')
    	{
    		operadorValido = '=';
    	}
    	else if(operador == '>')
    	{
    		operadorValido = '>';
    	}
    	else if(operador == '+')
    	{
    		operadorValido = '+';
    	}
    	else if(operador == '*')
    	{
    		operadorValido = '*';
    	}
    	else if(operador == '?')
    	{
    		operadorValido = '?';
    	}
    	else if(operador == '/')
    	{
    		operadorValido = '/';
    	}
        return operadorValido;
    }
}
