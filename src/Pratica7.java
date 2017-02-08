import java.util.Scanner;

public class Pratica7 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String[] loucura = new String[10];
		
		
		for(int i=0; i<loucura.length; i++){
			System.out.println("Digite um nome: ");
			loucura[i] = read.nextLine();
		}
		
		for(int j=0; j<loucura.length; j++){
			System.out.println("Nome " + (j+1) + " " + loucura[j]);
			
		}
		
	}

}
