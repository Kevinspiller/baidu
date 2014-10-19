 class Ula {
	 
 	public double Mais(String expressao, double num, double num2){
 		double resultado = 0.0;
 		expressao = expressao.trim();
 		if(expressao.equals("MAIS")){
 			resultado = num+num2;
 			return resultado;
 		}
 		else{
 			System.out.println("Erro: expressao invalida");
 			return 0;
 		}
 	}
 	
 	public double Menos(String expressao, double num, double num2){
 		double resultado = 0.0;
 		expressao = expressao.trim();
 		if(expressao.equals("MENOS")){
 			resultado = num - num2;
 			return resultado;
 		}
 		else{
 			System.out.println("Erro: expressao invalida");
 			return 0;
 		}
 	}
 	
 	public double Multiplicacao(String expressao, double num, double num2){
 		double resultado = 0.0;
 		expressao = expressao.trim();
 		if(expressao.equals("MULT")){
 			resultado = num * num2;
 			return resultado;
 		}
 		else{
 			System.out.println("Erro: expressao invalida");
 			return 0;
 		}
 	}
 	
 	public double Divisao(String expressao, double num, double num2){
 		double resultado = 0.0;
 		expressao = expressao.trim();
 		if(expressao.equals("DIV")){
 			resultado = num / num2;
 			return resultado;
 		}
 		else{
 			System.out.println("Erro: expressao invalida");
 			return 0;
 		}
 	}
 	
	public boolean Maior(String expressao, double num, double num2){
		boolean resultado = false; //inicializado como falso, ou seja, caso nao entre no if sempre sera falso
		expressao = expressao.trim();
		if(expressao.equals("MAIOR")){
			if(num>num2){
				resultado = true;
			}
		}
		return resultado;
 	}
	
	public boolean Menor(String expressao, double num, double num2){
		boolean resultado = false;
		expressao = expressao.trim();
		if(expressao.equals("MENOR")){
			if(num<num2){
				resultado = true;
			}
		}
		return resultado;
	}
	
	public boolean MaiorIgual(String expressao, double num, double num2){
		boolean resultado = false;
		expressao = expressao.trim();
		if(expressao.equals("MAIORIGUAL")){
			if(num >= num2){
				resultado = true;
			}
		}
		return resultado;
	}
	
	public boolean MenorIgual(String expressao, double num, double num2){
		boolean resultado = false;
		expressao = expressao.trim();
		if(expressao.equals("MENORIGUAL")){
			if(num <= num2){
				resultado = true;
			}
		}
		return resultado;
	}
	
	public boolean Igual(String expressao, double num, double num2){
		boolean resultado = false;
		expressao = expressao.trim();
		if(expressao.equals("IGUAL")){
			if(num == num2){
				resultado = true;
			}
		}
		return resultado;
	}
	
	public boolean Diferente(String expressao, double num, double num2){
		boolean resultado = false;
		expressao = expressao.trim();
		if(expressao.equals("DIF")){
			if(num != num2){
				resultado = true;
			}
		}
		return resultado;
	}
}
