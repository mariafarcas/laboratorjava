// Clasa parinte
class ClasaParinte {
    private String nume;
    private int varsta;

    // Constructor care initializează toate câmpurile clasei
    public ClasaParinte(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    // Getter pentru nume
    public String getNume() {
        return nume;
    }

    // Setter pentru nume
    public void setNume(String nume) {
        this.nume = nume;
    }

    // Getter pentru varsta
    public int getVarsta() {
        return varsta;
    }

    // Setter pentru varsta
    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}

// Clasa mostenitoare 1
class ClasaMostenitoare1 extends ClasaParinte {
    private String atributSuplimentar;

    // Constructor care apelează constructorul din clasa parinte
    public ClasaMostenitoare1(String nume, int varsta, String atributSuplimentar) {
        super(nume, varsta);
        this.atributSuplimentar = atributSuplimentar;
    }

    // Getter pentru atributSuplimentar
    public String getAtributSuplimentar() {
        return atributSuplimentar;
    }

    // Setter pentru atributSuplimentar
    public void setAtributSuplimentar(String atributSuplimentar) {
        this.atributSuplimentar = atributSuplimentar;
    }
}

// Clasa mostenitoare 2
class ClasaMostenitoare2 extends ClasaParinte {
    private int altAtribut;

    // Constructor care apelează constructorul din clasa parinte
    public ClasaMostenitoare2(String nume, int varsta, int altAtribut) {
        super(nume, varsta);
        this.altAtribut = altAtribut;
    }

    // Getter pentru altAtribut
    public int getAltAtribut() {
        return altAtribut;
    }

    // Setter pentru altAtribut
    public void setAltAtribut(int altAtribut) {
        this.altAtribut = altAtribut;
    }
}

// Exemplu de utilizare
public class ExempluUtilizare {
    public static void main(String[] args) {
        ClasaMostenitoare1 obiect1 = new ClasaMostenitoare1("John", 25, "Atribut1");
        ClasaMostenitoare2 obiect2 = new ClasaMostenitoare2("Jane", 30, 42);

        // Afisare date
        System.out.println("Obiect 1: " + obiect1.getNume() + ", " + obiect1.getVarsta() + ", " + obiect1.getAtributSuplimentar());
        System.out.println("Obiect 2: " + obiect2.getNume() + ", " + obiect2.getVarsta() + ", " + obiect2.getAltAtribut());
    }
}
