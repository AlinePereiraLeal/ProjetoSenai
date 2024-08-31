package www.SiteSenai.com.br;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages ="www.SiteSenai.com.br")
public class SenaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SenaiApplication.class, args);
	}

}
