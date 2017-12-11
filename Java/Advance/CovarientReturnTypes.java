/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_code;

import java.util.*;

/**
 *
 * @author Created by Mir00r
 */
class Flower {

    public String whatsYourName() {
        return "I have many names and types.";
    }
}

class Jasmine extends Flower {

    public Jasmine() {
        super();
    }

    public String whatsYourName() {
        return "Jasmine";
    }
}

class Lily extends Flower {

    public Lily() {
        super();
    }

    public String whatsYourName() {
        return "Lily";
    }
}

class Lotus extends Flower {

    public Lotus() {
        super();
    }

    public String whatsYourName() {
        return "Lotus";
    }
}

class State {

    public Flower yourNationalFlower() {
        return new Flower();
    }
}

class WestBengal extends State {

    public WestBengal() {
        super();
    }

    public Jasmine yourNationalFlower() {
        return new Jasmine();
    }
}

class Karnataka extends State {

    public Karnataka() {
        super();
    }

    public Lotus yourNationalFlower() {
        return new Lotus();
    }
}

class AndhraPradesh extends State {

    public AndhraPradesh() {
        super();
    }

    public Lily yourNationalFlower() {
        return new Lily();
    }
}

public class Practice {

    public static void main(String[] args) throws ClassNotFoundException {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        Class c = Class.forName(str);
        System.out.println(c.getName());

//            AndhraPradesh ap = new AndhraPradesh();
//            System.out.println(ap.yourNationalFlower().whatsYourName());
    }
}
