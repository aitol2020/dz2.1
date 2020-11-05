package com.company;

public class Dog extends Pet {

    private String breed;
    private String name;
    private String[] commands = {""};

    public Dog() {
    }

    public Dog(String breed, String name, String[] commands, Color color, Shelter shelter) {
        super(color, shelter);
        this.breed = breed;
        this.name = name;
        this.commands = commands;
    }

    public Dog( String[] commands, Color color, Shelter shelter) {
        super(color, shelter);
        this.commands = commands;
    }

    public Dog(String name, String breed, Color color, Shelter shelter) {
        super(color, shelter);
        this.name = name;
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }


    public void makeVoice(String voice, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(voice);

        }
    }

    public void makeVoice(int num, String voice) {
        for (int i = 0; i < num; i++) {
            System.out.println(voice);
        }
    }

    public void makeVoice(String voice) {
        System.out.println(voice);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nname = " + getName() + "" +
                "\nbread = " + getBreed() + "" +
                "\ncommands = " + split_in_string(getCommands()) + "\n}" +
                "\n--------------------------------";
    }

    public static String split_in_string(String[] commands) {
        String words = "";
        for (int i = 0; i < commands.length; i++) {
            words += commands[i] + " ";
        }
        return words;
    }
}

