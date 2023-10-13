package com.planos.appbackend;

import com.planos.appbackend.apis.model.UserModel;
import com.planos.appbackend.apis.model.subModels.UserModelCompany;
import com.planos.appbackend.database.repositories.UserInterface;
import com.planos.appbackend.enums.UserModelGender;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.time.LocalDateTime;

@SpringBootApplication
public class PlanosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlanosApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UserInterface userRepository) {
		return args -> {
			String email = "Mqqeqwail@gmail.com";
			UserModelCompany UsersCompany = new UserModelCompany("PPH", "ew90fhw489t", "User", LocalDateTime.now());
			UserModel User = new UserModel("Nathasdan",
					UserModelGender.Female,
					232,
					email,
					"NathanEladfshaw",
					"Passwodsadrd",
					"",
					UsersCompany );

			userRepository.findUserModelByEmail(email)
					.ifPresentOrElse(s ->System.out.println(s + " Already Exists")
					, ()-> {
						System.out.println("User Added");
						userRepository.insert(User);
			});
		};
	}

}
