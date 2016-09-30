package repositotios;

import classes_Iniciais.Cliente;



public class RepositorioContasClientes {

	private Cliente[] repoCliente;
	private int numCliente; 



	public  RepositorioContasClientes(){

		Cliente[] repoCliente = new Cliente [100];
		this.numCliente=0;

	}


	public void adicionarClientes(Cliente cliente){
		if(cliente != null && this.numCliente < repoCliente.length){
			this.repoCliente[numCliente] = cliente;
			this.numCliente++;
		}
	}





	public Cliente buscarCliente(double cpf){
		int i;
		Cliente retorno = null;
		for(i = 0; i < numCliente; i++){
			if(this.repoCliente[i].getCpf() == cpf){
				retorno = this.repoCliente[i];
			}
		}
		return retorno;
	}





	public void removerCliente(double cpf){
		int i;	
		for(i = 0; i < numCliente; i++){
			if(this.repoCliente[i].getCpf() == cpf){
				this.repoCliente[i] = this.repoCliente[numCliente-1];
				this.repoCliente[numCliente-1] = null;
				this.numCliente--;
			}
		}
	}





	public boolean atualizarCliente(double cpf, Cliente cliente){
		boolean retorno = false;
		int i;	
		for(i = 0; i < numCliente; i++){
			if(this.repoCliente[i].getCpf() == cpf){
				this.repoCliente[i] = cliente;
				retorno = true;
			}
		}
		return retorno;
	}


}

