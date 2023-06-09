package fact.it.zoo.model;
import java.util.ArrayList;


public class Visitor extends Person{
    private String personalCode;
    private Staff staff;
    private int yearOfBirth;
    private ArrayList<String> wishList = new ArrayList<> (5);

    public Visitor(String firstName, String surName) {
        super(firstName, surName);
        this.personalCode = "undefined";
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        if (this.personalCode.equals("undefined")) {
            this.personalCode = personalCode;
        }

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

    public boolean addToWishList(String animal) {
        if (wishList.size()<5){
            wishList.add(animal);
            return true;
        }
        else{
            return false;
        }
    }

    public int getNumberOfWishes (){
        int size = wishList.size();
        return size;
    }

    public String toString(){
        return "Visitor"+" "+super.toString()+ " "+"with personal code"+" "+getPersonalCode();
    }
    public Staff getGuide(){
        return staff;
    }
    public void setStaff(Staff guide){
        this.staff=guide;
    }
}

//Maky Abdykadyrova
//        r0926901