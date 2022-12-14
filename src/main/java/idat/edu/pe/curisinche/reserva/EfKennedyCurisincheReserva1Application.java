package idat.edu.pe.curisinche.reserva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EfKennedyCurisincheReserva1Application {

	public static void main(String[] args) {
		SpringApplication.run(EfKennedyCurisincheReserva1Application.class, args);
	}

}
