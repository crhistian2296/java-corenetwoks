package com.mycompany.holamundo;

import com.mycompany.models.Animal;
import com.mycompany.models.Bird;

public class HolaMundo {
    public HolaMundo() {};

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        final int aux = 23;
//        String word = "maniac";
//        boolean isMan = word.trim()
//                .concat("o")
//                .toUpperCase()
//                .contains("MAN");
        if (args.length > 0) {
            System.out.println(args[0]);
            System.out.println(args[1]);
        }
        Animal horse = new Animal("spirit", "percheron", 400, 1.77, false);
        System.out.println(horse.getName());
        horse.setName("Rocinante");
        System.out.println(horse.getName());

        Bird dove = new Bird("Patri","Tortch", 1, 1, false, true);
        System.out.println(dove);
    }
}
