package Trabalho1;
/**
 * @author Marcos Paulo de Castro
 */

public class Literal
{
/*
 * Classe que verifica qual � o caractere literal v�lido.
 */

    public static char mVerificarLiteral(char literal)
    {
    	char literalValido = ' ';
    	if(literal == '_')
    	{
    		literalValido = '_';
    	}
    	else if(literal == '.') 
    	{
    		literalValido = '.';
    	}
    	else if(literal == ',')
    	{
    		literalValido = ',';
    	}
    	else if(literal == ';')
    	{
    		literalValido = ';';
    	}
    	else if(literal == ':')
    	{
    		literalValido = ':';
    	}
    	else if(literal == '"')
    	{
    		literalValido = '"';
    	}
        return literalValido;
    }
}
