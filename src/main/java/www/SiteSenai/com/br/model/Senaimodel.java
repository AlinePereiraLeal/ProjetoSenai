package www.SiteSenai.com.br.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@Entity
public class Senaimodel {
	
	
	@Id
	@GeneratedValue
	
	private Long id;
	private String Usuario;
	private double Senha;
	
	
}
