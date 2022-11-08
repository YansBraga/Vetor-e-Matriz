import java.util.Scanner;
/*
 * Autor - Yan
 * Objetivo - Ex08
 * Data - 07/11/22
 */
public class Ex008 
{

	public static void linha510(int matriz[][])
	{
		
		System.out.println();
		System.out.println(" -====Início da D====-");
		
		
		for(int i=0;i<matriz.length;i++)
		{
			int aux=matriz[4][i]; //Variável aux recebe linha 5
			matriz[4][i] = matriz[i][9]; //linha 5 recebe coluna 10
			matriz[i][9] = aux; //coluna 10 recebe linha 4 
		}
		
		
		for(int i=0;i<matriz.length;i++)
		{
			for(int j=0;j<matriz[0].length;j++)
			{
				System.out.print(matriz[i][j]);
				System.out.print("  | ");
			}
			
			System.out.println();
		}
		System.out.println(" -====Fim função====-");
		System.out.println();
	}
	
	public static void diagps(int matriz[][])
	{
		System.out.println(" -====Início da C====-");
		for(int i=0, j=matriz.length-1; i<matriz.length;i++, j--)
		{
			int recebe = matriz[i][i];
			
			matriz[i][i] = matriz[i][j];
			matriz[i][j] = recebe;
		}
		
		
		for(int i=0;i<matriz.length;i++)
		{
			for(int k=0;k<matriz[0].length;k++)
			{
				System.out.print(matriz[i][k]);
				System.out.print("  | ");
			}
		
			System.out.println();
		}
		
		System.out.println(" -====Fim função====-");
	}
	
	public static void coluna410(int matriz[][])
	{
		int matrizaux1[][] = new int [10][10]; //variável auxiliar
		
		System.out.println(" -====Início da B====-");
		for(int i=0; i<matrizaux1.length;i++)
		{
			matrizaux1[i][1] = matriz[i][3];
			matrizaux1[i][2] = matriz[i][9];
		}
		
		
		for(int j=0;j<matriz.length;j++)
		{
			matriz[j][9] = matrizaux1[j][1];
			matriz[j][3] = matrizaux1[j][2];
		}
		
		for(int i=0;i<matriz.length;i++)
		{
			for(int j=0;j<matriz[0].length;j++)
			{
				System.out.print(matriz[i][j]);
				System.out.print("  | ");
			}
			
			System.out.println();
		}
		System.out.println(" -====Fim função====-");
		System.out.println();
	}
	
	public static void linha28(int matriz[][])
	{
		int matrizaux[][] = new int [10][10]; //variável auxiliar
		
		System.out.println(" -====Início da A====-");
		
		for(int i=0; i<matrizaux.length;i++)
		{
			matrizaux[1][i] = matriz[1][i];
			matrizaux[2][i] = matriz[7][i];
		}
		
		
		for(int j=0;j<matriz.length;j++)
		{
			matriz[7][j] = matrizaux[1][j];
			matriz[1][j] = matrizaux[2][j];
		}
		
		for(int i=0;i<matriz.length;i++)
		{
			for(int j=0;j<matriz[0].length;j++)
			{
				System.out.print(matriz[i][j]);
				System.out.print("  | ");
			}
		
			System.out.println();
		}
		System.out.println(" -====Fim função====-");
		System.out.println();
	}
	
	public static void preencher()
	{
		Scanner ler = new Scanner(System.in);
		int matriz [][] = new int [10][10];
		
		//Preenche a matriz
		for(int i=0; i<matriz.length;i++)
		{
			for(int j=0; j<matriz[0].length;j++)
			{
				System.out.println("Digite o valor da linha "+(i+1)+" e da coluna " +(j+1));
				matriz[i][j] = ler.nextInt(); 
			}
		}
		//Exibe a matriz antiga
		System.out.println(" -====Matriz antiga====-");
		
		for(int i=0; i<matriz.length;i++)
		{
			for(int j=0; j<matriz[0].length;j++)
			{
				System.out.print(matriz[i][j]);
				System.out.print("  | ");
			}
			System.out.println();
		}
		System.out.println(" -====Fim Matriz====-");
		
		linha28(matriz); //Linha 2 com a linha 8
		coluna410(matriz);//Coluna 4 com a coluna 10
		diagps(matriz); //Diagonal principal com a secundária
		linha510(matriz);//Linha 5 com coluna 10
	}
	
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		preencher();
		ler.close();
	}

}
