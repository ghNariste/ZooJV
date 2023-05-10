package fact.it.zoo;

import fact.it.zoo.model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartFolderProjectZooApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartFolderProjectZooApplication.class, args);
		Person myPerson = new Person();
		myPerson.setFirstName("Dean");
		myPerson.setSurName("Don");
		myPerson.toString();
		System.out.println(myPerson.getFirstName());
		System.out.println(myPerson.getSurName());
		System.out.println(myPerson.toString());
		System.exit(0);

	}


}

