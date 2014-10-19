class Variaveis{

	public void procuraVariavel(String codigo[],int contLinhas){//procura as variaveis
	
		int i=0, s=0, linhasGuardaVariavel=0, a=0, b=0, volta=0;//contador de linhas do vetor de variaveis
		String verificaPosicao, compara="nada", aux="nada";//string intermediaria que faz manipulação de cada linha do vetor do codigo
		
		Variaveis objVariaveis = new Variaveis();
		ContFluxo objFluxo = new ContFluxo();
		Pilha p = new Pilha();
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

			if(verificaPosicao.contains("RECEBE")){//procura pela palavra de atribuição 
				objOperacoes.verificaOperador(verificaPosicao,guardaVariavel,guardaValores,linhasGuardaVariavel);//verifica o operador
			}
			
			if(verificaPosicao.contains("IMPRIMA(")){//procura pela palavra chave IMPRIMA
				objComandos.verificaSaida(verificaPosicao,guardaVariavel,guardaValores,linhasGuardaVariavel);//verifica e imprime string
			}
 
			 if(verificaPosicao.contains("LEIA(")){//opção de escrita para o usuário
				objComandos.verificaEntrada(verificaPosicao,guardaVariavel,guardaValores,linhasGuardaVariavel);
			}
			
			if (verificaPosicao.contains("SE(")) {//verifica condições
					
				a=i;//se caso não entrar no if a controla o salto
				i = objFluxo.fazCtrFluxo(verificaPosicao,guardaVariavel,guardaValores,linhasGuardaVariavel,i);//ocorrencia do if, manda inclusive qual é a linha em que ele esta
				//se i recebe 0 eh pq o if não eh valido então procuro pelo fim se a partir de i
				
				if(i==-1){
					compara="end;";
					for (a+=1; a<contLinhas; a++) {//procura pelo end
						if(codigo[a].equals(compara)){//encrementa as linhas do código
							i=a;//i recebe um indice anterior ao que deve proceguir incrementa no for e segue o baile
							break;
						}
					}
				}
					
			} else if(verificaPosicao.contains("ENDIF;")) {
				continue;
					
			} else if(verificaPosicao.contains("LACO(")){//controle de laco
				b=i; // b recebe a linha de execução
				i = objFluxo.fazCtrFluxo(verificaPosicao,guardaVariavel,guardaValores,linhasGuardaVariavel,i);//retorna linha do laco onde deve executar
				if(i!=-1){
					volta=i;
					p.push(volta);
				}
				
				if(i==-1){//se caso a condição do while não for verdadeira
					compara="ENDWHILE;";
					for(b+=1; b<contLinhas; b++) {//procura pelo ENDWHILE;
						if(codigo[b].equals(compara)){//encrementa as linhas do código
							i=b;//i recebe um indice anterior ao que deve proceguir incrementa no for e continua
							break;
						}
					}
				}
					
			} else if(verificaPos.contains("ENDWHILE;")) {
				if(p.ponteiro>-1){
					i=p.pop()-1;//menos 1 para que depois do encremento a linha correta seja averiguada
				}
			}	
		}	
	}
}
