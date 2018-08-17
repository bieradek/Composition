package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        // the goal is to build a PC with all the components, therefore we're first creating objects of the components
        Case theCase = new Case("220B", "Dell", "240", new Dimensions(40, 60, 30));
        Motherboard theMotherboard = new Motherboard("520Z", "Asus", 2, 2, "V2");
        Monitor theMonitor = new Monitor("P25ASZ", "Dell", 25, new Resolution(1920, 1080));
        PC pc = new PC(theCase, theMonitor, theMotherboard);
        // one way of accessing other classes' methods
        pc.getMonitor().drawPixelAt(50, 20, "blue");
        pc.getMotherboard().loadProgram("Windows");
        pc.getTheCase().pressPowerButton();
    }
}
