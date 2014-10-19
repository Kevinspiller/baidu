class Operacoes{

	public void verificaOperador(String verificaPosicao, String [] guardaVariavel, double [] guardaValores, int linhasGuardaVariavel){//recebe a linha na qual existe RECEBE
		
		String aux, aux2,atribuicao="nada"; //auxiliar de strings
		double auxiliar, auxiliar1, auxiliar3; //recebem valores
		char op=0;
		double res=0;
		int cont_atribui=1,atribu=0;//controle de atribuição, se não houver tokens de operações será uma atribuição
		
		aux=verificaPosicao.substring(0, verificaPosicao.indexOf("RECEBE"));//essa eh a variavel que irá receber o valor ex a=a+b ela sempre tera a primeira variavel
		Error(guardaVariavel,aux,linhasGuardaVariavel);//verifica se a variavel ja foi declarada

		
	for(int i=0; i<verificaPosicao.length(); i++){//verificando os tokens existentes
			if(verificaPosicao.charAt(i) == '+' || verificaPosicao.charAt(i) == '-' || verificaPosicao.charAt(i) == '*' || verificaPosicao.charAt(i) == '/' || verificaPosicao.charAt(i) == '%'){
				op = verificaPosicao.charAt(i);//pegou o token
				cont_atribui=0;
				
			} else if(verificaPosicao.charAt(i) == '='){//atribuicao encontrada
				atribu=1;
				atribuicao=verificaPosicao.substring(verificaPosicao.indexOf("=")+1, verificaPosicao.indexOf(";"));//variavel depois do = ,aux2 substituido por atribuicao
				//aux tem o anterior ao igual.
				
			} 
			else if(op!=0){//quando op receber um token ai as operações acontece
				res = Opera(op, verificaPosicao, guardaVariavel, guardaValores, linhasGuardaVariavel);//res recebe o valor que sofreu operação
				
				valorAtual(res, aux, guardaVariavel, guardaValores, linhasGuardaVariavel);//atribui o valor a variavel que esta recebendo
				break;
			} 
		}

		if(cont_atribui==1 && atribu==1 ){
					
					double valor_atribuicao=verGuardaVar2(atribuicao, guardaVar, guardaValores, linhasGuardaVar);// valor a ser atribuido

					valorAtual(valor_atribuicao, aux, guardaVariavel, guardaValores, linhasGuardaVariavel);//atribui o valor a variavel que esta recebendo

					cont_atribui=1;
					atribu=0;
				}
			}
		
		
		public double verGuardaVar2(String aux2, String [] guardaVariavel, double [] guardaValores, int linhasGuardaVariavel) { // verifica se aux2 é uma string ou um número e realiza a atribuição

		double auxiliar=0;//auxiliar de retorno
		int i=0;

		if(aux2.matches("^[0.0-9.9]*#")){//expresão regular para verificar se é numero
			auxiliar = Double.parseDouble(aux2);//casting de string para double		
		
		} else {
			Error(guardaVariavel,aux2,linhasGuardaVariavel);//verifica se a variavel ja foi declarada
			for(i=0; i<linhasGuardaVariavel; i++){
				if(guardaVariavel[i].equals(aux2)){
					auxiliar = guardaValores[i];//auxiliar que é um double recebe o valor da variavel que esta no vetor guarda valores
				}
			}			
		}			
		return auxiliar;//retorna o valor após o = para a operação
	}
	
	public double verGuardaVar3(String aux3, String [] guardaVariavel, double [] guardaValores, int linhasGuardaVariavel) { // igual  o método acima
	
		double auxiliar=0;
		int i=0;
	
		if(aux3.matches("^[0.0-9.9]*#")){//expresão regular para verificar se é numero
			auxiliar = Double.parseDouble(aux3);//casting de string para double			
		}
		else {//se for variavel
			Error(guardaVariavel,aux3,linhasGuardaVariavel);//verifica se a variavel ja foi declarada
			for(i=0; i<linhasGuardaVariavel; i++){
				if(guardaVariavel[i].equals(aux3)){
					auxiliar = guardaValores[i];//auxiliar que é um double recebe o valor da variavel que esta no vetor guarda valores
				}	
			}	
		}
			
		return auxiliar;//retorna o valor após o token da operação
	}
	
	
	public void valorAtual(double res, String aux, String [] guardaVariavel, double [] guardaValores, int linhasGuardaVar){
		
		for(int i=0; i<linhasGuardaVariavel; i++){

			if(guardaVariavel[i].equals(aux)){//percorre o vetor de variaveis, 
				guardaValores[i]= res;//passa o valor calculado para o vetor de valores
				break;
			}
		}
	}
	
	public double Opera(char operando, String verificaPosicao, String [] guardaVariavel, double [] guardaValores, int linhasGuardaVariavel){
			
		double result=0;
		String aux2=verificaPosicao.substring(verificaPosicao.indexOf("=")+1, verificaPosicao.indexOf(operando));//variavel antes do token + ou - / . %
		String aux3=verificaPosicao.substring(verificaPosicao.indexOf(operando)+1, verificaPosicao.indexOf(";"));//variavel depois do token
		
		
		double auxiliar=verGuardaVar2(aux2, guardaVariavel, guardaValores, linhasGuardaVariavel);//auxiliar recebe o valor após o =
		double auxiliar3=verGuardaVar3(aux3, guardaVariavel, guardaValores, linhasGuardaVariavel);//auxiliar recebe o valor depois do token da operação
		
		if(operando == '+'){
			result=auxiliar+auxiliar3;//faz a soma
		
		} else if(operando == '-'){
			result=auxiliar-auxiliar3;//subtrai

		} else if(operando == '*'){
			result=auxiliar*auxiliar3;//multiplica
		
		} else if(operando == '%'){
			result=auxiliar%auxiliar3;//mode
			
		} else if(operando == '/'){
			result=auxiliar/auxiliar3;//divide
		} 
		else if(operando == '='){
			result=auxiliar;//novo valor a ser atribuido
		} 
		
		return result; //retorna o resultado da operação que irá ser atribuido a variavel que recebe
	}	

	public void Error(String [] guardaVariavel,String variavel,int linhasGuardaVariavel){
		int nErro=0,i=0;
		nErro=1;//supoe que não haja a variavel dentro do vetor
		
		for(i=0; i<linhasGuardaVariavel; i++){
			if(guardaVariavel[i].equals(variavel)){//se existe a variavel no vetor de variaveis
				nErro=0;//variavel existente tudo certo
			}
		}
		if(nErro!=0){
			System.out.println("\nVARIAVEL "+"'"+variavel+"'"+" NAO DECLARADA!\n");
			System.exit(1);
		}
	}
}


	
		
		
}