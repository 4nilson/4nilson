import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");

		double[][] time1 = new double[3][3];
		double[][] time2 = new double[3][3];
		double[][] time3 = new double[3][3];
		double[][] time4 = new double[3][3];
		double[][] time5 = new double[3][3];
		int cont = 0;
		int altura=0;
		int contpor = 0;
		double mediaAlturas = 0, mediaIdades1 = 0, mediaIdades2 = 0;
		double mediaIdades3 = 0, mediaIdades4 = 0, mediaIdades5 = 0, porcentagem = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 0) {
					System.out.println("Entre com as 3 idades do time 1");
					time1[i][j] = read.nextDouble();
				}
				if (i == 1) {
					System.out.println("Entre com os 3 pesos do time 1");
					time1[i][j] = read.nextDouble();
				}
				if (i == 2) {
					System.out.println("Entre com as 3 alturas do time 1");
					time1[i][j] = read.nextDouble();
				}
			}
			for (int j = 0; j < 3; j++) {
				if (i == 0) {
					System.out.println("Entre com as 3 idades do time 2");
					time2[i][j] = read.nextDouble();
				}
				if (i == 1) {
					System.out.println("Entre com os 3 pesos do time 2");
					time2[i][j] = read.nextDouble();
				}
				if (i == 2) {
					System.out.println("Entre com as 3 alturas do time 2");
					time2[i][j] = read.nextDouble();
				}
			}
			for (int j = 0; j < 3; j++) {
				if (i == 0) {
					System.out.println("Entre com as 3 idades do time 3");
					time3[i][j] = read.nextDouble();
				}
				if (i == 1) {
					System.out.println("Entre com os 3 pesos do time 3");
					time3[i][j] = read.nextDouble();
				}
				if (i == 2) {
					System.out.println("Entre com as 3 alturas do time 3");
					time3[i][j] = read.nextDouble();
				}
			}
			for (int j = 0; j < 3; j++) {
				if (i == 0) {
					System.out.println("Entre com as 3 idades do time 4");
					time4[i][j] = read.nextDouble();
				}
				if (i == 1) {
					System.out.println("Entre com os 3 pesos do time 4");
					time4[i][j] = read.nextDouble();
				}
				if (i == 2) {
					System.out.println("Entre com as 3 alturas do time 4");
					time4[i][j] = read.nextDouble();
				}
			}
			for (int j = 0; j < 3; j++) {
				if (i == 0) {
					System.out.println("Entre com as 3 idades do time 5");
					time5[i][j] = read.nextDouble();
				}
				if (i == 1) {
					System.out.println("Entre com os 3 pesos do time 5");
					time5[i][j] = read.nextDouble();
				}
				if (i == 2) {
					System.out.println("Entre com as 3 alturas do time 5");
					time5[i][j] = read.nextDouble();
				}
			}
		}
		for (int i = 0; i < 3; i++) {

			if (time1[0][i] < 18) {
				cont++;
			}
			if (time2[0][i] < 18) {
				cont++;
			}
			if (time3[0][i] < 18) {
				cont++;
			}
			if (time4[0][i] < 18) {
				cont++;
			}
			if (time5[0][i] < 18) {
				cont++;
			}
		}
		System.out.println("A quantidade de jogadores do campeonato" + 
		" com idade inferior a 18 anos é: " + cont);
		for (int i = 0; i < 3; i++) {
			mediaIdades1 += time1[0][i];
			mediaIdades2 += time2[0][i];
			mediaIdades3 += time3[0][i];
			mediaIdades4 += time4[0][i];
			mediaIdades5 += time5[0][i];
		}
		mediaIdades1 = mediaIdades1 / 3;
		mediaIdades2 = mediaIdades2 / 3;
		mediaIdades3 = mediaIdades3 / 3;
		mediaIdades4 = mediaIdades4 / 3;
		mediaIdades5 = mediaIdades5 / 3;
		System.out.println("\nA média das idades do time 1 é: " + df.format(mediaIdades1) + 
				"\nA média das idades do time 2 é: " + df.format(mediaIdades2) + 
				"\nA média das idades do time 3 é: " + df.format(mediaIdades3) + 
				"\nA média das idades do time 4 é: " + df.format(mediaIdades4) + 
				"\nA média das idades do time 5 é: " + df.format(mediaIdades5));
		for(int i=0; i<3 ; i++){
			mediaAlturas += time1[2][i];
			altura++;
			mediaAlturas += time2[2][i];
			altura++;
			mediaAlturas += time3[2][i];
			altura++;
			mediaAlturas += time4[2][i];
			altura++;
			mediaAlturas += time5[2][i];
			altura++;
		}
		mediaAlturas = mediaAlturas/altura;
		System.out.println("\nA média das alturas de todos os jogadores é igual a: " + df.format(mediaAlturas));
		for(int i=0; i<3 ; i++){
			if(time1[1][i]>80){
				porcentagem++;
				contpor++;
			}else{
				contpor++;
			}
			if(time2[1][i]>80){
				porcentagem++;
				contpor++;
			}else{
				contpor++;
			}
			if(time3[1][i]>80){
				porcentagem++;
				contpor++;
			}else{
				contpor++;
			}
			if(time4[1][i]>80){
				porcentagem++;
				contpor++;
			}else{
				contpor++;
			}
			if(time5[1][i]>80){
				porcentagem++;
				contpor++;
			}else{
				contpor++;
			}
		}
		porcentagem = (porcentagem/contpor)*100;
		System.out.println("\nA porcentagem de pessoas com mais de 80kg é igual a: " 
					+ df.format(porcentagem));
	}
}
