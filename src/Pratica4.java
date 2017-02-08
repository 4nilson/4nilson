import java.util.Scanner;

public class Pratica4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int id1, id2;
		
		System.out.println("Informe a primeira idade: ");
		id1 = read.nextInt();
		System.out.println("Informe a segunda idade: ");
		id2 = read.nextInt();
		
		if(id1>id2){
			System.out.println("A primeira idade é a maior!");
		}else if(id2>id1){
			System.out.println("A segunda idade é a maior!");
		}else{
			System.out.println("As idades são iguais!");
		}
		
	}

}
