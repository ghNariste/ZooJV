package fact.it.zoo.model;
import java.util.ArrayList;


public class Visitor extends Person{
    private String personalCode;
    private int yearOfBirth;
    private ArrayList <String> wishList;

    public Visitor(String firstName, String surName) {
        super(firstName, surName);
    }

//    public Visitor(String firstName, String surName, String personalCode, int yearOfBirth, ArrayList<String> wishList) {
//        this.personalCode = personalCode;
//        this.yearOfBirth = yearOfBirth;
//        this.wishList = wishList;
//        super.getFirstName();
//        super.getSurName();
//    }

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
        return wishList;
    }

    public boolean addToWishlist(String animal) {
        if (wishList.size()<5){
            return true;
        }
        else{
            return false;
        }
    }
    public int getNumberOfWishes (){
        this.wishList = wishList;
        return wishList.size();
    }

    public String toString(){
        return "Visitor"+" "+super.toString()+ " "+"with personal code"+" "+getPersonalCode();
    }
}
//Maky Abdykadyrova
//        r0926901