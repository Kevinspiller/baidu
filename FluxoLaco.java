class FluxoLaco{


	public int [] array;
	public int [] pointer;

	public FluxoLaco(){

		this.ponteir= -1;
		this.array = new int[300];
	}


	public int pop{

			return this.array[this.pointer--];

	}

	public void push(int v){
		if (this.pointer < this.array.length-1) {//verifica se ponteiro n passa do tamanho do vetor, caso sim, ocorre uma exceção
			this.array[++pointer]=v;
		}
	}


















}