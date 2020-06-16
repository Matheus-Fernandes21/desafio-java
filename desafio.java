import java.util.Scanner;

public class desafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int linha1;
		int coluna1;
		int barra =0;
		int coluna2;
		int num=0;
		int linha2=0;
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite a linha: ");
		linha1 =leitor.nextInt();
		
		System.out.println("Digite a coluna: ");
		coluna1 = leitor.nextInt();
		
		
		
		
		
		
		if (linha1 >= 1 && coluna1 >=1 && linha1 <= 8 && coluna1 <= 8) {
			
		}
		
		
		
		for (coluna2 = 1; coluna2 <= 8; coluna2++) {
			
			if (linha1 == barra || coluna1 == coluna2)
				System.out.println("x-x-x-x-x-x-x-x");
			
			else System.out.println("- - - - - - - -");
			
			
		
		
		
		
		}
		
		
		if (coluna1 == coluna2 && linha1 ==linha2)
			System.out.println("x");		
		System.out.println("x");
		System.out.println("x");
		System.out.println("x");
		System.out.println("x");
		System.out.println("x");
		System.out.println("x");
		System.out.println("x");
		
		
	}
		
		
			
		 		
}
		
		
			
		 		
