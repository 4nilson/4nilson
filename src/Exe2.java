import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		Scanner leiturinha = new Scanner(System.in);
		int[] A = new int[10];
		int[] B = new int[10];
		int[] C = new int[20];
		int doC = 0;
		String resp = "";
		for(int i=0; i<A.length; i++){
			A[i] = i+1;
			B[i] = 10-(i+1);
		}
		
		for(int i=0; i<B.length; i++){
			C[doC] = A[i];
			doC++;
			C[doC] = B[i];
			doC++;
		}
		resp +="Os valores do vetor A são: \n | ";
		for(int i = 0; i<A.length; i++){
			resp += A[i] + " | ";
		}
		resp +="\nOs valores do vetor B são: \n | ";
		for(int i = 0; i<B.length; i++){
			resp += B[i] + " | ";
		}
		resp +="\nOs valores do vetor C são: \n | ";
		for(int i = 0; i<C.length; i++){
			resp += C[i] + " | ";
		}
		System.out.println(resp);
	}

}
