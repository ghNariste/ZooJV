package fact.it.zoo;

public class Person {
    private String firstName;
    private String surName;

    public Person(){}
    public Person(String firstName, String surName){
        this.firstName = firstName;
        this.surName = surName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public void setName(String firstName){
        this.firstName = firstName;
    }
    public String getSurName(){
        return this.surName;
    }
    public void setSurName(String surName){
        this.surName = surName;
    }
    public String toString(){
        return surName.toUpperCase() + firstName;
    }

}

//Maky Abdykadyrova
//        r0926901