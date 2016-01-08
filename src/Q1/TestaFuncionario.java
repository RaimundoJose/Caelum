package Q1;


public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1=new Funcionario();
		f1.setDataent("10-10-2000");
		f1.setDepart("Informatica");
		f1.setRG("1.379.802/PI");
		f1.setNome("Raimundo RG");
		f1.setSalario(20000.00);
		f1.setBonus(1000.00);
		f1.setSituacao(true);
		
		
		System.out.println("Descreva a situação atual do funcionario  \n"+f1.toString());
		System.out.println("O codigo mostrar exibe os valores dos atributos  \n"+f1.Mostra());
		System.out.println("O nome é:  "+f1.getNome());
	    System.out.println("O salario é:  R$"+f1.getSalario());
      
	}   
}

