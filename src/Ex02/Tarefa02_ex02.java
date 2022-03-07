package Ex02;
import javax.swing.JOptionPane;
public class Tarefa02_ex02 
{
	public static void main(String[] args)
	{

		int n1;
		int n2;

		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número maior que o primeiro: "));
		if (n1 < n2)
		{
			System.out.println(mult(n1, n2));
		}
		else
		{
			System.exit(0);
		}



	}
	
	static int mult (int a, int b) //a == n1 b == n2;
	{
		if ( b == 0 )
		{
			return 0;
		}
		else
		{
			b -= 1;
			return mult(a, b) + a ;
		}
	}



}

