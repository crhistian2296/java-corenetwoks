package com.mycompany.holamundo;

import com.mycompany.models.*;

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
        for (String arg : args) {
            System.out.println(arg);
        }

//        Animals
        Bird dove = new Bird("Patri","Tortch", 1, 1, false, true);
        Amphibian triton = new Amphibian("Torsky", "Axolotl", 1, 1, false, "violet");
        Fish nemo = new Fish("Nemo", "clownfish", 1, 1, false, 2);
        Mamal morso = new Mamal("Morso", "Arctic walrus", 1, 1, false, 4);
        Reptile django = new Reptile("Django", "Chameleon", 1, 1, false, true);
        Penguin skiper = new Penguin("Skiper", "Emperator", 1.2, 1.5, false, false, true);
        Phoenix fox = new Phoenix("Fox", "Phoenix", 1.2, 1.5, false, true, true);

//        Printing animals
        System.out.println(dove);
        System.out.println(triton);
        System.out.println(nemo);
        System.out.println(morso);
        System.out.println(django);
        System.out.println(skiper);

        showComer(skiper);
        showComer(fox);
    }

//  Polymorphism
//  all animals and its subclasses have the eat() method
    public static void showComer(Animal animal) {
        animal.eat();
    }
}
