public class Tests {
    private static final int N_OF_ITERATIONS = 10000;

    public static void main(String[] args) {
        performTestsDivideByZero();
        performTestsArrayOutOfBounds();
    }

    private static void performTestsDivideByZero() {
        long startTime = System.nanoTime();
        for (int i = 0; i < N_OF_ITERATIONS; i++) {
            testInternalDivideByZero();
        }
        long testInternalDivideByZeroTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < N_OF_ITERATIONS; i++) {
            try {
                testExternalDivideByZero();
            } catch (ArithmeticException e) {
//                System.out.println("przechwycono wyjatek poza metoda");
            }
        }
        long testExternalDivideByZeroTime = System.nanoTime() - startTime;
        System.out.println("\nWyjatek przy dzieleniu przez zero:");
        System.out.println("Nanosekundy przy wykonaniu " + N_OF_ITERATIONS + " iteracji metody generujacej i przechwytujacej wyjatek: " + testInternalDivideByZeroTime);
        System.out.println("Nanosekundy przy wykonaniu " + N_OF_ITERATIONS + " iteracji metody deklarujacej wyjatek i przekazujacej go do kontekstu: " + testExternalDivideByZeroTime);
    }

    private static void performTestsArrayOutOfBounds() {
        long startTime = System.nanoTime();
        for (int i = 0; i < N_OF_ITERATIONS; i++) {
            testInternalArrayOutOfBounds();
        }
        long testInternalArrayTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < N_OF_ITERATIONS; i++) {
            try {
                testExternalArrayOutOfBounds();
            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("przechwycono wyjatek poza metoda");
            }
        }
        long testExternalArrayTime = System.nanoTime() - startTime;
        System.out.println("\nWyjatek przy uzyciu zbyt duzego indeksu tablicy:");
        System.out.println("Nanosekundy przy wykonaniu " + N_OF_ITERATIONS + " iteracji metody generujacej i przechwytujacej wyjatek: " + testInternalArrayTime);
        System.out.println("Nanosekundy przy wykonaniu " + N_OF_ITERATIONS + " iteracji metody deklarujacej wyjatek i przekazujacej go do kontekstu: " + testExternalArrayTime);
    }

    private static void testInternalDivideByZero() {
        try {
            int x = 1 / 0;
        } catch (ArithmeticException e) {
//            System.out.println("przechwycono wyjatek w metodzie: " + e.getMessage());
        }
    }

    private static void testExternalDivideByZero() throws ArithmeticException{
        int x = 1 / 0;
    }

    private static void testInternalArrayOutOfBounds() {
        try {
            int[] tab = new int[10];
            int x = tab[11];
        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("przechwycono wyjatek w metodzie:" + e.getMessage());
        }
    }

    private static void testExternalArrayOutOfBounds() {
        int[] tab = new int[10];
        int x = tab[11];
    }
}
