import java.util.Scanner;

public class Ex005 
{

	public static void preencher(int [][]M)
	{
		Scanner ler = new Scanner(System.in);
		int somaT=0, somaln4=0, somacol2=0, somadiagp=0, somadiags=0;
		
		for(int i = 0; i<M[0].length;i++)
		{
			for(int j=0; j<M.length;j++)
			{
				System.out.println("Insira o número da linha " + (i+1) + " e coluna " + (j+1));
				M[i][j] = ler.nextInt();
				
				somaT+=M[i][j];
			}
		}
		
		for(int i=0;i<M.length;i++)
		{
			somaln4+= M[3][i];
		}
		
		for(int i=0;i<M.length;i++)
		{
			somacol2+= M[i][2];
		}
		
		for(int i=0; i<M.length;i++)
		{
			somadiagp+= M[i][i];
		}
		for(int i = 0, j=4;i<M.length;i++)
		{
			somadiags+= M[i][j];
			j--;
		}		
		System.out.println("A soma da diagonal secundária é: " +somadiags);
		System.out.println("A soma da diagonal primária é: " +somadiagp);
		System.out.println("A soma da coluna 2 é: " +somacol2);
		System.out.println("A soma da linha 4 é: " +somaln4);
		System.out.println("A soma da matriz é: " +somaT);
		
	}
	
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int [][] M = new int[5][5];
		preencher(M);
		ler.close();

	}

}
