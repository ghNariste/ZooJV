package fact.it.zoo;

import fact.it.zoo.model.Person;
import fact.it.zoo.model.Visitor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

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

		Visitor myVisitor = new Visitor();
		myVisitor.setYearOfBirth(2003);
		myVisitor.addToWishlist("cat");
		myVisitor.setPersonalCode("avs");
		ArrayList wishList = new ArrayList<>();
		wishList.add("cat");
		wishList.add("cat");
		wishList.add("cat");
		System.out.println(myVisitor.toString());
		System.out.println(myVisitor.getWishlist());
		System.out.println(myVisitor.getNumberOfWishes());
		System.out.println(myVisitor.getYearOfBirth());
		System.out.println(myVisitor.getPersonalCode());

		System.exit(0);

	}


}

