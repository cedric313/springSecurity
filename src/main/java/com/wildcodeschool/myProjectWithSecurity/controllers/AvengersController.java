package com.wildcodeschool.myProjectWithSecurity.controllers;

import com.wildcodeschool.myProjectWithSecurity.School;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AvengersController  {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to the shield bitch";
    }

    @GetMapping("/avengers/assemble")
    public String avengers() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public ArrayList<School> secret() {
        ArrayList<School> schools = new ArrayList();
        School laloupe = new School("La loupe");
        School orleans = new School("Orleans");
        School bordeaux = new School("Bordeaux");

        schools.add(laloupe);
        schools.add(orleans);
        schools.add(bordeaux);

        return schools;
    }
}
