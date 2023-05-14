package fact.it.zoo.model;
import java.util.ArrayList;
public class Zoo {
    private String name;
    private int numberVisitors;
    private ArrayList<AnimalWorld> animalWorlds = new ArrayList<> ();

    public Zoo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberVisitors() {
        return numberVisitors;
    }

    public ArrayList<AnimalWorld> getAnimalWorlds(){
        return animalWorlds;
    }
    public int getNumberOfAnimalWorlds() {
        int size = animalWorlds.size();
        return size;
    }
    public void addAnimalWorld(AnimalWorld animalWorld){
        animalWorlds.add(animalWorld);
    }
    public AnimalWorld searchAnimalWorldByName(String name){
        for (AnimalWorld animalWorld : animalWorlds) {
            if (animalWorld.getName().equals(name)) {
                return animalWorld;
            }
        }
        return null;
    }
    public void registerVisitor(Visitor visitor){
        this.numberVisitors++;
        String personalCode = this.name.substring(0, 2) + this.numberVisitors;
        visitor.setPersonalCode(personalCode);
    }

}
//Maky Abdykadyrova
//        r0926901