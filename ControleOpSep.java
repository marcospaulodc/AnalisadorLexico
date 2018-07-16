package Trabalho1;
/**
 * @author Marcos Paulo de Castro
 */

public class ControleOpSep 
{
/*
 * Classe de controle na an�lise l�xica, cujo prop�sito � analisar o conte�do
 * de um token, se existe algum s�mbolo Separador retorna true e/ou se existe
 * algum s�mbolo Operador retorna false.
 */

	public static boolean mVerificarCaractere(char c)
    {
    	//Separadores retornam true
        if(c == '(') 
        {
        	return true;
        }
        else if(c == ')')
        {
        	return true;
        }
        else if(c == '[')
        {
        	return true;
        }
        else if(c == ']')
        {
        	return true;
        }
        else if(c == '{')
        {
        	return true;
        }
        else if(c == '}')
        {
        	return true;
        }
        
        //Operadores retornam false
        else if(c == '&')
        {
        	return false;
        }
        else if(c == '|')
        {
        	return false;
        }
        else if(c == '!')
        {
        	return false;
        }
        else if(c == '<')
        {
        	return false;
        }
        else if(c == '-')
        {
        	return false;
        }
        else if(c == '=')
        {
        	return false;
        }
        else if(c == '>')
        {
        	return false;
        }
        else if(c == '+')
        {
        	return false;
        }
        else if(c == '*')
        {
        	return false;
        }
        else if(c == '?')
        {
        	return false;
        }
        else if(c == '/')
        {
        	return false;
        }
        //Espa�o retorna valor default == false
        else return false;
    }
}
