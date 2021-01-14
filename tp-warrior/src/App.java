package com.jad;



public class Main {

    public static void main(String[] args) {

       Guerrier conan = new Guerrier("Conan");

       conan.taper(); // Affiche Je suis Conan et je tape comme une buse

        conan.levelUp();

        conan.taper(); // Afficher Je suis Conan et je tape en faisant des moulinés stylés avec mon épée.

        conan.taper("brutal attaque"); // Afficher Je suis Conan et je tape avec mon attaque sépciale BRUTAL ATTACK !!!.

        conan.taper("Berserk attaque"); //  Afficher Je suis Conan et je tape en faisant des moulinés stylés avec mon épée.

        conan.levelUp();

        conan.taper("Berserk attaque"); //  Afficher Je suis Conan et je tape avec mon attaque sépciale BERSERK ATTACK !!!.



        Guerrier. shera = new Guerrier("Shera");

        shera.levelup();

        shera.taper(); // Afficher Je suis Shera et je tape en faisant des moulinés stylés avec mon épée.

    }

}