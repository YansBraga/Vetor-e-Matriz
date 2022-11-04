import java.util.Scanner;

public class Ex007 
{

	public static int subab(int matrizA[][], int matrizB[][])
	{
		int matrizD [][] = new int [2][2];
		int sub=0;
		for(int i=0; i<matrizA.length;i++)
		{
			for(int j=0; j<matrizA[0].length;j++)
			{
				sub = matrizA[i][j] - matrizB[i][j];
				matrizD[i][j] = sub;
			}
		}
		
		for(int i=0;i<matrizD.length;i++)
		{
			for(int j=0;j<matrizD[0].length;j++)
			{
				System.out.println(matrizD[i][j]);
			}
		}
		
		return(0);
	}
	
	public static int somaab(int matrizA[][], int matrizB[][])
	{
		int matrizS [][] = new int [2][2];
		int soma=0;
		for(int i=0; i<matrizA.length;i++)
		{
			for(int j=0; j<matrizA[0].length;j++)
			{
				soma = matrizA[i][j] + matrizB[i][j];
				matrizS[i][j] = soma;
			}
		}
		
		for(int i=0;i<matrizS.length;i++)
		{
			for(int j=0;j<matrizS[0].length;j++)
			{
				System.out.println(matrizS[i][j]);
			}
		}
		System.out.println("------------------------");
		return(0);
	}
	
	public static void preencher()
	{
		Scanner ler = new Scanner(System.in);
		int [][]tropical = new int[2][2];
		int [][]camaroes = new int[2][2];
		
		for(int i=0; i<tropical.length;i++)
		{
			for(int j=0;j<tropical[0].length;j++)
			{
				System.out.println("Insira o valor da linha "+(i+1)+" e da coluna "+(j+1));
				tropical[i][j] = ler.nextInt();
			}
		}
		
		for(int i=0; i<camaroes.length;i++)
		{
			for(int j=0;j<camaroes[0].length;j++)
			{
				System.out.println("Insira o valor da linha "+(i+1)+"e da coluna "+(j+1));
				camaroes[i][j] = ler.nextInt();
			}
		}
		
		somaab(tropical, camaroes);
		subab(tropical, camaroes);
	}
	
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		preencher();
		ler.close();
	}

}
