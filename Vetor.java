class Vetor{
	private String name;
	private double[] vector;
	
	public Vetor(String nome, int campo){
		this.name = nome;
		this.vector = new double[campo];
	}
	
	public String getNome(){
		return this.name;
	}
	
	public double getValor(int c) {
		return this.vector[c];
	}
	
	public void setValor(int c, double v) {
		this.vector[c] = v;
	}
	
}
