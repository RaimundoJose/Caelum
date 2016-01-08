package Q1;


public class Funcionario {
	private String nome;
	
	private String depart;
	private double salario;
	private String dataent;
	private String RG;
	private boolean situacao;
	private double bonus;
	
	
	

	public String toString(){
		
		return "Nome: "+ nome+" Departamento de lotação" + depart +" Salário  "+salario+ " Data da entrada "+dataent+ " RG"+RG+" Siuação na empresa "+situacao+"  Bônus R$"+bonus;
	}
	
	String Mostra(){
		
		return "Nome: "+ nome+" Departamento de lotação" + depart +" Salário  "+salario+ " Data da entrada "+dataent+ " RG"+RG+" Siuação na empresa "+situacao+"  Bônus R$"+bonus ;
		
	}
  
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getDataent() {
		return dataent;
	}
	public void setDataent(String dataent) {
		this.dataent = dataent;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public boolean isSituacao() {
		return situacao;
	}
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	

	

}
