package com.planos.appbackend;

import com.planos.appbackend.apis.model.UserModel;
import com.planos.appbackend.apis.model.subModels.UserModelCompany;
import com.planos.appbackend.database.repositories.UserInterface;
import com.planos.appbackend.enums.UserModelGender;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@SpringBootApplication
public class PlanosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlanosApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UserInterface userRepository, MongoTemplate mongoTemplate) {
		return args -> {
			String email = "Mqeqwail@gmail.com";
			UserModelCompany UsersCompany = new UserModelCompany("PPH", "ew90fhw489t", "User", LocalDateTime.now());
			UserModel User = new UserModel("Nathasdan",
					UserModelGender.Female,
					232,
					email,
					"NathanEladfshaw",
					"Passwodsadrd",
					"",
					UsersCompany );

			Query query = new Query();
			query.addCriteria(Criteria.where("email").is(email));

			List<UserModel>  users = mongoTemplate.find(query, UserModel.class);

			if(users.size() > 1){
				throw new IllegalStateException("Found many students with more than one of the same email" + email );
			}

			if (users.isEmpty()) {
				System.out.println("Added");
				userRepository.insert(User);
			} else {
				System.out.println(users + " already exists");
			}
		};
	}

}
