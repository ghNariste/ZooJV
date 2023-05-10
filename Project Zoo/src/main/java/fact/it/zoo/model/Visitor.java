package fact.it.zoo.model;
import java.util.ArrayList;

public class Visitor {
    private String personalCode;
    private int yearOfBirth;
    private ArrayList<String> wishlist;
    private Person firstName;
    private Person surName;

    public Visitor(String firstName, String surName){
        this.firstName = firstName;
        this.surName = surName;
    }
}
//Maky Abdykadyrova
//        r0926901