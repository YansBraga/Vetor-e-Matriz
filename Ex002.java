import java.util.Scanner;

public class Ex002 
{

	public static void neg(double[] vetor)
	{
		Scanner ler = new Scanner(System.in);
		int c = 0, total=0;
		
		for(int j = 0; j<vetor.length;j++)
		{
			if(vetor[j]<0)
			{
				total++;
			}
		}
		
		double [] vetor2 = new double [total];
		
		for(int b=0; b<vetor.length;b++)
		{
			if(vetor[b]<0)
			{	
				vetor2[c] = vetor[b];
				c++;
			}
		}
		
		for(int k = 0; k<vetor2.length;k++)
		{
			System.out.println(vetor2[k]);
		}
		
	}
	
	public static void vetor()
	{
		Scanner ler = new Scanner(System.in);
		double vetor[] = new double[10];
		
		for(int i=0; i < vetor.length; i++)
		{
			System.out.println("Informe um número: ");
			vetor[i] = ler.nextDouble();
		}
		
		neg(vetor);
	}
	
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		vetor();
		ler.close();
	}

}
