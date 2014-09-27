import java.io.File;
import java.util.Scanner;

public class Decifra {
	public static void main(String args[]){
		int i = 0;
		String salvaPalavras[] = new String[2000];
		String salvaTokens[] = new String[4000];
		
		try{
				File arquivoaDecifrar = new File(args[0]);
				Scanner s = new Scanner(arquivoaDecifrar);
			
				while(s.hasNextLine()){
				salvaPalavras[i] = s.nextLine();
				i++;
				}
			}
		}
}
