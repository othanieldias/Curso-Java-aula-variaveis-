package Fundamentos;
// classe - bloco de codigo

public class HelloWord {
	public static void main(String[] args) {
		// metodo de inicializacao
		// metodo ? toda a l?gica da programa??o
		

			
			// Variaveis - ? onde eu armazeno valores
			// Sistema de cadastro de alunos
				
			// String = texto ou caracter especial
			// int = numero inteiro		
			// double = numero fracionado
			// boulean = V ou F
			// float = numeros fracionados
			
			
			String aluno = "airton";
			int serie = 3;
			double alturaAluno = 1.71;
			boolean passoudeAno = false;
			
			//System.out.println(alturaAluno);
			
			// MUTABILIDADE DE VARIAVEIS ( EDITAR VARIAVEIS )
			
			String aluno1;
			
			aluno1 = "othaniel";

			//System.out.println(aluno1);
			
			aluno1 = "alex";

			//System.out.println(aluno1);
			
			
			// VARIAVEIS  X  CONSTANTES
			// Variaveis sofrem multabilidade
			// Constante nao sofre Multabilidade
			
			// Calcule a area da circunferencia
			
			// PI * (RAIO * RAIO)
			
			// Constante
			final double PI = 3.1415;
			
			// Variavel
			double raio = 15.5;
			
			double calculoCircunferencia = PI * (raio *raio);
			
			//System.out.println(calculoCircunferencia);
			
			//INFERENCIA DE TIPOS
			
			
			
		
			// FA?A UM PROGRAMA QUE CALCULE A MEDIA DE UM ALUNO
				// - SABENDO QUE NA ESCOLA TEMOS 4 BIMESTRE
				// - IMPRIMA O VALOR DA MEDIA FINAL.
			
			
			
			String aluno2 = "joao";
			double bimestre1 = 7.58;
			double bimestre2 = 6.5;
			double bimestre3 = 8;
			double bimestre4 = 7.5;
			double calculoNota = (bimestre1 + bimestre2 + bimestre3 + bimestre4) / 4;
					
			System.out.println(" A media final do aluno "  +  aluno2  +" ?: " + calculoNota);
			
			
			
	}
} 
	

