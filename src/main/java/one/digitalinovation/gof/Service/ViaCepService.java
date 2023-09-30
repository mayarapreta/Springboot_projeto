package one.digitalinovation.gof.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import one.digitalinovation.gof.movel.Endereco;


@SuppressWarnings("unused")
@FeignClient(name = "Viacep" , url="https://viacep.com.br/ws")
public interface  ViaCepService {
	
@GetMapping("/{cep}/json")

Endereco consultarCep(@PathVariable("cep") String cep);
	//criei um method
	
}
