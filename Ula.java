 class Ula {
	 
 	public double soma(String expressao, double num, double num2){
 		double resultado = 0.0;
 		expressao = expressao.trim();
 		if(expressao.equals("soma")){
 			resultado = num+num2;
 			return resultado;
 		}
 		else{
 			System.out.println("Erro: expressao invalida");
 			return 0;
 		}
 	}
 	
 	public double subtracao(String expressao, double num, double num2){
 		double resultado = 0.0;
 		expressao = expressao.trim();
 		if(expressao.equals("sub")){
 			resultado = num - num2;
 			return resultado;
 		}
 		else{
 			System.out.println("Erro: expressao invalida");
 			return 0;
 		}
 	}
 	
 	public double multiplicacao(String expressao, double num, double num2){
 		double resultado = 0.0;
 		expressao = expressao.trim();
 		if(expressao.equals("mult")){
 			resultado = num * num2;
 			return resultado;
 		}
 		else{
 			System.out.println("Erro: expressao invalida");
 			return 0;
 		}
 	}
 	
 	public double divisao(String expressao, double num, double num2){
 		double resultado = 0.0;
 		expressao = expressao.trim();
 		if(expressao.equals("div")){
 			resultado = num / num2;
 			return resultado;
 		}
 		else{
 			System.out.println("Erro: expressao invalida");
 			return 0;
 		}
 	}
 	
	public boolean maior(String expressao, double num, double num2){
		boolean resultado = false; //inicializado como falso, ou seja, caso nao entre no if sempre sera falso
		expressao = expressao.trim();
		if(expressao.equals("maior")){
			if(num>num2){
				resultado = true;
			}
		}
		return resultado;
 	}
	
	public boolean menor(String expressao, double num, double num2){
		boolean resultado = false;
		expressao = expressao.trim();
		if(expressao.equals("menor")){
			if(num<num2){
				resultado = true;
			}
		}
		return resultado;
	}
	
	public boolean maiorIgual(String expressao, double num, double num2){
		boolean resultado = false;
		expressao = expressao.trim();
		if(expressao.equals("maiorigual")){
			if(num >= num2){
				resultado = true;
			}
		}
		return resultado;
	}
	
	public boolean menorIgual(String expressao, double num, double num2){
		boolean resultado = false;
		expressao = expressao.trim();
		if(expressao.equals("menorigual")){
			if(num <= num2){
				resultado = true;
			}
		}
		return resultado;
	}
	
	public boolean igual(String expressao, double num, double num2){
		boolean resultado = false;
		expressao = expressao.trim();
		if(expressao.equals("igual")){
			if(num == num2){
				resultado = true;
			}
		}
		return resultado;
	}
	
	
 	
}
