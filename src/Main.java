import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        Konto[] bank = new Konto[n];
        Random random = new Random();
        for (int i = 0; i < bank.length; i++) {
            int losowyNumerKonta = random.nextInt(100000);
            double losoweSaldo = Math.floor(random.nextDouble() * 10000)/100;
            bank[i] = new Konto(losowyNumerKonta, losoweSaldo);
        }

        wyswietlKonta(bank);

        System.out.println("\nkonto z najwyzszym saldem:");
        najwyzszeSaldo(bank).getStan();
    }

    public static void wyswietlKonta(Konto[] bank) {
        for (int i = 0; i < bank.length; i++) {
            bank[i].getStan();
        }
    }

    public static Konto najwyzszeSaldo(Konto[] bank) {
        Konto kontoNajwyzszeSaldo = null;
        for (int i = 0; i < bank.length; i++) {
            if (kontoNajwyzszeSaldo == null) {
                kontoNajwyzszeSaldo = bank[i];
            } else {
                if (bank[i].getSaldo() > kontoNajwyzszeSaldo.getSaldo()) {
                    kontoNajwyzszeSaldo = bank[i];
                }
            }
        }
        return kontoNajwyzszeSaldo;
    }
}
