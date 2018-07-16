package Trabalho1;
/**
 * @author Marcos Paulo de Castro
 */

public class ControleOpSep 
{
/*
 * Classe de controle na análise léxica, cujo propósito é analisar o conteúdo
 * de um token, se existe algum símbolo Separador retorna true e/ou se existe
 * algum símbolo Operador retorna false.
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
        //Espaço retorna valor default == false
        else return false;
    }
}
