package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog( new String[]{"voice", "sleep"},Color.YELLOW,new Shelter("HUHU","stenford 19"));
        Dog dog2 = new Dog("hatiko", "akita-inu", Color.WHITE, new Shelter("blabla", "stenford 18"));



        Dog dog3 = new Dog("buldog", "tufuz", new String[]{"sit", "smell", "eat"}, Color.BLACK, new Shelter("GDCHF", "STENFORD17"));



        System.out.println(dog3.getInfo());
        System.out.println(dog2.getInfo());
        System.out.println(dog.getInfo());



        dog.makeVoice("raph",3);
        dog.makeVoice(6, "gaff");
        dog.makeVoice("gaffff", 2);
    }
}
