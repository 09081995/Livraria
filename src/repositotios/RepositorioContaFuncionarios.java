package repositotios;

import classes_Iniciais.Funcionario;

public class RepositorioContaFuncionarios {
	
	
	
	private Funcionario[] repoFuncionario;
	private int numFuncionario;
	
	
	public RepositorioContaFuncionarios(){
		
		Funcionario[] repoFuncionario = new Funcionario[100];
		this.numFuncionario = 0;
		
	}
	
	public void adicionarFuncionario(Funcionario funcionario){
		if(funcionario!= null && this.numFuncionario < repoFuncionario.length){
		this.repoFuncionario[numFuncionario] = funcionario;
		this.numFuncionario++;
		}
	}
	
	public Funcionario buscarFuncionario(double cpf){
	int i;
	Funcionario retorno = null;
		for(i = 0; i < numFuncionario; i++){
			if(this.repoFuncionario[i].getCpf() == cpf){
				retorno = this.repoFuncionario[i];
			}
		}
		return retorno;
	}
	
	public void removerFuncionario(double cpf){
	int i;	
		for(i = 0; i < numFuncionario; i++){
			if(this.repoFuncionario[i].getCpf() == cpf){
			this.repoFuncionario[i] = this.repoFuncionario[numFuncionario-1];
			this.repoFuncionario[numFuncionario-1] = null;
			this.numFuncionario--;
			}
		}
	}
	
	public boolean atualizarFuncionario(double cpf, Funcionario funcionario){
		boolean retorno = false;
		int i;	
		for(i = 0; i < numFuncionario; i++){
			if(this.repoFuncionario[i].getCpf() == cpf){
				this.repoFuncionario[i] = funcionario;
				retorno = true;
			}
		}
		return retorno;
	}
}