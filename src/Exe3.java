import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		Scanner euLi = new Scanner(System.in);
		
		int[] numsDesordem = new int[10];
		int[] numEmOrdem = new int[10];
		int ver = 0;
		String resp="";
		
		for(int i=0; i<numsDesordem.length; i++){
			System.out.println("Escreva um numero: ");
			numsDesordem[i] = euLi.nextInt();
		}
		
		
		for(int i =0; i<numsDesordem.length; i++){
			for(int j=1; j<numsDesordem.length; j++){
				
				if(numsDesordem[j-1] > numsDesordem[j]){
					ver = numsDesordem[j-1];
					numsDesordem[j-1] = numsDesordem[j];
					numsDesordem[j] = ver;
				}
				
			}
		}
		for(int i=0; i<10;i++){
			numEmOrdem[i]=numsDesordem[i];
		}
		
		resp+="Os números em ordem são: \n";
		for(int i=0; i<numEmOrdem.length; i++){
			resp+= numEmOrdem[i] + " | " ;
		}
		System.out.println(resp);
		
	}

}
