package Ex04;

import javax.swing.JOptionPane;

public class Tarefa02_ex04
{
	
	public static void main(String[] args) 
	{	String texto;
		 texto = JOptionPane.showInputDialog("Digite uma palavra para verificação");
		System.out.println(Palin(texto)); 
	}
	
	
	static boolean Palin(String txt)
	{
		int numbercaracter = txt.length();
		if (numbercaracter == 0) 
		{
			return true;
		}
		return PalinRec(txt, 0, numbercaracter - 1);
	}
	static boolean PalinRec(String tex, int s, int numbchar)
	{
		if (s == numbchar)
		{
			return true;
		}
		if ((tex.charAt(s)) != (tex.charAt(numbchar)))
		{
			return false;
		}
		if (s < numbchar + 1) 
		{
			return PalinRec(tex, s + 1, numbchar - 1);
			
		}
		return true;
	}
}
