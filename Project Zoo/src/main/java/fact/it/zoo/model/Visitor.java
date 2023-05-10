package fact.it.zoo.model;
import java.util.ArrayList;


public class Visitor {
    private String personalCode;
    private int yearOfBirth;
    private ArrayList<String> wishlist = new ArrayList<> ();
    private Person firstName;
    private Person surName;

    public Visitor(Person firstName, Person surName) {
        this.firstName = firstName;
        this.surName = surName;
    }
    public Visitor() {
        this.personalCode = "undefined";
    }
    public Visitor(String personalCode) {
        this.personalCode = personalCode;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public ArrayList<String> getWishlist() {
        return wishlist;
    }

    public boolean addToWishlist(String animal) {
        if (wishlist.size()<5){
            return true;
        }
        else{
            return false;
        }
    }
    public int getNumberOfWishes (){
        return wishlist.size();
    }

    public String toString(){
        return "Visitor"+" "+super.toString()+ " "+"with personal code"+" "+getPersonalCode();
    }
}
//Maky Abdykadyrova
//        r0926901