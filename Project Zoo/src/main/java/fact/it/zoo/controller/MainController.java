package fact.it.zoo.controller;
import java.util.ArrayList;


import fact.it.zoo.model.Visitor;
import fact.it.zoo.model.Person;
import fact.it.zoo.model.Staff;
import fact.it.zoo.model.Zoo;
import fact.it.zoo.model.AnimalWorld;


import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;


@Controller
public class MainController{
    private ArrayList<Staff> staffArrayList;
    private ArrayList<Visitor> visitorArrayList;
    private ArrayList<Zoo> zooArrayList;

//Write your code here
    @RequestMapping("/1_visitor")
    public String visitor(){
    return "1_visitor";
}
    @RequestMapping("/3_staff")
    public String staff(){return "3_staff";}

@RequestMapping("/submitvisitor")
    public String submitvisitor(HttpServletRequest request, Model model){
    String firstName = request.getParameter("name");
    String surName = request.getParameter("surname");
    Person visitor = new Person(firstName, surName);
    model.addAttribute("visitor", visitor);
    return "2_visitorinfo";
}

@RequestMapping("/newstaff")
    public String newstaff(HttpServletRequest request, Model model){
        String firstName = request.getParameter("name");
        String surName = request.getParameter("surname");
        Staff staff = new Staff(firstName, surName);
        boolean isStudent = (request.getParameter("check") !=null);
        model.addAttribute("staff", staff);
        return "4_staffinfo";
    }

//    public MainController() {
//        staffArrayList = new ArrayList<>();
//        visitorArrayList = new ArrayList<>();
//        zooArrayList = new ArrayList<>();
//        fillData(); // Call the new method to fill the arraylists
//    }
//    public ArrayList<Staff> staffMembers = new ArrayList<>();
    public void fillData() {
        staffArrayList = fillStaffMembers();
        visitorArrayList = fillVisitors();
        zooArrayList = fillZoos();
    }

    private ArrayList<Staff> fillStaffMembers() {
        ArrayList<Staff> staffMembers = new ArrayList<>();
        Staff staff1 = new Staff("Johan", "Bertels");
        staff1.setStartDate(LocalDate.of(2002, 5, 1));
        Staff staff2 = new Staff("An", "Van Herck");
        staff2.setStartDate(LocalDate.of(2019, 3, 15));
        staff2.setStudent(true);
        Staff staff3 = new Staff("Bruno", "Coenen");
        staff3.setStartDate(LocalDate.of(1995,1,1));
        Staff staff4 = new Staff("Wout", "Dayaert");
        staff4.setStartDate(LocalDate.of(2002, 12, 15));
        Staff staff5 = new Staff("Louis", "Petit");
        staff5.setStartDate(LocalDate.of(2020, 8, 1));
        staff5.setStudent(true);
        Staff staff6 = new Staff("Jean", "Pinot");
        staff6.setStartDate(LocalDate.of(1999,4,1));
        Staff staff7 = new Staff("Ahmad", "Bezeri");
        staff7.setStartDate(LocalDate.of(2009, 5, 1));
        Staff staff8 = new Staff("Hans", "Volzky");
        staff8.setStartDate(LocalDate.of(2015, 6, 10));
        staff8.setStudent(true);
        Staff staff9 = new Staff("Joachim", "Henau");
        staff9.setStartDate(LocalDate.of(2007,9,18));
        staffMembers.add(staff1);
        staffMembers.add(staff2);
        staffMembers.add(staff3);
        staffMembers.add(staff4);
        staffMembers.add(staff5);
        staffMembers.add(staff6);
        staffMembers.add(staff7);
        staffMembers.add(staff8);
        staffMembers.add(staff9);
        return staffMembers;
    }

