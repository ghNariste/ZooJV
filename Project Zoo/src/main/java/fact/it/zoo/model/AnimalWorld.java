package fact.it.zoo.model;
import fact.it.zoo.model.Staff;
public class AnimalWorld {
    private String name;
    private String photo;
    private int numberOfAnimals;
    public AnimalWorld(){}

    public AnimalWorld(String name) {
        this.name = name;
    }

    public AnimalWorld(int numberOfAnimals) {
        this.numberOfAnimals = numberOfAnimals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getNumberOfAnimals() {
        return numberOfAnimals;
    }

    public void setNumberOfAnimals(int numberOfAnimals) {
        this.numberOfAnimals = numberOfAnimals;
    }

    public Staff getResponsible(){
        Staff resposible = new Staff("", "");
        return resposible;

    }


    public void setResponsible(Staff responsible  ) {
        responsible = new Staff("", "");


    }
}
//Maky Abdykadyrova
//        r0926901
