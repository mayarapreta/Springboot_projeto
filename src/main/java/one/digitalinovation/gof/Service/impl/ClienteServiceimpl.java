package one.digitalinovation.gof.Service.impl;

import org.springframework.stereotype.Service;


import one.digitalinovation.gof.Service.clienteService;
import one.digitalinovation.gof.movel.Cliente;


@Service

public  class ClienteServiceimpl implements clienteService {
//Todo singleton: Injetar os componentes do String com @Autowired.
	//Todo Strategy: implementar  os metods definidos na interfacer.
	//Todo Facade:Abstrair integraçoes com subsistemas, provendo uma interface simples.
	
	@Override
	public Iterable<Cliente> buscarTodos(){
		
		return null; 
		
		//fixme busca todos os Clientes
	
	}
	@Override
	public  Cliente buscaPoId(Long Id) {
	 return null;
	//Fixme busca cliente por id 	 
	}
	
	@Override
	public void inserir (Cliente cliente) {
		    return;        
		 //Fixme verficar se o Endereço do Cliente ja existe (pelo cep).
		    //Fixme Caso nao existe , integra cpom o ViaCEP e persistir o retorno.
		    // Fixme Inserir cliente, vínculando o Endereço (novo ou existente).
		    }
	
	@Override
	public void atualizar(Long id, Cliente cliente) {
		//Fixme Busca cliente por id, caso existe.
		//Fixme Verificar se Endereço do cliente ja existe (pelo cep).
		//Fixme Caso não existe , integrar com o ViaCEP e persistir o retorno.
		// Fixme Alterar cliente, víncula o Endereço (novo ou existente). 
		
	}
	@Override
	
	public void deletar(Long id) {
		//Fixme Deletar cliente por id.
	}
	@Override
	public Cliente bucarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
