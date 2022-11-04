import java.util.Scanner;

public class Ex004 
{

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		double arma, maior=0, menor=41, media=0, mediaT=0;
		int dias=0;
		
		double [] vetor = new double [31];
		
		for(int i=0; i<vetor.length;i++)
		{
			System.out.println("Insira a " +(i+1)+ "° temperatura: ");
			arma = ler.nextDouble();
			
			if(arma<=40 && arma >=15)
			{
				vetor[i] = arma;
				
				if(vetor[i] > maior) maior=arma;
				if(vetor[i] < menor) menor=arma;
				
				media+=arma;
			}
			else
			{
				System.out.println("Não houve temperatura com esses valores, insira outro");
				i--;
			}
		}
		mediaT = media/vetor.length;
		
		for(int i=0;i<vetor.length;i++)
		{
			if(vetor[i]<mediaT) dias++;
		}
		
		System.out.println("A menor temperatura foi: " +menor+ " °C");
		System.out.println("A maior temperatura foi: " +maior+ " °C");
		System.out.printf("A média é: %.2f ", mediaT);
		System.out.println("A quantidade de dias com a temperatura abaixo da média é de: " + dias);
		
		ler.close();

	}

}
