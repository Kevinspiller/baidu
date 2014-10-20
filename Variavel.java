class Variavel{

	public void procuraVariavel(String codigo[],int contLinhas){//procura as variaveis
	
		int i=0, s=0, linhasGuardaVariavel=0, a=0, b=0, volta=0;//contador de linhas do vetor de variaveis
		String verificaPosicao, compara="nada", aux="nada";//string intermediaria que faz manipulação de cada linha do vetor do codigo
		
		Variavel objVariaveis = new Variavel();
		Operacoes objOperacoes = new Operacoes();
		Comandos  objComandos = new Comandos();

		String [] guardaVariavel = new String[2000];//VETOR DE VARIAVEIS
		double [] guardaValores = new double[2000];//VALORES DE CADA VARIAVEL
		
		for(i=0;i<contLinhas;i++){//percorre o codigo procurando por variaveis

			verificaPosicao = codigo[i];//a string recebe a linha do vetor de strings
			
			if(verificaPosicao.endsWith("$")){ //identifica que é uma declaração de variavel
				verificaPosicao = verificaPosicao.substring(3);//guarda a partir do terceiro caractere

				guardaVariavel[s]=verificaPosicao.replaceAll("$","");//retira o $ da variavel
				guardaValores[s]=0;//cada variavel recebe 0 inicialmente----------------------------------------verificar se é null a variavel
				s++;
				linhasGuardaVariavel++;
			}

		
			
			if(verificaPosicao.contains("IMPRIMA(")){//procura pela palavra chave IMPRIMA
				objComandos.verificaSaida(verificaPosicao,guardaVariavel,guardaValores,linhasGuardaVariavel);//verifica e imprime string
			}
 			
		}	
	}
}
