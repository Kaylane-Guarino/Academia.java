package vetor;

public class Vetor {
	
	public static void main(String[] args) {
		
		//Cria��o de um vetor/array
		double[] notas = {7.8,8.4,6.5, 9.2};
		String[] alunos = {
				"Maria",
				"Pedro",
				"Ana",
				"Fabiana", "Fernanda", "Willian"
		};
		
		System.out.println("Notas: " + notas.length);
		System.out.println("Aluno: " + alunos.length);
		
		System.out.println("A nota do 2 bimestre foi: " + notas[2]);
		System.out.println("A nota do 4 bimestre foi: " + notas[3]);
		
		
		//Looping For/While/Do-Until
		
		double soma = ;
		double media = soma/4;
		
		System.out.println("M�dia: " + media(notas));
		
		
//		int x = 3;
		
//		notas[3] = 9.8;
//		notas[4] = 10;
//		notas[x] = 5;
		
//		System.out.println("A nota do 4 bimestre foi: " + notas[3]);
//		System.out.println("A nota da posi��o 5: " + notas[4]);
		
		private static double soma(double[] vetor) {
			double soma = 0;
			
			for (int i = 0; i < vetor .length; i++) {
				soma += notas[i];
			}
			
			double media = soma / vetor .length;
			return soma;
		}
		
	}
	
}
