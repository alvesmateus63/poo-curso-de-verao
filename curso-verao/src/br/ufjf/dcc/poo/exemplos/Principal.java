package br.ufjf.dcc.poo.exemplos;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		
		pessoa1.cpf = "001.543.876-52";
		pessoa1.idade = 18;
		pessoa1.nome = "Afu";
		pessoa1.rg = "MG-6353628";
		pessoa1.sexo = "M";
		
		pessoa2.cpf = "009.756.456-78";
		pessoa2.idade = 35;
		pessoa2.nome = "Xabu";
		
		pessoa3.cpf="098.476.746-93";
		
		Funcionario funcionario1 = new Funcionario();
		
		funcionario1.nome = "Tio da limpeza";
		funcionario1.cargo = "Faxineiro";
		funcionario1.matricula = "202098032";
		
		Aluno aluno = new Aluno();
		
		aluno.nome = "Marqin";
		aluno.curso = "Letras";
		aluno.registro = "20923093201";
		
		Professor prof1= new Professor();
		
		prof1.nome = "Matte";
		prof1.matricula = "2899203910";
		prof1.numAulas = 20;
		
		

	}

}
