import java.util.Scanner;

public class Ex001 
{

	public static void media(double[] vetor) 
	{
		int soma = 0, media, amedia = 0;
		
		for (int i =0; i<vetor.length; i++)
		{
			soma+= vetor[i];
		}
		
		media = soma/vetor.length;
		
		for (int i =0; i<vetor.length; i++)
		{
			if (vetor[i] > media)
			{
				amedia++;
			}
		}
		
		System.out.println("A média é: " + media);
		System.out.println("A quantidade de alunos acima da média é de: " + amedia);
	}
	
	public static void notas()
	{
		Scanner ler = new Scanner(System.in);
		double vetor [] = new double [4];
		
		for(int i=0; i<vetor.length; i++)
		{
			System.out.println("Insira a nota: ");
			vetor[i] = ler.nextDouble();
		}
		
		media(vetor);
	}
	
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		notas();
		ler.close();

	}

}
