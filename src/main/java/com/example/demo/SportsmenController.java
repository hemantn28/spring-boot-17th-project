package com.example.demo;

import com.example.demo.model.Sportsmen;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class SportsmenController {

    ArrayList<Sportsmen> sportsmenArrayList=new ArrayList<>();

//1. Create => Add

    @RequestMapping("/add_sportsmen")
    public String add(@RequestBody Sportsmen sportsmen){
       // Sportsmen sportsmen=new Sportsmen("Sachin Tendulkar",45,"Cricket","India");


        sportsmenArrayList.add(sportsmen);


        return "sportsmen added successfully";
    }

    //2. Read => Get

    @RequestMapping("/get_sportsmen")
    public ArrayList<Sportsmen> getSportsmenArrayList() {
        return sportsmenArrayList;
    }

    //3.Update

    @RequestMapping("/update_sportsman")
    public String update(){
        sportsmenArrayList.get(0).setName("Venus Williams");

        return "sportsman added successfully";
    }


    //4. Delete

    @RequestMapping("/delete_sportsman")
    public String delete(){
        sportsmenArrayList.remove(1);

        return "sportsman deleted successfully";
    }
}

