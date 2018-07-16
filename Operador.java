package Trabalho1;
/**
 * @author Marcos Paulo de Castro
 */

public class Operador 
{
/*
 * Classe que verifica se o caractere é um operador, foi incluída nessa
 * classe todas as verificações de símbolos que são um operador,
 * se o símbolo foi encontrado, ele é retornado.
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
