package one.digitalinovation.gof.movel;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

public class Cliente {

	/* usamos getters setters*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	@ManyToOne
	private Endereco endereço;
	
	
	public Long getId() {
	
	return id;
}
public void  setId(long id) {
	this.id = id;
}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public void setEndereço(Endereco endereço) {
		this.endereço = endereço;
	}
}
