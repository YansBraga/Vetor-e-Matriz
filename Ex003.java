import java.util.Scanner;

public class ex003 
{

	public static void inter(int vetor1[], int vetor2[])
	{
		int [] vetint = new int[8];
		
		for(int i=0, j=0, k=0;i<vetint.length;i++)
		{
			if(i%2 == 0) 
			{
				vetint[i] = vetor1[j];
				j++;
			}
			
			else 
			{
				vetint[i] = vetor2[k];
				k++;
			}			
		}
		
		for(int i=0; i<vetint.length;i++)
		{
			 System.out.println(vetint[i]);
		}
	}
	
	public static void chamar()
	{
		Scanner ler = new Scanner(System.in);
		int[] vetor1 = new int[4];
		int[] vetor2 = new int[4];
		
		for(int i=0;i<vetor1.length;i++)
		{
			System.out.println("Insira o valor do 1° vetor: ");
			vetor1[i] = ler.nextInt();
		}
		
		for(int i=0;i<vetor2.length;i++)
		{
			System.out.println("Insira o valor do 2° vetor: ");
			vetor2[i] = ler.nextInt();
		}
		
		inter(vetor1, vetor2);
	}
	
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		chamar();
		ler.close();

	}

}
