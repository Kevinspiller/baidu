import java.io.File;
import java.util.Scanner;

public class Decifra {
	public static void main(String args[]){
		int i = 0;
		String guardaPalavras[] = new String[2000];
		String guardaTokens[] = new String[4000];
		
		try{
				File arquivoaDecifrar = new File(args[0]);
				Scanner s = new Scanner(arquivoaDecifrar);
			
				while(s.hasNextLine()){
				
					guardaPalavras[i] = s.nextLine();
					i++;
				
				}
				
				int j = 0;
				String armazena[] = new String[300];
				
				while(guardaPalavras[j]!= null){
					
					int a = 0;
					armazena = guardaPalavras[j].split("\\s");
					
					while(guardaPalavras[a]!= null){
						a++;
					}
					
					int b;
					for(b = 0; b < armazena.length; b++){
						
					
					}
				}
			}
		}
}
