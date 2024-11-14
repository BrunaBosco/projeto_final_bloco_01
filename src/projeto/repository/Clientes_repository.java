package projeto.repository;

import projeto.model.Model;

public interface Clientes_repository {

    void buscarCadastroPorID(int id);
    void realizarCadastro(Model model);
    void atualizarCadastro(Model model);
    void deletar(int id);

    void comprar(int numero, float valor);

}
