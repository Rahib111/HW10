package com.abb;

import com.abb.controller.FamilyController;
import com.abb.enums.Species;
import com.abb.model.Family;
import com.abb.model.Human;
import com.abb.model.Pet;

import java.util.Date;

public class Main
{
    public static void main (String[] args)
    {
        Human human = new Human("Dunay", "Gudratli", "10/12/2022", 45);
        System.out.println(human);
    }

}