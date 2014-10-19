class Pilha {
	public int[] vetor;
	public int ponteiro;

	public Pilha(){//construtor
		this.ponteiro=-1;//inicializa a pilha vazia
		this.vetor = new int[300];// pilha de 0 a 299 
	}
	
	public void push(int valor){
		if (this.ponteiro < this.vetor.length-1) {//verifica se ponteiro n passa do tamanho do vetor, caso acontece ha uma exeção
			this.vetor[++ponteiro]=valor;
		}
	}
	
	public int pop(){
		return this.vetor[this.ponteiro--];
	}
}
