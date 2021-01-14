public class App {
    public static void main(String[] args) {

        Guerrier conan = new Guerrier("Conan");

        conan.taper(); // Affiche Je suis Conan et je tape comme une buse

        conan.levelUp();

        conan.taper(); // Afficher Je suis Conan et je tape en faisant des moulinés stylés avec mon épée.

        conan.taper("brutal attaque"); // Afficher Je suis Conan et je tape avec mon attaque sépciale BRUTAL ATTACK !!!.

        conan.taper("Berserk attaque"); //  Afficher Je suis Conan et je tape en faisant des moulinés stylés avec mon épée.

        conan.levelUp();

        conan.taper("Berserk attaque"); //  Afficher Je suis Conan et je tape avec mon attaque sépciale BERSERK ATTACK !!!.

        conan.setWeapon(new Epee());
        
        conan.taper(); // Je suis conan et erùlkgsrùkhlnùr, je tape avec mon epée
    
        conan.setWeapon(new Maudite(conan.getWeapon()));
    
        conan.taper(); // Je suis conan et erùlkgsrùkhlnùr, je tape avec mon epée maudite
    
        conan.setWeapon(new Enflamme(conan.getWeapon()));
    
        conan.taper(); // Je suis conan et erùlkgsrùkhlnùr, je tape avec mon epée maudite enflammée
    
        conan.setWeapon(new QuiBrille(conan.getWeapon()));
    
        conan.taper(); // Je suis conan et erùlkgsrùkhlnùr, je tape avec mon epée maudite enflammée qui brille
    
        conan.levelUp();
    
        conan.taper(); // Je suis conan et truc différent, je tape avec mon epée maudite enflammée qui brille

        Guerrier shera = new Guerrier("Shera");
        
        shera.setWeapon(new Maudite(new Hache()));
    
        shera.taper(); // Je suis Shera et erùlkgsrùkhlnùr, je tape avec mon hache maudite
        }
    }

}