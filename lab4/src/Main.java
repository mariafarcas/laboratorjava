public class Main {
    public static void main(String[] args) {
        String input = "masina";
        String mijloc = afiseazaMijlocul(input);
        System.out.println("Mijlocul cuvantului '" + input + "' este: " + mijloc);
    }

    public static String afiseazaMijlocul(String cuvant) {
        int lungime = cuvant.length();
        if (lungime % 2 == 0) {
            int mijlocStanga = lungime / 2 - 1;
            int mijlocDreapta = lungime / 2 + 1;
            return cuvant.substring(mijlocStanga, mijlocDreapta);
        } else {
            int mijloc = lungime / 2;
            return cuvant.substring(mijloc, mijloc + 1);
        }
    }
}