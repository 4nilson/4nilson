import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		Scanner taLendo = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		for(int i=0; i<numeros.length; i++){
			System.out.println("Insira um n�mero: ");
			numeros[i] = taLendo.nextInt();
			for(int j=0; j<i ; j++){
				if(numeros[i] == numeros[j]){
					numeros[i] = 0;
					i--;
					System.out.println("Este n�mero j� foi inserido! \n");
				}
			}
		}
		System.out.println("Os n�meros informados foram: ");
		for(int i =0; i<numeros.length; i++){
			System.out.println(numeros[i]);
		}
	}

}
