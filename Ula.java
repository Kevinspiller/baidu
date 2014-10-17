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
 	
}
