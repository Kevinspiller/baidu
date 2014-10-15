class Vetor{
	private String name;
	private double[] vector;
	
	public Vetor(String nome, int campo){
		this.name = nome;
		this.vector = new double[campo];
	}
	
	public String getName(){
		return this.nome;
	}
	
	public double getValor(int i) {
		return this.vetor[i];
	}
	
}
