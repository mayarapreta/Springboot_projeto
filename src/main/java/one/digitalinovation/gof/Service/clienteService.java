package one.digitalinovation.gof.Service;

import one.digitalinovation.gof.movel.Cliente;

/**
 * Interface  que define o padrão <b> Strategy <b> no dominio de cliente. com isso, se necessario, podemos 
 * ter multiplas implementaçoes dessa mesma interface */

public interface clienteService {

	 Iterable <Cliente> buscarTodos(); 
	
	 Cliente bucarPorId(Long id);
	
	public  void inserir(Cliente cliente);
	
	void atualizar(Long id, Cliente cliente);
	
	void deletar(Long id);

	Cliente buscaPoId(Long id);
}
