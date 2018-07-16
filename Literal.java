package Trabalho1;
/**
 * @author Marcos Paulo de Castro
 */

public class Literal
{
/*
 * Classe que verifica qual é o caractere literal válido.
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
