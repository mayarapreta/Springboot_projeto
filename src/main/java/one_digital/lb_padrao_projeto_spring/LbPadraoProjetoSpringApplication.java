
package one_digital.lb_padrao_projeto_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*projeto spring boot gerado via spring initializar.
 * os seguintesmodelos foram selecionados:
 * -spring Data JPA
 * -spring web
 * -H2 Database
 * -OpenFeing
 * @mayar
 * */

@EnableFeingClients
@SpringBootApplication
public class LbPadraoProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LbPadraoProjetoSpringApplication.class, args);
	}

}
