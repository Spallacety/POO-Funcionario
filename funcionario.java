import java.util.Scanner;

class Data{
	private int dia;
	private int mes;
	private int ano;

	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public String formatada(){
		return dia+"/"+mes+"/"+ano;
	}
}

class Funcionario{

	// dados do funcionário
	
	private static int contador;
	private int identificador;
	private String nome;
	private String departamento;
	private double salario;
	private Data dataDeEntrada;
	private String rg;
	private boolean estaNaEmpresa;

	// construtores

	public Funcionario(){
		Funcionario.contador = Funcionario.contador + 1;
		this.identificador = this.identificador + Funcionario.contador;
	}

	public Funcionario(String nome){
		this.nome = nome;
		Funcionario.contador = Funcionario.contador + 1;
		this.identificador = this.identificador + Funcionario.contador;
	}

	// getters

	public int getIdentificador(){
		return this.identificador;
	}
	public String getNome(){
		return this.nome;
	}
	public String getDepartamento(){
		return this.departamento;
	}
	public double getSalario(){
		return this.salario;
	}
	public Data getDataDeEntrada(){
		return this.dataDeEntrada;
	}
	public String getRg(){
		return this.rg;
	}
	public boolean getEstaNaEmpresa(){
		return this.estaNaEmpresa;
	}

	// setters

	public void setNome(String nome){
		this.nome = nome;
	}
	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}
	public void setSalario(double salario){
		this.salario = salario;
	}
	public void setDataDeEntrada(Data dataDeEntrada){
		this.dataDeEntrada = dataDeEntrada;
	}
	public void setRg(String rg){
		this.rg = rg;
	}
	public void setEstaNaEmpresa(boolean estaNaEmpresa){
		this.estaNaEmpresa = estaNaEmpresa;
	}

	// outros metodos

	public void recebeAumento(int n){
		salario += n;
	}

	public double getGanhoAnual(){
		return salario*12.0;
	}

	public void mostra(){
		System.out.println("Indentificador: "+getIdentificador());
		System.out.println("Nome: "+getNome());
		System.out.println("Departamento: "+getDepartamento());
		System.out.println("Salario: "+getSalario());
		System.out.println("Data de Entrada: "+getDataDeEntrada().formatada());
	}
}

class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setNome("Danilo");
		f1.setSalario(100);
		f1.setDataDeEntrada(new Data(02,07,2014));

		Funcionario f2 = new Funcionario("Danilo");
		f2.setSalario(100);
		f2.setDataDeEntrada(new Data(02,07,2014));

		Funcionario f3 = f1;

		//Funcionario.salario = 1234;  - dá erro!
		//Funcionario.calculaGanhoAnual;

		if (f1 == f2) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}

		if (f1 == f3) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}

		f1.mostra();
		f2.mostra();
		f3.mostra();
	}
}