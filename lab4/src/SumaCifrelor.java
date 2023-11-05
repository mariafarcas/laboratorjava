public class SumaCifrelor {
    public static void main(String[] args) {
        int numar = 254;
        int suma = sumaCifrelor(numar);
        System.out.println("Suma cifrelor este: " + suma);
    }

    public static int sumaCifrelor(int numar) {
        int suma = 0;
        while (numar != 0) {
            suma += numar % 10;
            numar /= 10;
        }
        return suma;
    }
}