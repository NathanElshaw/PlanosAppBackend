package com.planos.appbackend;

import com.planos.appbackend.apis.model.UserModel;
import com.planos.appbackend.apis.model.subModels.UserModelCompany;
import com.planos.appbackend.database.repositories.UserInterface;
import com.planos.appbackend.enums.UserModelGender;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.ZonedDateTime;

@SpringBootApplication
public class PlanosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlanosApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UserInterface userRepository) {
		return args -> {
			UserModelCompany UsersCompany = new UserModelCompany("PPH", "ew90fhw489t", "User", ZonedDateTime.now());
			UserModel User = new UserModel("Nathan",
					UserModelGender.Female,
					23,
					"Mail@gmail.com",
					"NathanElshaw",
					"Password",
					"",
					UsersCompany );

			userRepository.insert(User);
		};
	}

}
