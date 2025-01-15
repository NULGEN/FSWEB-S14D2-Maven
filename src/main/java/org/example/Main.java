package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {

        Lamp lamp = new Lamp(LampType.NEON,true,90);
        Ceiling ceiling= new Ceiling(3, PaintColor.WHITE);
        Bed bed = new Bed("double",2,2,2,2);
        Wall eastWall = new Wall("doğu");
        Wall westWall = new Wall("batı");
        Wall northWall = new Wall("kuzey");
        Wall southWall = new Wall("güney");
        Wall[] walls = new Wall[] {northWall,eastWall,southWall,westWall};

        Bedroom bedroom = new Bedroom(northWall,southWall,eastWall,westWall,ceiling,lamp,new Carpet(1,3,PaintColor.RED),
                            "bedroom1",bed, new Wardrobe(1,2,100));

        bedroom.createBedRoom();

    }
}