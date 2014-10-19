import java.util.Scanner;
	class operacao{
	private Variavel[] vetor;
	private int controle;
	
	    public operacao(){
        controle = 1;
        vetor = new Variavel[1000];
        int i;
        for(i = 1; i < vetor.length; i++){
            vetor[i] = new Variavel();
        }
    }
	
	public void erro(int e){
        switch(e){
			case 0:
                System.out.println("Erro 0: Nome de variáveis ja existe.");
                break;
            case 1:
                System.out.println("Erro 1: Limite de criacao de variaveis atingido");
                break;
            case 2: 
                System.out.println("Erro 2: Erro de sintaxe.");
                break;
            case 3: 
                System.out.println("Erro 3: Variavel a ser imprimida nao existe.");
                break;
            case 4: 
                System.out.println("Erro 4: Sinal de atribuição inválido.");
                break;
            case 5: 
                System.out.println("Erro 5: Atribuição à variável inexistente.");
                break;
            case 6: 
                System.out.println("Erro 6: Atribuição inválida.");
                break;
            case 7: 
                System.out.println("Erro 7: Operação inválida.");
                break;
            case 8: 
                System.out.println("Erro 8: Comparação inválida.");
                break;
        }
        System.exit(1);
    }

	void scan(String var){
        int end = verificaVariavel(var);
        if(end != 0){
            Scanner s = new Scanner(System.in);
            this.vetor[end].setValor(s.nextDouble());
        }
        else erro(5);
    }
	
	
	public void criaVariavel(String a){
        int i;

        if(this.verificaVariavel(a) != 0){ // para criacao de variaveis 
                this.erro(0);
        }
        
        if(controle < this.vetor.length){
            this.vetor[controle].setNome(a);
            this.controle++;
        }
        else this.erro(1);
    }
	

	 public Double getDouble(String operando){
        double numero = 0.0;
        try{
            numero = Double.parseDouble(operando);
            return numero;
        }catch(Exception e){
            this.erro(6);
        }
       return num;
    }
	
	
	public int verificaVariavel(String var){	   
        int i;
        for(i = 1; i < this.controle; i++){
            if(var.equals(this.vetor[i].getNome())){ // controle da variavel 
                return i;
            }
        }
        return 0;
    }
	
	
	
}