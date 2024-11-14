package controller;

import java.util.ArrayList;

import projeto.model.Model;
import projeto.repository.Clientes_repository;

public class Cliente_controller implements Clientes_repository{
	
	private ArrayList<Model> listaClientes = new ArrayList<Model>();
	int id =0;

	@Override
	public void buscarCadastroPorID(int id) {
		// TODO Auto-generated method stub
		
	}

		@Override
	public void realizarCadastro(Model model) {
		listaClientes.add(model);
		System.out.println("\nO Cadastro do cliente:  " + getCliente() + " foi realizado com sucesso!  ");
		
	}

	@Override
	public void atualizarCadastro(Model model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comprar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}
	
	public int gerarId() {
		return ++ id;
	}

}
