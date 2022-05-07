package startwoman.java.consultaCepNome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ConsultaCepNomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsultaCepNomeApplication.class, args);
	}

}
