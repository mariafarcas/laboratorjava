import java.util.Scanner;

public class VerificarePalindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți un cuvânt: ");
        String cuvant = scanner.nextLine();
        scanner.close();

        cuvant = cuvant.replaceAll("\\s", "").toLowerCase();

        if (estePalindrom(cuvant)) {
            System.out.println(cuvant + " este un palindrom.");
        } else {
            System.out.println(cuvant + " nu este un palindrom.");
        }
    }

    public static boolean estePalindrom(String text) {
        int lungime = text.length();
        for (int i = 0; i < lungime / 2; i++) {
            if (text.charAt(i) != text.charAt(lungime - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}