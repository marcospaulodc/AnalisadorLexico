package Trabalho1;
/**
 * @author Marcos Paulo de Castro
 */

public class ControleLiteral 
{
/*
 * Classe de controle, que an�lise se o caractere em quest�o � um
 * literal, se sim retorna true.
 */

	public static boolean mVerificarCaractereLiteral(char c)
    {
        if(c == '_') 
        {
        	return true;
        }
        else if(c == '.')
        {
        	return true;
        }
        else if(c == ',')
        {
        	return true;
        }
        else if(c == ';')
        {
        	return true;
        }
        else if(c == ':')
        {
        	return true;
        }
        else if(c == '"')
        {
        	return true;
        }
        else return false;
    }
}
