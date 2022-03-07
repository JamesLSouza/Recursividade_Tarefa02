package Ex03;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Tarefa02_ex03
{

	public static void main(String[] args) 
	{
			
			int []vet;
			int n, resultado;
			n = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de números que deseja colocar no seu vetor "));
			vet = new int[n];
			
			for(int i=0; i<n; i++ )
			{
				vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o número do vetor " + (i+1)));
			}
			
			resultado = smallestNumber(vet, n, 0);
			System.out.println("O menor elemento do vetor ");
			System.out.println(Arrays.toString(vet));
			System.out.printf("é %d", resultado);
		}
		private static int smallestNumber(int vetor[], int size, int index) 
		{
			if(size==0)
			{
				return vetor[index];
			}
			else 
			{
				if(vetor[size-1] < vetor[index]) 
				{
					return smallestNumber(vetor, size-1, size-1);
				}
				else
				{
					return smallestNumber(vetor, size-1, index);
				}
			}
			
		}	

}