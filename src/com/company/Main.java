package com.company;

public class Main {

    public static void main(String[] args) {
        Human bobby = new Human();
        Human jane = new Human ((byte) 25,"Jane","Petrova");
        Human Oleg = new Human ((byte) 88,"Oleg","Dibrov", "Basketball");
    }
    public static class Human{
       byte age;
       String name;
       String secondName;
       String favoriteSport;
        Human(){
       }
        Human(byte age, String name, String secondName){
            age = (byte) 33;
            name = "Bob";
            secondName = "Ramba";
        }
        Human(byte age, String name, String secondName, String favoriteSport){
            this(age, name, secondName);
            favoriteSport = "baseball";
        }
    }
}

