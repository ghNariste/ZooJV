package fact.it.zoo.model;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Staff extends Person{
    private LocalDate startDate;
    private boolean student;
    public Staff(String firstName, String surName){
        super(firstName, surName);
    }

        public LocalDate getStartDate() {
        return this.startDate = LocalDate.now();
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = LocalDate.now();
    }

    public boolean isStudent() {
       return student;
    }

    public void setStudent(boolean student) {
        this.student = student;
    }
    public String toString(){
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String myDate;
        startDate = LocalDate.now();
        myDate = startDate.format(dt);
        String newstudent = "(working student)";

        if (this.student == true){
            return "Staff member"+" "+super.toString()+ " "+newstudent+" "+"is employed since"+" "+myDate;
        }
        else {

            return "Staff member"+" "+super.toString()+ " "+"is employed since"+" "+ myDate;

        }
    }
}
//Maky Abdykadyrova
//        r0926901