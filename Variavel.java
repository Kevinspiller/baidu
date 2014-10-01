public class Variavel {
	
	private String nome;
	private Double valor;

	public Variavel(){
		valor=0.0;
	}
	
	public void setNome(String n){
		this.nome = n;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setValor(Double v){
		this.valor = v;
	}
	
	public Double getValor(){
		return this.valor;
	}
}
