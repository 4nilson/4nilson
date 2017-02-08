import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int[] numeros = new int[10];
		int help;
		String resp="";
		for(int i=0; i<numeros.length; i++){
			System.out.println("Insira um numero: ");
			numeros[i] = read.nextInt();
		}
		for(int i=0; i<numeros.length; i++){
			for(int j=0; j<9; j++){
				if(numeros[j]<numeros[j+1]){
					help=numeros[j];
					numeros[j] = numeros[j+1];
					numeros[j+1] = help;
				}
			}
		}
		resp +="A ordem decrescente é: \n | ";
		for(int i=0; i<numeros.length; i++){
			resp+=numeros[i] + " | ";
		}
		System.out.println(resp);
		
	}

}
