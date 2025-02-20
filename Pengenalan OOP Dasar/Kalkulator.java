import java.util.Scanner;

public class Kalkulator {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan angka: ");
            double angka1 = scanner.nextDouble();

            System.out.print("Masukkan operator (+, -, *, /): ");
            String operator = scanner.next();

            System.out.print("Masukkan angka: ");
            double angka2 = scanner.nextDouble();

            double hasil;

            switch (operator) {
                case "+":
                    hasil = angka1 + angka2;
                    break;
                case "-":
                    hasil = angka1 - angka2;
                    break;
                case "*":
                    hasil = angka1 * angka2;
                    break;
                case "/":
                    if (angka2 == 0) {
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                        return;
                    }
                    hasil = angka1 / angka2;
                    break;
                default:
                    System.out.println("Error: Operator salah");
                    return;
            }

            System.out.println("Hasilnya adalah : " + hasil);
        }
    }
}
