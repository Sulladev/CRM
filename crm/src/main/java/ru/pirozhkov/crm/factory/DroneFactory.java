package ru.pirozhkov.crm.factory;

public class DroneFactory {
    public Drone create (String typeOfDrone) {
        switch (typeOfDrone) {
            case "Phantom" : return new Phantom();
            case "Mavic" : return new Mavic();
            default: return null;
        }
    }
}
