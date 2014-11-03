class Operacoes{

	public void verificaOperador(String verificaPosicao, String [] guardaVariavel, double [] guardaValores, int linhasGuardaVariavel){//recebe a linha na qual existe =
		
		String aux, aux2,atribuicao="nada"; //auxiliar de strings
		double auxiliar, auxiliar1, auxiliar3; //recebem valores
		char op=0;
		double res=0;
		int cont_atribui=1,atribu=0;//controle de atribuição, caso nao houver tokens de operações, isso resultara em uma atribuição
		
		aux=verificaPosicao.substring(0, verificaPosicao.indexOf("="));//essa eh a variavel que irá receber o valor ex x=x+y, ela sempre tera a primeira variavel
		Error(guardaVariavel,aux,linhasGuardaVariavel);//verifica se a variavel ja foi declarada

		
	for(int i=0; i<verificaPosicao.length(); i++){//verificando os tokens existentes
			if(verificaPosicao.charAt(i) == '+' || verificaPosicao.charAt(i) == '-' || verificaPosicao.charAt(i) == '*' || verificaPosicao.charAt(i) == '/' || verificaPosicao.charAt(i) == '%'){
				op = verificaPosicao.charAt(i);//atribui o token a op
				cont_atribui=0;
				
			} else if(verificaPosicao.charAt(i) == '='){//atribuicao achada
				atribu=1;
				atribuicao=verificaPosicao.substring(verificaPosicao.indexOf("=")+1, verificaPosicao.indexOf(";"));//variavel depois do = ,aux2 substituido por atribuicao
				//aux tem o anterior ao igual.
				
			} 
			else if(op!=0){//quando op receber um token ai as operações acontecem
				res = Opera(op, verificaPosicao, guardaVariavel, guardaValores, linhasGuardaVariavel);//res recebe o valor que resultou da operação
				
				valorAtual(res, aux, guardaVariavel, guardaValores, linhasGuardaVariavel);//atribui o valor a variavel que esta recebendo
				break;
			} 
		}

		if(cont_atribui==1 && atribu==1 ){
					
					double valor_atribuicao=verGuardaVar2(atribuicao, guardaVariavel, guardaValores, linhasGuardaVariavel);// valor a ser atribuido

					valorAtual(valor_atribuicao, aux, guardaVariavel, guardaValores, linhasGuardaVariavel);//atribui o valor a variavel que esta recebendo

					cont_atribui=1;
					atribu=0;
				}
			}
		
		
		public double verGuardaVar2(String aux2, String [] guardaVariavel, double [] guardaValores, int linhasGuardaVariavel) { //realiza uma atribuiçao caso aux2 seja uma string ou um numero

		double auxiliar=0;//auxiliar de retorno
		int i=0;

		if(aux2.matches("^[0.0-9.9]*|")){//expresão regular para verificar se é um numero
			auxiliar = Double.parseDouble(aux2);//casting de string para double		
		
		} else {
			Error(guardaVariavel,aux2,linhasGuardaVariavel);//Verificaçao de uma variavel ( para saber se ja foi declarada)
			for(i=0; i<linhasGuardaVariavel; i++){
				if(guardaVariavel[i].equals(aux2)){
					auxiliar = guardaValores[i];//auxiliar é um double que recebe o valor da variavel que esta no vetor guarda valores
				}
			}			
		}			
		return auxiliar;//retorna o valor após o = para a operação
	}
	
	public double verGuardaVar3(String aux3, String [] guardaVariavel, double [] guardaValores, int linhasGuardaVariavel) {
	
		double auxiliar=0;
		int i=0;
	
		if(aux3.matches("^[0.0-9.9]*|")){//expressão regular para verificar se é numero
			auxiliar = Double.parseDouble(aux3);//casting de string para double			
		}
		else { //caso seja variavel
			Error(guardaVariavel,aux3,linhasGuardaVariavel);//Verificaçao de uma variavel ( para saber se ja foi declarada)
			for(i=0; i<linhasGuardaVariavel; i++){
				if(guardaVariavel[i].equals(aux3)){
					auxiliar = guardaValores[i];//auxiliar é um double que recebe o valor da variavel que esta no vetor guarda valores
				}	
			}	
		}
			
		return auxiliar;//retorna o valor após o token da operação
	}
	
	
	public void valorAtual(double res, String aux, String [] guardaVariavel, double [] guardaValores, int linhasGuardaVariavel){
		
		for(int i=0; i<linhasGuardaVariavel; i++){

			if(guardaVariavel[i].equals(aux)){//percorre o vetor de variaveis 
				guardaValores[i]= res;//passa o valor calculado para o vetor de valores
				break;
			}
		}
	}
	
	public double Opera(char operando, String verificaPosicao, String [] guardaVariavel, double [] guardaValores, int linhasGuardaVariavel){
			
		double result=0;
		String aux2=verificaPosicao.substring(verificaPosicao.indexOf("=")+1, verificaPosicao.indexOf(operando));//variavel antes do token + - / * %
		String aux3=verificaPosicao.substring(verificaPosicao.indexOf(operando)+1, verificaPosicao.indexOf(";"));//variavel depois do token
		
		
		double auxiliar=verGuardaVar2(aux2, guardaVariavel, guardaValores, linhasGuardaVariavel);//auxiliar recebe o valor após o =
		double auxiliar3=verGuardaVar3(aux3, guardaVariavel, guardaValores, linhasGuardaVariavel);//auxiliar recebe o valor depois do token da operação
		
		if(operando == '+'){
			result=auxiliar+auxiliar3;//Adiçao
		
		} else if(operando == '-'){
			result=auxiliar-auxiliar3;//Subtraçao

		} else if(operando == '*'){
			result=auxiliar*auxiliar3;//Multiplicaçao
		
		} else if(operando == '%'){
			result=auxiliar%auxiliar3;//Modulo
			
		} else if(operando == '/'){
			result=auxiliar/auxiliar3;//Divisao
		} 
		else if(operando == '='){
			result=auxiliar;//novo valor a ser atribuido
		} 
		
		return result; //retorna o resultado da operação
	}	

	public void Error(String [] guardaVariavel,String variavel,int linhasGuardaVariavel){
		int nErro=0,i=0;
		nErro=1;//supoe que não existe a variavel dentro do vetor
		
		for(i=0; i<linhasGuardaVariavel; i++){
			if(guardaVariavel[i].equals(variavel)){//se existe a variavel no vetor de variaveis
				nErro=0;
			}
		}
		if(nErro!=0){
			System.out.println("\nVARIAVEL "+"'"+variavel+"'"+" NAO DECLARADA!\n");
			System.exit(1);
		}
	}
}