    private ArrayList<Visitor> fillVisitors() {
        ArrayList<Visitor> visitors = new ArrayList<>();
        Visitor visitor1 = new Visitor("Dominik", "Mioens");
        visitor1.setYearOfBirth(2001);
        Visitor visitor2 = new Visitor("Zion", "Noops");
        visitor2.setYearOfBirth(1996);
        Visitor visitor3 = new Visitor("Maria", "Bonetta");
        visitor3.setYearOfBirth(1998);
        visitors.add(visitor1);
        visitors.add(visitor2);
        visitors.add(visitor3);
        visitors.get(0).addToWishList("Dolphin");
        visitors.get(0).addToWishList("Snake");
        visitors.get(1).addToWishList("Lion");
        visitors.get(1).addToWishList("Eagle");
        visitors.get(1).addToWishList("Monkey");
        visitors.get(1).addToWishList("Elephant");
        visitors.get(2).addToWishList("Turtle");
        return visitors;
    }

    private ArrayList<Zoo> fillZoos() {
        ArrayList<Zoo> zoos = new ArrayList<>();
        Zoo zoo1 = new Zoo("Antwerp Zoo");
        Zoo zoo2 = new Zoo("Bellewaerde");
        Zoo zoo3 = new Zoo("Plankendael Zoo");
        AnimalWorld animalWorld1 = new AnimalWorld("Aquarium");
        AnimalWorld animalWorld2 = new AnimalWorld("Reptiles");
        AnimalWorld animalWorld3 = new AnimalWorld("Monkeys");
        animalWorld1.setNumberOfAnimals(1250);
        animalWorld2.setNumberOfAnimals(500);
        animalWorld3.setNumberOfAnimals(785);
        animalWorld1.setPhoto("/img/aquarium.jpg");
        animalWorld2.setPhoto("/img/reptiles.jpg");
        animalWorld3.setPhoto("/img/monkeys.jpg");
        animalWorld1.setResponsible(staffArrayList.get(0));
        animalWorld2.setResponsible(staffArrayList.get(1));
        animalWorld3.setResponsible(staffArrayList.get(2));
        zoo1.addAnimalWorld(animalWorld1);
        zoo1.addAnimalWorld(animalWorld2);
        zoo1.addAnimalWorld(animalWorld3);
        zoo2.addAnimalWorld(animalWorld1);
        zoo2.addAnimalWorld(animalWorld2);
        zoo3.addAnimalWorld(animalWorld1);
        zoo3.addAnimalWorld(animalWorld3);
        zoos.add(zoo1);
        zoos.add(zoo2);
        zoos.add(zoo3);
        return zoos;
    }

    public String staffList(Model model){
        ArrayList<Staff> staffMembers = new ArrayList<>();
        Staff staff1 = new Staff("Johan", "Bertels");
        staff1.setStartDate(LocalDate.of(2002, 5, 1));
        Staff staff2 = new Staff("An", "Van Herck");
        staff2.setStartDate(LocalDate.of(2019, 3, 15));
        staff2.setStudent(true);
        Staff staff3 = new Staff("Bruno", "Coenen");
        staff3.setStartDate(LocalDate.of(1995,1,1));
        Staff staff4 = new Staff("Wout", "Dayaert");
        staff4.setStartDate(LocalDate.of(2002, 12, 15));
        Staff staff5 = new Staff("Louis", "Petit");
        staff5.setStartDate(LocalDate.of(2020, 8, 1));
        staff5.setStudent(true);
        Staff staff6 = new Staff("Jean", "Pinot");
        staff6.setStartDate(LocalDate.of(1999,4,1));
        Staff staff7 = new Staff("Ahmad", "Bezeri");
        staff7.setStartDate(LocalDate.of(2009, 5, 1));
        Staff staff8 = new Staff("Hans", "Volzky");
        staff8.setStartDate(LocalDate.of(2015, 6, 10));
        staff8.setStudent(true);
        Staff staff9 = new Staff("Joachim", "Henau");
        staff9.setStartDate(LocalDate.of(2007,9,18));
        staffMembers.add(staff1);
        staffMembers.add(staff2);
        staffMembers.add(staff3);
        staffMembers.add(staff4);
        staffMembers.add(staff5);
        staffMembers.add(staff6);
        staffMembers.add(staff7);
        staffMembers.add(staff8);
        staffMembers.add(staff9);
        return "5_staffList";
    }

}
