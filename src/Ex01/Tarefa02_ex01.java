package Ex01;
import javax.swing.JOptionPane;

public class Tarefa02_ex01 
{
	public static void main(String[] args)
	{
		int n1;
		int n2;

		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número maior que o primeiro: "));
		if (n1 < n2)
		{
			System.out.println(mod(n1, n2));
		}
		else
		{
			System.exit(0);
		}
	}

	static int mod(int a, int b) //a == n1 b == n2;
	{
		if(a == (b-1))
		{
			return a-b + 1;
		}
		
		a+= 1;
		return mod(a, b) + a;
	}



	}