import java.util.Scanner;

public class Ex006 
{

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int [][] triton = new int[4][4];
		int soma =0;
		
		for(int i=0; i<triton.length;i++)
		{
			for(int j=0; j<triton[0].length;j++)
			{
				System.out.println("Digite o numero da linha " + (i+1) + " e da coluna "+(j+1));
				triton[i][j] = ler.nextInt();
			}
		}
		
		for(int i=1;i<triton.length;i++)
		{
			for(int j=0; j <triton[0].length; j++)
			{
				if(i==j)
				{
					soma+=triton[i][j];
				}
			}
		}
		System.out.println(soma);
		
		ler.close();

	}

}
