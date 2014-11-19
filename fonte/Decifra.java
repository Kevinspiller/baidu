import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

class Decifra {
	
			
		public FileReader arquivoR;//objetos para leitura
		public BufferedReader buffer;
		public int read=0, countLine=0, i=0;
		
		Variavel objVariavel = new Variavel();//objeto das variaveis
		String [] code = new String[4000];//vetor de strings que armazena o codigo a ser tratado
		
		

		public Decifra(File arquivo){//construtor

			try{	//tratamento de erro sobre a read do arquivo
				arquivoR = new FileReader(arquivo); //abre o arquivo
				buffer = new BufferedReader(arquivoR);
				
				while(buffer.ready()){
					code[read]=buffer.readLine();//code recebe o que esta na buffer a cada linha, assim cada posicao do vetor de string tem uma linha
						
					code[read]=code[read].replaceAll("\t","");
					if(code[read].startsWith("IMPRIMA('")){
					} 
					else {
						code[read]=code[read].replaceAll(" ",""); // retira os espacos das strings
					}

					read++;//incremento do vetor
					countLine++;//contador de linhas
				}
				buffer.close();//fecha o arquivo
			}

			catch (FileNotFoundException ex){

			}
			catch (IOException er){

			}

			objVariavel.procuraVariavel(code,countLine);//declaracao de variaveis
		}
}