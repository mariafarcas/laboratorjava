// Clasa Animal
class Animal {
    // Metoda eat() pentru a descrie ce mănâncă animalul
    void eat() {
        System.out.println("Animalul mănâncă diverse alimente.");
    }

    // Metoda sound() pentru a descrie sunetul animalului
    void sound() {
        System.out.println("Animalul face un sunet specific.");
    }
}

// Subclasa Lion
class Lion extends Animal {
    // Suprascrierea metodei eat() pentru leu
    @Override
    void eat() {
        System.out.println("Leul mănâncă carne.");
    }

    // Suprascrierea metodei sound() pentru leu
    @Override
    void sound() {
        System.out.println("Rugăciunea leului: Roooaaar!");
    }
}

// Subclasa Tiger
class Tiger extends Animal {
    // Suprascrierea metodei eat() pentru tigru
    @Override
    void eat() {
        System.out.println("Tigrul mănâncă carne și uneori pescuiește.");
    }

    // Suprascrierea metodei sound() pentru tigru
    @Override
    void sound() {
        System.out.println("Răgetul tigrului: Grrrr!");
    }
}

// Subclasa Panther
class Panther extends Animal {
    // Suprascrierea metodei eat() pentru panteră
    @Override
    void eat() {
        System.out.println("Pantera mănâncă carne și se adaptează la diverse prăzi.");
    }

    // Suprascrierea metodei sound() pentru panteră
    @Override
    void sound() {
        System.out.println("Răgetul panterei: Hiss!");
    }
}

// Clasa Main
public class Main {
    public static void main(String[] args) {
        // Crearea unei instanțe pentru fiecare subclasă
        Lion leu = new Lion();
        Tiger tigru = new Tiger();
        Panther pantera = new Panther();

        // Apelarea metodelor pentru fiecare instanță
        System.out.println("Leul:");
        leu.eat();
        leu.sound();

        System.out.println("\nTigrul:");
        tigru.eat();
        tigru.sound();

        System.out.println("\nPantera:");
        pantera.eat();
        pantera.sound();
    }
}
